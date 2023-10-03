// Code Snippet-1 Find area of a rectangle using Function expressions
const area = function (length, breadth) {
    return length * breadth;
}
console.log("Area of rectangle is", area(20, 30));//600

// Code snippet-2 Arrow function with no argument: welcome message
let greet = () => console.log("Welcome to arrow functions")
greet();//Weclome to arrow functions

// Code snippet -3  Arrow function with one argument: Square of a number
let square = x => x * x;
console.log(`Square value is ${square(4)}`);//16

//code snippet -4  Arrow function with 2 arguments: Add 2 numbers
let sum = (a, b) => a + b;
console.log(`sum is ${sum(5, 3)}`);//8

//Code snippet - 5  Multipline Arrow function: Find the maximum of 3 numbers
let maximum = (a, b,c) => {
let largest= a > b ? (a > c ? a : c) : (b > c ? b : c);
return largest; 
}
console.log(`Maximum value is ${maximum(17,5,23)}`);//23