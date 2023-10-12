const gridViewWidth = '25%';
const gridViewStr = "grid";
const listViewStr = "list";

let noteList = [];

let view = "grid"; //default view is grid-view
const noteContainer = document.getElementById("note-container");
const form = document.getElementById("noteForm");
const todoURL = "http://localhost:3000/todos";

function createCard(noteData) {
    let cardElement = document.createElement("div");
    cardElement.classList.add("card");

    let noteHeadElement = document.createElement("h3");
    noteHeadElement.textContent = noteData.noteTitle;

    let contentElement = document.createElement("p");
    contentElement.textContent = noteData.noteContent;

    let deleteButtonElement = document.createElement("button");
    deleteButtonElement.classList.add("btn", "btn-primary", "deleteButton");
    deleteButtonElement.textContent = "Delete";
    deleteButtonElement.addEventListener("click", event => {
        if (confirm(`!! DELETE !!\n Are you sure you want to delete note \"${noteData.noteTitle}\"?`)) {
            deleteNote(noteData.noteId);
        }
    })

    cardElement.appendChild(noteHeadElement);
    cardElement.appendChild(contentElement);
    cardElement.appendChild(deleteButtonElement);

    return cardElement;
}

//task-1 : add note
function saveNote(event) {

    event.preventDefault();

    //populate note object with data from HTML
    let formData = new FormData(event.target);
    const note = Object.fromEntries(formData);
    if (noteList.find(item => item.noteId === note.noteId)) {
        alert("!!! ERROR !!!\nAnother note with the same ID exists!\nPlease enter a unique ID.");
    }
    else {
        console.log(`Adding note:`);
        console.log(note);

        // call saveNoteToServer() with note data to persist note to the server
        let postPromise = saveNoteToServer(note);
        postPromise.then(() => {
            displayNotesFromArray();
        })
        form.reset()
    }
}
function saveNoteToServer(note) {
    // use axios to make HTTP POST request to save note to server
    const postPromise = axios.post(todoURL, note);
    postPromise
        .then(response => {
            console.log(`Note: [${note.noteId}:${note.noteTitle}] Response: [Status:${response.status} Message:${response.statusText}]`);
            // the saved note should also be pushed to noteList array and displayed on the web page    
            noteList.push(response.data);
        })
        .catch(error => {
            let msg = `POST failed for [URL:${todoURL}]!`
            alert(msg);
            console.log(msg);
            console.log(error);
        });

    return postPromise;
}
function displayNotesFromArray() {
    console.log("Displaying notes from array.")
    let width = gridViewWidth;
    if (view !== gridViewStr) {
        width = '100%';
    }
    noteContainer.replaceChildren();
    for (noteData of noteList) {
        let cardElement = createCard(noteData);
        cardElement.style.width = width;

        noteContainer.appendChild(cardElement);
    }
}
//task-2 : display notes
function displayNotes() {
    // call fetchNotesFromServer() to fetch notes from server and display the notes
    let promise = fetchNotesFromServer();
    promise.then(() => {
        displayNotesFromArray();
    })
}

function fetchNotesFromServer() {
    // use axios to make HTTP GET request to fetch notes from server
    const getPromise = axios.get(todoURL);
    getPromise
        .then(response => {
            console.log(`Response: [Status:${response.status} Message:${response.statusText}] Notes: [Count:${response.data.length}]`);
            
            // the fetched notes should also be pushed to the noteList array and displayed on the web page
            console.log("Refreshing note cache...")
            noteList = [];
            noteList.push(...response.data);
        })
        .catch(error => {
            let msg = `GET failed for [URL:${todoURL}]!`
            alert(msg);
            console.log(msg);
            console.log(error);
        });

    return getPromise;
}

//task-3 : delete note
function deleteNote(noteId) {
    let deleteElement = noteList.find(data => data.noteId === noteId);
    let deleteUrl = `${todoURL}/${deleteElement.id}`;
    let deletePromise = axios.delete(deleteUrl);
    deletePromise.then(response => {
        console.log(`Delete request successful. Note: [${deleteElement.noteId}:${deleteElement.noteTitle}] Response: [Status:${response.status} Message:${response.statusText}]`);
    })
        .then(() => {
            let indexOfDeleteElement = noteList.indexOf(deleteElement);
            noteList.splice(indexOfDeleteElement, 1);
            console.log(`Deleted note ID:${noteId}`);
            displayNotesFromArray();
        })
        .catch(error => {
            let msg = `Delete failed for [URL:${deleteUrl}] !`
            alert(msg);
            console.log(msg);
            console.log(error);
        });
}

//task-4 : toggle note view
function toggleView() {
    console.log("Toggle clicked.")
    view = view === gridViewStr ? listViewStr : gridViewStr;
    displayNotesFromArray();
}

//do not delete the code given below, it is written to make export the functions to be tested
// module.exports = {
//     saveNote,
//     displayNotes,
//     deleteNote,
//     toggleView,
//     saveNoteToServer,
//     fetchNotesFromServer
// }
