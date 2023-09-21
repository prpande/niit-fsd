/*
    Practice 1 - Find the Largest Number​
*/

// Declare and initialize variables
let x = 25;
let y = 70;
let z = 34;

// Declare a variable to store the resultant largest number
let max;

// Write logic to find the largest number using nested-if
if (x > y) {
  if (x > z) {
    max = x;
  } else {
    max = z;
  }
} else {
  if (y > z) {
    max = y;
  } else {
    max = z;
  }
}

// Display the largest number
console.log(`Largest number: ${max}.`);

// Write logic to find the largest number using ternary operator
max = x > y ? (x > z ? x : z) : y > z ? y : z;

// Display the largest number
console.log(`Largest number: ${max}.`);
