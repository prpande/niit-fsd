//Code Snippet - 1 Block Scope  and function scope of variables 
//Print numbers from 1-100 except multiples of 3
function compute() {
    //num1 is in function scope
    let num1 = 100;
    //Variable i is in block scope​
    for (i = 1; i <= num1; i++) {
        if (i % 3 == 0)
            continue;
        else
            console.log(`${i}`);
    }
    // num1 can be used, but variable i cannot be used here​
    console.log(`completed the looping till ${num1} times`)
}
compute();


//Code Snippet -2 Global scope of a varaible

// The following variables are defined in the global scope
var num1 = 20,
    num2 = 3,
    stu_name = 'Paul';

//First global function uses global variables to calculate the multiplication result
function multiply() {
    return num1 * num2;
}

console.log(`Multiplication result is ${multiply()}`); // Returns 60

// Second global function which returns the student name and the total score 
function getScore() {
    // num1 and num2 local variables overwrites the global variables
    var num1 = 30,
        num2 = 50,
        age = 14;
        //access the global variable stu_name
    return `${stu_name} whose age is  ${age} scored  ${num1 + num2}`;
}

console.log(getScore()); // Returns "Paul whose age is 14 scored 80"

//age variable is local to getScore() function and cannot be accessed outside
console.log(`Age is ${age}`); //Throws Uncaught Error: Age is not defined


