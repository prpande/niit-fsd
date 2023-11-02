/*
*   ACTIVITY - 2
*   PROBLEM - 1
*   DURATION - 20 minutes

*   The JavaScript solution for calculating average of wickets taken is given below:
*/

function calculateAverage(first_innings_wicket_count, second_innings_wicket_count) {

    if (typeof first_innings_wicket_count !== 'number' || typeof second_innings_wicket_count !== 'number') {
        return 'Invalid Count Value';
    }
    if (first_innings_wicket_count < 0 || second_innings_wicket_count < 0) {
        return 'Incorrect Count Value';
    }

    return (first_innings_wicket_count + second_innings_wicket_count) / 2;
}

/*  
*   Run the test code given in the 
*   `activity-2/test/p1-calculate-wicket-average-spec.js` file and 
*   refactor the above given solution code to ensure all the test cases pass.

*   DO NOT MODIFY THE TEST CODE.    
*/

// Don't change below code
module.exports = calculateAverage
