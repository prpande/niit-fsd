## Activity - 2

### Problem - 1: Refactor the given solution code to ensure it passes the given test code (20 mins)

The code for JavaScript program that calculates average of wickets taken by a bowler in both the innings of a test match is written `solution/p1-calculate-wicket-average.js` file.

The test code to test the correctness and completeness of the program is provided in the `test/p1-calculate-average-spec.js` file.

Run the test code to ensure all the given test cases pass.

For the failed test cases refactor the solution code and ensure the test cases pass.

**NOTE: DO NOT MODIFY THE GIVEN TEST CODE**

### Problem - 2: Write test code for the given JavaScript program. (40 mins)

The JavaScript program given in the file `solution/p2-analyze-runs-average.js`, analyzes the performance of a batsman based on the runs scored by him in a recently completed test match. Based on the average of runs scored the program classifies the category to which a batsman should belong:

Refer to the table given below for scores and the categories mapped:

|Runs Scored|Category|
|-|-|
|less than or equal to 10|Poor|
|11-50|Average|
|51-100|Good|
|101 and above|Outstanding|

Write test code to test whether the given program fulfils the requirements. The test code should be written inside the `test/p2-analyze-runs-average-spec.js` file.

Install the necessary dependencies for implementing unit testing.

Ensure the test code is written to test the runs scored in each given range.

#### Expected Output

Below are the sample outputs for the given sample inputs for the runs scored in the two innings:

|Sample First Innings Runs Input|Sample Second Innings Runs Input|Expected Sample Output|
|-|-|-|
|"0"|41|Invalid Score|
|34|"0"|Invalid Score|
|10|-10|Incorrect Score|
|-40|20|Incorrect Score|
|6|12|Poor|
|20|43|Average|
|35|141|Good|
|220|70|Outstanding|
 
**Refactor the solution code to ensure all the above given sample inputs are tested against the expected outputs.**

#### Submission Instructions

1. This assessment will be manually evaluated by the mentor.
2. Push the solution to git, after the solution code is developed.
3. Provide `Reporter` access for the solution repo to the mentor.
4. Share the link with mentor for evaluation .