/*
    Practice 3 - Fibonacci Series for First 10 numbers
*/

// Declare and initialize variable to store count value.
let count = 10;

// Declare and initialize variables to store the first two values of the fibonacci series.
let fn_1 = 1;
let fn_2 = 0;

// Display the first two values of the fibonacci series.
console.log(`First ${count} fibonacci numbers: `);
console.log(fn_2);
console.log(fn_1);

// Write `for` loop to generate rest of the values in the fibonacci series.
for (let i = 2; i < count; i++) {
  let fn = fn_1 + fn_2;
  console.log(fn);
  fn_2 = fn_1;
  fn_1 = fn;
}
