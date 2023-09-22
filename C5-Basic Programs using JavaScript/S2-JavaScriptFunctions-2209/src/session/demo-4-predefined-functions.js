//Code snippet-1 alert() function

function display(){
    alert("Welcome to javascript prefefined functions");
}

display();

//Code snippet-2 prompt() function

function getValue(){
    prompt("Enter your name","Paul");
}

getValue();

//Code snippet-3 confirm() function

function confirmDelete(){
    confirm("Do you really want to delete?");
}

confirmDelete();

//Code Snippet-4 Predefined functions 
function checkValidName() {
    var name = prompt("Enter your name");
    // Check whether the name is not a number 
    if (isNaN(name)) {
        do {
            var boolean = confirm("Do you want to change the name?");
            if (!boolean) {
                alert(`welcome ${name}`);
            }
            else{
            name = prompt("Enter your name");
            }
        }while(boolean)
    }
    else{
        alert("Invalid name");
    } 
}

checkValidName();