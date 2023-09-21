/*
    Practice 4 - Sum the Digits of a Number
*/

// Declare and initialize variable to store the value whose digits need to be added up.
let number = 4386;

// Declare and initialize variable to store the sum value.
let sum = 0;

// Write `while` loop to calculate sum of digits.
while (number > 0) {
  let d = number % 10;
  sum = sum + d;
  number = (number - d) / 10;
}

// Display the value of sum.
console.log(`Sum of digits is:${sum}.`);
