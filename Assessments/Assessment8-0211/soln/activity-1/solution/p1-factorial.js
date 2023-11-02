/*
*   ACTIVITY - 1
*   PROBLEM - 1
*   DURATION - 20 minutes

*   Write JavaScript function to calculate factorial of given number.

*   Sample Input: 5
*   Expected Output: 120

*   Sample Input: 0
*   Expected Output: 1

*   Sample Input: 1
*   Expected Output: 1

*   Sample Input: None
*   Expected Output: Cannot calculate factorial of undefined

*   Sample Input: -1
*   Expected Output: Cannot calculate factorial of a negative number

*   Sample Input: "Hello"
*   Expected Output: Cannot calculate factorial of a non-number
*/


function factorial(num) {

    if(num == undefined)
    {
        return "Cannot calculate factorial of undefined";
    }
    if(num < 0)
    {
        return "Cannot calculate factorial of a negative number";
    }
    if(typeof num !== 'number')
    {
        return "Cannot calculate factorial of a non-number"
    }
    let factorial = 1;
    for (let i = 2; i <= num; i++) {
        factorial *= i;
    }
    return factorial;
}


// Don't change below code
module.exports = factorial;