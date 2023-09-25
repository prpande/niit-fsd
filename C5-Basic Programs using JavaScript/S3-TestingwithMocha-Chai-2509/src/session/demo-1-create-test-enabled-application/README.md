## Demo 1 - Create Test Enabled JavaScript Application

A test enabled JavaScript application is a Node.js application, hence Node.js should be installed on the system.

#### Pre-Requisite

1. Install `Node.js` (if not already installed)

    - Download the installer code from [here](https://nodejs.org/en/download/)
    - The page provides installer options for all 3 popular operating systems: Windows, Mac and Linux

2. Installation of `Node.js` also installs `npm` tool

3. Confirm the version and installation of `Node.js` and `npm` by running commands on command terminal:
    - `node --version`
    - `npm --version`

### Steps

1. Create folder `demo-1-create-test-enabled-application`.
2. Create folders `solution` and `test` inside the folder `demo-1-create-test-enabled-application`.
3. Switch to command terminal and set the path to the folder `demo-1-create-test-enabled-application`.
4. Run the command `npm init -y` to transform current folder into a new npm based JavaScript code.
    - This command would create file `package.json`.
5. Run the command `npm install mocha chai` to install `mocha` and `chai`.
    - This command lists `mocha` and `chai` as dependencies in the `package.json` file.
6. Inside `solution` folder, create file `script.js`.
7. Inside `script.js` file define `display()` function with empty body.
8. Inside `script.js` add code to make `display()` function discoverable outside `script.js` file.
```javascript
    function display() {

    }
    module.exports = display;
```
9. Inside `test` folder, create file `script-spec.js`.
10. Inside `script-spec.js` file
    1. Import `chai` to write assertion scripts.
    2. Import `display()` function of `script.js` file to test.
    3. Call `describe()` function to define test suite
    4. Call `it()` function and pass it to `describe()` function to define test code.
    5. Inside `it()` function, call `expect()` function to test whether function with the name `display()` is defined.
    ```javascript
        const chai = require('chai');
        const expect = chai.expect;
        const display = require('../solution/script');

        describe('Script',function() {
            it('should have function display()',function() {
                expect(typeof display).to.equal('function');
            });
        });
    ```
11. Inside `package.json` file, modify `test` property of the `scripts` object with value given below:
    ```json
        "scripts": {
            "test": "mocha"
        }
    ```
12. Run the test code by running the command `npm run test` from the command terminal.
    - The command should display output as shown below

    ```
        > mocha



        Script
            ✔ should have function display()


        1 passing (6ms)
    ```
