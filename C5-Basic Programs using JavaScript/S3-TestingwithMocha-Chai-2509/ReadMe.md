<!-- omit in toc -->
# Implement Unit Testing using Mocha and Chai - 25/09

- [Mocha Homepage](https://mochajs.org/)
- [Chai Homepage](https://www.chaijs.com/)
- [Node.js Homepage](https://nodejs.org/en)

<!-- omit in toc -->
## Contents

- [What Is Unit Testing?](#what-is-unit-testing)
- [Setting Up the Environment](#setting-up-the-environment)
- [Writing Your First Test](#writing-your-first-test)
- [Understanding the Test Structure](#understanding-the-test-structure)
- [Running Tests](#running-tests)
- [Advanced Testing Concepts](#advanced-testing-concepts)
  - [Asynchronous Testing](#asynchronous-testing)
  - [Hooks](#hooks)

## What Is Unit Testing?

- Software testing method where individual units or components of a program are tested in isolation to validate that they work as intended
- These units can be functions, classes, or even smaller parts of code
- Help developers catch bugs early in the development cycle and provide a safety net for code changes and refactoring

## Setting Up the Environment

- Need Node.js and npm (Node Package Manager) installed on your machine

1. **Create a New Project Folder**: Start by creating a new directory for your project.

2. **Initialize a New Node.js Project**: Navigate to your project folder in the terminal and run `npm init -y` to create a `package.json` file with default settings.

3. **Install Mocha and Chai**: Install Mocha and Chai as development dependencies by running `npm install mocha chai --save-dev`.

4. **Create a Test Folder**: Create a folder in your project directory for your test files. You can name it 'test' or 'tests.'

## Writing Your First Test

Create a simple function to test

```javascript
// math.js
function add(a, b) {
  return a + b;
}

module.exports = { add };
```

A test for the `add` function:

```javascript
// test/math.test.js
const { expect } = require('chai');
const { add } = require('../math');

describe('Math Functions', () => {
  describe('add', () => {
    it('should return the sum of two numbers', () => {
      const result = add(2, 3);
      expect(result).to.equal(5);
    });
  });
});
```

## Understanding the Test Structure

- We import the `expect` function from Chai, which allows us to write assertions.
- We import the `add` function from our `math.js` module.
- We use `describe` to group related tests.
- Inside the innermost `describe` block, we use `it` to specify individual test cases.
- The `expect` function is used to make assertions about the expected behavior of the code under test.

## Running Tests

To run your tests, execute the following command in your terminal:

```bash
npx mocha
```

Mocha will discover and execute all test files in your project.

## Advanced Testing Concepts

### Asynchronous Testing

Sometimes, you need to test asynchronous code, such as asynchronous functions or network requests. Mocha provides ways to handle this using callbacks, Promises, or the `async/await` syntax.

```javascript
// Example of testing an asynchronous function
it('should resolve to the correct value', async () => {
  const result = await someAsyncFunction();
  expect(result).to.equal(expectedValue);
});
```

### Hooks

Mocha offers hooks like `before`, `after`, `beforeEach`, and `afterEach` to set up and tear down test environments or resources.

```javascript
before(() => {
  // Code to run before all tests in this suite
});

after(() => {
  // Code to run after all tests in this suite
});

beforeEach(() => {
  // Code to run before each test in this suite
});

afterEach(() => {
  // Code to run after each test in this suite
});
```
