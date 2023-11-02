/*
*   ACTIVITY - 2
*   PROBLEM - 2
*   DURATION - 40 minutes

*   The JavaScript solution for analyzing average of runs scored is given below:
*/

function analyze_average_runs_scored(first_innings_runs_score, second_innings_runs_score) {
    let average_score = (first_innings_runs_score + second_innings_runs_score) / 2;
    if(average_score < 10)
        return "Poor";
    else if(average_score <= 50)
        return "Average";
    else if(average_score <= 100)
        return "Good";
    else 
        return "Outstanding";
}

/*  
*   Write test code for the solution code given above in the 
*   `activity-2/test/analyze-runs-average-spec.js` file.
*/

// Don't change below code
module.exports = analyze_average_runs_scored