/*
    Practice 2 - Count Days for a Given Month and Year​
*/

// Declare and initialize variables to store month and year values
let month = 2;
let year = 2000;

// Declare a variable to store day count​.
let days;

// Write the logic used to check the number of days in the month using switch case
switch (month) {
  case 1:
  case 3:
  case 5:
  case 7:
  case 8:
  case 10:
  case 12:
    days = 31;
    break;
  case 4:
  case 6:
  case 9:
  case 11:
    days = 30;
    break;
  case 2:
    days = 28;
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      days = 29;
    }
    break;
  default:
    days = undefined;
}

// Display the value of day count
console.log(`For Month:${month} Year:${year}, Days:${days}.`);
