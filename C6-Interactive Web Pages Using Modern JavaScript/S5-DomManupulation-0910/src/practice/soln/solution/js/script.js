const gridViewWidth = '25%';
const gridViewStr = "grid";
const listViewStr = "list";

let view = gridViewStr; //default view is grid-view
let noteList = [];

const form = document.getElementById("entryForm")
const noteContainer = document.getElementById("note-container");

function findIdDuplicate(enteredId) {
    return noteList.find(note => note.noteId === enteredId);
}

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

//task-1 : define function `saveNote()` to add note
function saveNote(noteObj) {
    console.log(`Adding note:`);
    console.log(noteObj);
    noteList.push(noteObj);
    form.reset();
    alert(`Note added successfully!\nID: ${noteObj.noteId}\nTitle: ${noteObj.noteTitle}`);
    displayNotes();
}

//task-2 : define function `displayNotes()` to display all notes
function displayNotes() {
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


//task-3 : delete note - This task is Optional
function deleteNote(noteId) {
    let deleteElement = noteList.find(data => data.noteId === noteId);
    let indexOfDeleteElement = noteList.indexOf(deleteElement);
    noteList.splice(indexOfDeleteElement, 1);
    console.log(`Deleted note ID:${noteId}`);
    displayNotes();
}

//task-4 : toggle note view - This task is Optional
function toggleView() {
    view = view === gridViewStr ? listViewStr : gridViewStr;
    displayNotes();
}

//displayNotes();
form.addEventListener('submit', event => {
    event.preventDefault();
    let formData = new FormData(form);
    let noteObj = Object.fromEntries(formData)
    if (findIdDuplicate(noteObj.noteId)) {
        alert("!!! ERROR !!!\nAnother note with the same ID exists!\nPlease enter a unique ID.");
    }
    else {
        saveNote(noteObj);
    }
})
// do not delete the code given below, it is written to export the functions to be tested
// module.exports = {
//     saveNote,
//     displayNotes,
//     deleteNote,
//     toggleView
// }
