let noteList=[];

let view="grid"; //default view is grid-view

function saveNote(event){
    event.preventDefault();
    let note = {
        title: document.getElementById('note-title').value,
        content: document.getElementById('note-content').value
    }
    fetch('http://localhost:3001/notes',{
        method:'POST',
        body:JSON.stringify(note),
        headers: {
            'Content-Type': 'application/json'
          },
    })
    .then(response=>response.json())
    .then(data=>{
        console.log(data)
        noteList.push(data);
        console.log('Note Saved')
        updateNoteData(data);
        clearFields();
    })
}

let $deleteNote = function deleteNote(event){
    event.preventDefault();
    console.log('Deleting Note....with id',this);
    fetch(`http://localhost:3001/notes/${this}`,{
        method:'DELETE',
    })
    .then(response=>response.json())
    .then(data=>{
        console.log('Note Deleted')
        let noteIndex = noteList.findIndex(note=>note.id==this);
        noteList.splice(noteIndex,1);
        loadNoteData();
    })
    .catch(err=>{
        console.log(err)
    })
}

function clearFields(){
    document.getElementById('note-title').value = '';
    document.getElementById('note-content').value = '';
}

function fetchNotes(){
    
    console.log('fetching Notes....');
    // for(let i = 1; i <= 9000000000; i++){} //sequential exec, blocking the exec
    // setTimeout(()=>{                     //async exec, non-blocking exec pattern
        fetch('http://localhost:3001/notes')
        .then(response=>response.json())
        .then(data=>{
            noteList = data;
            loadNoteData();
        })
        .catch(err=>{
            console.log(err)
        })
    // },10000)
   
}

function loadNoteData(){
    let containerDiv = document.getElementById('note-container');
    containerDiv.innerHTML = '';
    noteList.forEach(note=>{
        console.log(note.title)
        createNoteCard(note);
    })

}

function updateNoteData(note){
    createNoteCard(note);
}

function createNoteCard(note){
    let containerDiv = document.getElementById('note-container');
    let cardDiv = document.createElement('div');
    cardDiv.classList.add('card','m-auto','my-3');
    
    if(view ==='grid')
        cardDiv.setAttribute('style',"width: 18rem");
    else if(view === 'list')
        cardDiv.setAttribute('style',"width: 48rem");
    containerDiv.appendChild(cardDiv);
    let cardBody = document.createElement('div');
    cardBody.classList.add('card-body');
    cardDiv.appendChild(cardBody);
    let cardTitle = document.createElement('h5');
    cardTitle.classList.add('card-title');
    cardTitle.innerText = note.title;
    let cardText = document.createElement('p');
    cardText.classList.add('card-text');
    cardText.innerText = note.content;
    cardBody.appendChild(cardTitle);
    cardBody.appendChild(cardText);
    let deleteLink = document.createElement('a');
    deleteLink.setAttribute('href',"#");
    deleteLink.classList.add('btn','btn-primary'); 
    console.log(note.id)
    deleteLink.addEventListener('click',$deleteNote.bind(note.id),{
        passive: false
    });
    deleteLink.innerText = "Delete";
    cardBody.appendChild(deleteLink);
}

function toggleView(){
    view = view === 'grid'?'list':'grid';
    // console.log('toggling View')
    let containerDiv = document.getElementById('note-container');
    let cardDivs = containerDiv.getElementsByTagName('div');
    [...cardDivs].forEach(cardDiv=>{
        cardDiv.removeAttribute('style');
        if(view === 'list')
            cardDiv.setAttribute('style',"width: 48rem");
        else
            cardDiv.setAttribute('style',"width: 18rem");
    })
}

/* <div class="card me-auto my-3" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Note Title</h5>
                <p class="card-text">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Accusamus veniam culpa corrupti voluptas fuga itaque at eum nihil facilis expedita maxime, numquam alias, incidunt sint fugit rem molestias illum. Unde!</p>
                <a href="#" class="btn btn-primary" onClick="deleteNote(event)">Delete</a>
            </div>
        </div> */