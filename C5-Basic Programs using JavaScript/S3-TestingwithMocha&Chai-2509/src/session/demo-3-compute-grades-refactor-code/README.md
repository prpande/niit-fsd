## Demo 3 - Compute Grades - Refactor Code

To ensure that the existing code fulfills the test requirements, the code may need to be refactored. 

The given solution code contains 3 JavaScript functions:
1. `calculateTotalMarks()` - has 3 input parameters for receiving marks data and returns total of marks.
2. `calculateAverageOfMarks()` - has 3 input parameters for receiving marks data and returns average of marks.
3. `calculateGrade()` - has 3 input parameters for receiving marks data and returns grade.

In addition to the previously written test cases, additional test cases need to written for each of the above listed functions to ensure
1. Function returns error message if it is not provided with necessary inputs.
4. Function returns error message if it is not provided with right type of inputs.
5. Function returns error message if it is not provided with non-negative inputs.

Based on the above requirements, test cases should be defined.

Also, the existing code needs refactoring to ensure these test requirements are satisfied.

### Steps

1. Create folder with the name `demo-3-compute-grades-refactor-code`.
2. Copy the solution code of `demo-2` from the folder `demo-2-compute-grades-enable-testing` into the folder `demo-3-compute-grades-refactor-code`.
3. The `solution` folder contains the solution code for computing grades.
4. Inside `script-spec.js` file of `test` folder as per the details given in table below, add the defintions for test cases for testing the stated requirements:

Target   | Test Requirement                                                            |
|--------| --------------------------------------------------------------------------- |
|Function `calculateTotalMarks()`, Function `calculateAverageMarks()`, Function `calculateGrade()`| Function should return appropriate error message for insufficient inputs    |
|Function `calculateTotalMarks()`, Function `calculateAverageMarks()`, Function `calculateGrade()`| Function should return appropriate error message for invalid type of inputs |
|Function `calculateTotalMarks()`, Function `calculateAverageMarks()`, Function `calculateGrade()`| Function should return appropriate error message for negative inputs        |

**Note: In all 17 test cases are written to fulfil all the stated test requirements**
5. For each of these test cases, the code inside the functions being tested need to be refactored.
5. Run the test code by running the command `npm run test` from the command terminal.
    - Each test should ideally be executed immediately after it is written and then the next test case should be written.
    - The final test output is as shown below:

    ```
        > mocha


            Solution
                ✔ should have function calculateTotalMarks()
                ✔ should have function calculateAverageOfMarks()
                ✔ should have function calculateGrade()

            calculateTotalMarks
                ✔ should return total for marks provided
                ✔ should return message insufficient inputs if less than 3 parameters are passed        
                ✔ should return message invalid input type if any of the parameters is not a number     
                ✔ should return message incorrect input if value of any of the parameters is less than 0

            calculateAverageOfMarks
                ✔ should return average for marks provided
                ✔ should return message insufficient inputs if less than 3 parameters are passed
                ✔ should return message invalid input type if any of the parameters is not a number
                ✔ should return message incorrect input if value of any of the parameters is less than 0

            calculateGrade
                ✔ should return grade A for marks value 85, 80 and 83
                ✔ should return grade B for marks value 60, 80 and 70
                ✔ should return grade C for marks value 60, 80 and 70
                ✔ should return message insufficient inputs if less than 3 parameters are passed
                ✔ should return message invalid input type if any of the parameters is not a number
                ✔ should return message incorrect input if value of any of the parameters is less than 0


            17 passing (17ms)
    ```