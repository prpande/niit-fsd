let noteList = [];

let view = "grid"; //default view is grid-view

const todoURL = "http://localhost:3000/todos";

//task-1 : add note
function saveNote() {
    
    const note = null;
    //populate note object with data from HTML

    // call saveNoteToServer() with note data to persist note to the server
    saveNoteToServer(note);
}


function saveNoteToServer(note) {
    // use axios to make HTTP POST request to save note to server
    // the saved note should also be pushed to noteList array and displayed on the web page
}

//task-2 : display notes
function displayNotes() {
    // call fetchNotesFromServer() to fetch notes from server and display the notes
    fetchNotesFromServer();    
} 

function fetchNotesFromServer() {
     // use axios to make HTTP GET request to fetch notes from server
    // the fetched notes should also be pushed to the noteList array and displayed on the web page
}

//task-3 : delete note
function deleteNote() {
    
}
 
//task-4 : toggle note view
function toggleView() {
    
}

//do not delete the code given below, it is written to make export the functions to be tested
module.exports = {
    saveNote,
    displayNotes,
    deleteNote,
    toggleView,
    saveNoteToServer,
    fetchNotesFromServer
}
