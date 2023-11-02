/*
*   ACTIVITY - 1
*   PROBLEM - 2
*   DURATION - 20 minutes

*   Check whether the value of parameter passed to the function is a multiple of 7 or 11. 
    The function should return 
    0 if the number is not a multiple of 7 as well as 11,
    1 if the number is multiple of only 7, 
    2 if the number is multiple of only 11 and 
    3 if the number is multiple of 7 and 11 both. 
    The function should return -1 if the type of parameter is not a number.
    The function should return 0 if the number is not a multiple of 7 or 11.

*   Sample Input: 77
*   Expected Output: 3

*   Sample Input: 14
*   Expected Output: 1

*   Sample Input: 22
*   Expected Output: 2

*   Sample Input: 5
*   Expected Output: 0

*   Sample Input: "Hello"
*   Expected Output: -1
*/


// write function definition here with comments using if-else statements
function multipleOf7Or11(num) {

    if (typeof num !== 'number') {
        return -1;
    }

    let is7Multiple = num % 7 == 0;
    let is11Multiple = num % 11 == 0;
    if (is7Multiple) {
        if (is11Multiple) {
            return 3;
        }
        return 1;
    }
    if (is11Multiple) {
        return 2;
    }
    return 0;
}



// Don't change below code
module.exports = multipleOf7Or11;







