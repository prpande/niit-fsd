/*
    Challenge 3 - Know Your Lucky Number
*/

// Declare and initialize variable to store date in `mmddyyyy` format
let strDob = "05312022";
let numDob = Number(strDob);

// Declare variable to store single digit sum value
let sum = 0;

// Write nested loop to calculate single digit sum of the date stored in `mmddyyyy` format
while (numDob > 0) {
  let d = numDob % 10;
  sum = sum + d;
  numDob = (numDob - d) / 10;

  if (numDob === 0 && sum > 9) {
    numDob = sum;
    sum = 0;
  }
}

// Display the single digit sum, which is the lucky number based on the date stored
console.log(`the lucky number is **${sum}**`);
