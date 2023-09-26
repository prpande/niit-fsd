# Practice

This sprint has 1 practice.

#### Pre-Requisite

1. Install `Node.js` (if not already installed)

    - Download the installer code from [here](https://nodejs.org/en/download/)
    - The page provides installer options for all 3 popular operating systems: Windows, Mac and Linux

2. Installation of `Node.js` also installs `npm` tool.

3. Confirm the version and installation of `Node.js` and `npm` by running commands on command terminal:
    - `node --version`
    - `npm --version`

## Problem Statement

## Practice - Enable testing in a JavaScript code​

Ron has hens, ducks and cows in his barn. He wants to renovate his barn. He thinks that creating fences and keeping the animals separate will help him feed the animals more easily .​

For this, he plans to divide the area into three parts. He wishes to have a square area for the hens, a circular area for the ducks, and a rectangular area for the cows.​

Add test code along side the existing solution code written to calculate areas to make it test enabled.

### Tasks

Perform the following tasks to develop the test code:​

- Task 1 – Install dependencies Mocha and Chai.​
- Task 2 – Write test cases to test the `areaOfSquare()` function.​
- Task 3 – Write test cases to test the `areaOfRectangle()` function.​
- Task 4 – Write test cases to test the `areaOfCircle()` function.
    - This task is an additional task and hence it is optional.​

#### Task – 1: Install Dependencies Mocha and Chai​

Implement the steps given below to install the dependencies `Mocha` and `Chai` in the given solution code:

1. Open the file `calculate-area-solution.js` located inside the `solution` folder of the `fe-c2-s3-testing-practice` folder to copy the solution.​
2. Copy the solution code for this practice from the solution code developed for the `practice 1` of `Sprint 2 - Implement Modular Programming using Functions` into the `calculate-area-solution.js` file .
    - The solution should contain definitions of following functions to calculate area of square, rectangle and circle respectively:
        - `areaOfSquare()` - accepts one input for side value and returns area of square.
        - `areaOfRectangle()` - accepts two inputs for length and breadth values and returns area of rectangle.
        - `areaOfCircle()` - accepts one input for radius value and returns area of circle.
3. Switch to command terminal and set the path to the folder `fe-c2-s3-testing-practice`.
4. Run the command `npm init -y` to transform current folder into a new npm based JavaScript code.
    - This command would create file `package.json`.
5. Run the command `npm install mocha chai` to install `Mocha` and `Chai`.
    - This command lists `mocha` and `chai` as dependencies in the `package.json` file.
6. Inside `package.json` file, modify `test` property of the `scripts` object with value given below:
    ```json
        "scripts": {
            "test": "mocha"
        }
    ```

#### Task – 2: Write Test Cases for the Function `areaOfSquare()`

Perform the following steps to write test cases to test the code of `areaOfSquare()` function:​

1. Open the file `calculate-area-spec.js` located inside the folder `test` of the folder `fe-c2-s3-testing-practice`.​
2. Write test case to test whether the definition of the function `areaOfSquare()` exists.
3. To execute the test case, from the command terminal, run the command​ `npm run test`.
4. Refactor the solution code written inside the file `calculate-area-solution.js`  if the test case fails.

Note: Repeat Steps 3 and 4 until the test case passes.

5. Write test cases to test whether the function `areaOfSquare()` returns expected area value for the valid input provided.​
6. Execute the test case as explained in Step 3 and if required, refactor the code to ensure that the test cases passe.
7. Write test cases to test whether the function `areaOfSquare()` returns error message if insufficient parameters are passed to the function.​
8. Execute the test case as explained in Step 3 and if required, refactor the code to ensure that the test cases pass. ​
9. Write test cases to test whether the function `areaOfSquare()` returns error message if invalid type of value is passed to the function.​
10. Execute the test case as explained in Step 3 and if required, refactor the code to ensure that the test cases pass.​
11. Write test cases to test whether the function `areaOfSquare()` returns error message if negative value is passed to the function.​
12. Execute the test case as explained in Step 3 and if required, refactor the code to ensure that the test cases pass. 

##### Refactoring Guidelines
- To check for insufficient inputs:
    - Use `if` statement to ensure that the parameter is not an "undefined" value.​
- To check for invalid input type:
    - Use `if` statement to ensure that the type of the parameter is "number".​
- To check for non-zero or non-negative input:
    - Use `if` statement to ensure that the value of the parameter is less than or equal to zero.​
- Refer to the table given below that lists down the error messages expected to be returned by the `areaOfSquare()` function.

    | Function Under Test| Test Condition| Expected Error Message |
    | --------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------- |
    | areaOfSquare()                                      | Number of parameters should not be less than 1                    | Insufficient Input                                   |
    | areaOfSquare()                                      | Parameter should be of type number                                | Invalid Input Type, Side Should Be A Number !!        |
    | areaOfSquare()                                      | Parameter should not be less than or equal to Zero                | Incorrect Input, Side Cannot Be Zero or Negative !!   |

9. Run the command `npm run test` from the command terminal to execute the test code.

##### Expected Output

    ```
    
    > mocha

        solution
            ✔ should have function `calculateAreaOfSquare()`

        Function calculateAreaOfSquare
            ✔ should return area of square for the valid input provided
            ✔ should return message insufficient input if less than 1 parameter is passed
            ✔ should return message invalid input type if the parameter is not a number
            ✔ should return message incorrect input if the value of the parameter is less than or equal to 0


    5 passing (103ms)
    ```

#### Task – 3: Write Test Cases for the Function `areaOfRectangle()`

Perform the following steps to write test cases to test the code of `areaOfRectangle()` function:​

1: Inside the file `calculate-area-spec.js` located inside the folder test of the folder `fe-c2-s3-testing-practice`, write test cases to test whether the function `areaOfRectangle()`
- is defined.​
- returns expected area value for the valid inputs provided.​
- returns error message if insufficient parameters are passed to the function.​
- returns error message if invalid type of values are passed to the function.​
- returns error message if negative values are passed to the function

**Note:** ​

Refer to the steps given for Task – 1 to write and execute test cases for the solution code of the function `areaOfRectangle()`.​

Refactor the code to ensure that the test cases pass.

##### Refactoring Guidelines

- To check for insufficient inputs:​
    - Use `if` statement to ensure that value of none of the parameters is "undefined".​
- To check for invalid input type:​
    - Use `if` statement to ensure that the type of each of the parameters is "number".​
- To check for non-zero or non-negative inputs:​
    - Use `if` statement to ensure that the value of none of the parameters is less than or equal to zero.​
- Refer to the table given below that lists down the error messages expected to be returned by the `areaOfRectangle()` function

    | Function Under Test| Test Condition| Expected Error Message |
    | --------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------- |
    | areaOfRectangle()| Number of parameters should not be less than 2                    | Insufficient Inputs
    | areaOfRectangle()|Parameters should be of type number | Invalid Input Type, Length and Breadth Should Be Numbers !!       |
    | areaOfRectangle() | Parameters should not be less than or equal to Zero | Incorrect Input, Length and Breadth Cannot Be Zero or Negative !!

##### Expected Output

    ```
    
    > mocha

        solution
            ✔ should have function `calculateAreaOfSquare()`
            ✔ should have function `calculateAreaOfRectangle()`

        Function calculateAreaOfSquare
            ✔ should return area of square for the valid input provided`
            ✔ should return message insufficient input if less than 1 parameter is passed
            ✔ should return message invalid input type if the parameter is not a number
            ✔ should return message incorrect input if the value of the parameter is less than or equal to 0

        Function calculateAreaOfRectangle 
            ✔ should return area of rectangle for the valid inputs provided`
            ✔ should return message insufficient inputs if less than 2 parameters are passed
            ✔ should return message invalid input types if the parameters are not of type numbers
            ✔ should return message incorrect input if the value of each of the parameters is less than or equal to 0


    10 passing (103ms)
    ```

#### Task – 4: Write Test Cases for the `areaOfCircle()` Function​

Perform the following steps to write test cases to test the code of `areaOfCircle()` function:​

1. Inside the file `calculate-area-spec.js` located inside the folder test of the folder `fe-c2-s3-testing-practice`, write test cases to test whether the function `areaOfCircle()` ​

- is defined.​
- returns expected area value for the valid input provided.​
- returns error message if insufficient parameters are passed to the function.​
- returns error message if invalid type of value is passed to the function.​
- returns error message if negative value is passed to the function.​

Note: ​

Refer to the steps given for Task – 1 to write and execute test cases for the solution code of the function `areaOfCircle()`.​

Refactor the code to ensure that the test cases pass.

##### Refactoring Guidelines

- To check for insufficient inputs:​
    - Use `if` statement to ensure that the parameter is not an "undefined" value.​
- To check for invalid input type:​
    - Use `if` statement to ensure that the type of the parameter is "number".​
- To check for non-zero or non-negative input:​
    - Use `if` statement to ensure that the value of the parameter is less than or equal to zero.​
- Refer to the table given below that lists down the error messages expected to be returned by the `areaOfCircle()` function

    | Function Under Test| Test Condition| Expected Error Message |
    | --------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------- |
    | areaOfCircle()| Number of parameters should not be less than 1| Insufficient Input
    | areaOfCircle()                                      | Parameter should be of type number                                | Invalid Input Type, Radius Should Be A Number !!      |
    | areaOfCircle()                                      | Parameter should not be less than or equal to Zero                | Incorrect Input, Radius Cannot Be Zero or Negative !! |

##### Expected Output

    ```
    
    > mocha

        solution
            ✔ should have function `calculateAreaOfSquare()`
            ✔ should have function `calculateAreaOfCircle()`
            ✔ should have function `calculateAreaOfRectangle()`

        Function calculateAreaOfSquare
            ✔ should return area of square for the valid input provided`
            ✔ should return message insufficient input if less than 1 parameter is passed
            ✔ should return message invalid input type if the parameter is not a number
            ✔ should return message incorrect input if the value of the parameter is less than or equal to 0

        Function calculateAreaOfCircle
            ✔ should return area of circle for the valid input provided`
            ✔ should return message insufficient input if less than 1 parameter is passed
            ✔ should return message invalid input type if the parameter is not a number
            ✔ should return message incorrect input if the value of the parameter is less than or equal to 0

        Function calculateAreaOfRectangle 
            ✔ should return area of rectangle for the valid inputs provided`
            ✔ should return message insufficient inputs if less than 2 parameters are passed
            ✔ should return message invalid input types if the parameters are not of type numbers
            ✔ should return message incorrect input if the value of the parameter is less than or equal to 0


    15 passing (103ms)
    ```

### Submission Instructions

1. This practice would be manually evaluated.​
2. Push the code to git and share the link with mentor for manual evaluation.