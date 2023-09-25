## Demo 2 - Compute Grades - Enable Testing

Before writing the test code, plan the test cases.

The given solution code contains 3 JavaScript functions:
1. `calculateTotalMarks()` - has 3 input parameters for receiving marks data and returns total of marks.
2. `calculateAverageOfMarks()` - has 3 input parameters for receiving marks data and returns average of marks.
3. `calculateGrade()` - has 3 input parameters for receiving marks data and returns grade.

Each of the above listed functions should be tested to ensure
1. Function with the given name exists.
2. Function returns the expected result for the valid inputs provided.


Based on the above requirements, test cases should be defined for testing positive as well as negative scenarios

### Steps

1. The folder `demo-2-compute-grades` contains a sub-folder with the name `solution` and `test`.
2. The `solution` folder contains the solution code for computing grades.
3. Modify the `script.js` file located inside the `solution` folder and add the code given below at the end of the file:
    ```javascript
        module.exports = {
            calculateTotalMarks,
            calculateAverageOfMarks,
            calculateGrade
        }
    ```
4. Switch to command terminal and set the path to the folder `demo-2-compute-grades`.
5. Run the command `npm init -y` to transform current folder into a new npm based JavaScript code.
6. Run the command `npm install mocha chai` to install `mocha` and `chai`.
7. Inside `package.json` file, modify `test` property of the `scripts` object with value given below:
    ```json
        "scripts": {
            "test": "mocha"
        }
    ```
8. Create a sub-folder with the name `test` inside `demo-2-compute-grades` folder.
9. Inside `test` folder create file `script-spec.js`.
10. Inside `script-spec.js` file import:
    1. Function `expect` of `chai` library.
    2. Import functions from `script` file.
    ```javascript
        const expect = require('chai').expect;
        const solution = require('../solution/script');
    ```
11. In the `script-spec.js` file, call `describe()` function to define test suites
    - It is recommended to have multiple `describe()` calls for creating multiple test suites for organizing test cases.
12. Each call to `describe()` function should have multiple `it()` functions to define individual test case.
13. As per the details given in table below, define test cases for testing the stated requirements:

Target   | Test Requirement                                                            |
|--------| --------------------------------------------------------------------------- |
|Solution| Function `calculateTotalMarks()` is defined                                   |
|Solution| Function `calculateAverateMarks()` is defined                                 |
|Solution| Function `calculateGrade()` is defined                                        |
|Function `calculateTotalMarks()`, Function `calculateAverageMarks()`, Function `calculateGrade()`| Function should return expected value for the valid inputs provided|

**Note: In all 8 test cases are written to fulfil all the stated test requirements**

14. Run the test code by running the command `npm run test` from the command terminal.
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

            calculateAverageOfMarks
                ✔ should return average for marks provided

            calculateGrade
                ✔ should return grade A for marks value 85, 80 and 83
                ✔ should return grade B for marks value 60, 80 and 70
                ✔ should return grade C for marks value 60, 80 and 70


            8 passing (15ms)
    ```