<!-- omit in toc -->
# Modular Programming Using Functions in JavaScript 22/09

<!-- omit in toc -->
## Contents

- [Understanding Modular Programming](#understanding-modular-programming)
  - [The Need for Modular Programming](#the-need-for-modular-programming)
  - [What is a Module?](#what-is-a-module)
  - [Advantages of Modular Programming](#advantages-of-modular-programming)
- [Functions: The Building Blocks of Modules](#functions-the-building-blocks-of-modules)
  - [What is a Function?](#what-is-a-function)
  - [Function Syntax](#function-syntax)
  - [Function Declaration vs. Function Expression](#function-declaration-vs-function-expression)
  - [Function Parameters and Return Values](#function-parameters-and-return-values)
- [Creating and Using Modules](#creating-and-using-modules)
  - [Exporting Functions](#exporting-functions)
  - [Importing Functions](#importing-functions)
  - [Example: Creating a Module](#example-creating-a-module)
- [Scope of a Variable in JavaScript](#scope-of-a-variable-in-javascript)
  - [Global Scope](#global-scope)
    - [Global Variables](#global-variables)
      - [The `window` Object](#the-window-object)
  - [Function Scope](#function-scope)
    - [Local Variables](#local-variables)
    - [Scope Chain](#scope-chain)
  - [Block Scope](#block-scope)
    - [`let` and `const` Declarations](#let-and-const-declarations)
    - [`var` Declarations](#var-declarations)
  - [Variable Hoisting](#variable-hoisting)
  - [Best Practices for Variable Scope](#best-practices-for-variable-scope)
- [Function Types](#function-types)
  - [Named Functions](#named-functions)
  - [Anonymous Functions](#anonymous-functions)
  - [Arrow Functions](#arrow-functions)
- [Hoisting and Function Expressions](#hoisting-and-function-expressions)
- [Closures](#closures)
- [IIFE (Immediately Invoked Function Expression)](#iife-immediately-invoked-function-expression)
- [Function Best Practices](#function-best-practices)
- [Nested functions](#nested-functions)
  - [Creating Nested Functions](#creating-nested-functions)
    - [Function Declarations within Functions](#function-declarations-within-functions)
    - [Function Expressions within Functions](#function-expressions-within-functions)
  - [Scope of Nested Functions](#scope-of-nested-functions)
    - [Accessing Outer Variables](#accessing-outer-variables)
  - [Use Cases and Benefits](#use-cases-and-benefits)
    - [Modularization and Encapsulation](#modularization-and-encapsulation)
    - [Closure and Data Privacy](#closure-and-data-privacy)
  - [Practical Examples](#practical-examples)
    - [Nested Function for Calculation](#nested-function-for-calculation)
    - [Closure for Counter](#closure-for-counter)
- [Built-in Functions](#built-in-functions)
  - [String Manipulation Functions](#string-manipulation-functions)
    - [String Length](#string-length)
    - [Substring Extraction](#substring-extraction)
    - [String Concatenation](#string-concatenation)
    - [Search and Replace](#search-and-replace)
  - [Array Manipulation Functions](#array-manipulation-functions)
    - [Adding and Removing Elements](#adding-and-removing-elements)
    - [Array Transformation](#array-transformation)
  - [Mathematical Functions](#mathematical-functions)
    - [Basic Mathematical Operations](#basic-mathematical-operations)
    - [Random Number Generation](#random-number-generation)
  - [Date and Time Functions](#date-and-time-functions)
    - [Date Creation](#date-creation)
    - [Date Formatting and Parsing](#date-formatting-and-parsing)
    - [Date Arithmetic](#date-arithmetic)
  - [Global Functions](#global-functions)
    - [`setTimeout` and `setInterval`](#settimeout-and-setinterval)
    - [`parseInt` and `parseFloat`](#parseint-and-parsefloat)
  - [Custom extension Functions](#custom-extension-functions)

## Understanding Modular Programming

### The Need for Modular Programming

As JavaScript applications grow in complexity, managing code becomes challenging. Modular programming aims to address this challenge by breaking down code into smaller, manageable pieces called modules. Each module encapsulates a specific functionality or feature, making it easier to develop, test, and maintain code.

### What is a Module?

A module in JavaScript is a self-contained unit of code that can be reused within an application. Modules can contain variables, functions, or even classes. They allow you to organize code logically and prevent naming conflicts.

### Advantages of Modular Programming

Modular programming offers several advantages, including:

- **Code Organization**: Code is divided into smaller, focused modules, improving organization and readability.
- **Reusability**: Modules can be reused across the application or in other projects.
- **Maintainability**: Changes and updates are easier to implement and test in isolated modules.
- **Collaboration**: Multiple developers can work on different modules simultaneously.
- **Scalability**: Applications can grow without becoming unmanageable.

## Functions: The Building Blocks of Modules

### What is a Function?

A function in JavaScript is a reusable block of code that performs a specific task. Functions accept input parameters (if needed) and can return a result. They are essential for modular programming.

### Function Syntax

Here's the basic syntax for declaring a function in JavaScript:

```javascript
function functionName(parameters) {
    // Function body
    // Code to be executed
    return result; // Optional
}
```

- `functionName`: This is the name of the function.
- `parameters`: These are optional, comma-separated values that the function can accept.
- `return`: This is optional, and it specifies the value to be returned by the function.

### Function Declaration vs. Function Expression

JavaScript provides two ways to define functions:

- **Function Declaration**:

  ```javascript
  function greet(name) {
      return `Hello, ${name}!`;
  }
  ```

- **Function Expression**:

  ```javascript
  const greet = function(name) {
      return `Hello, ${name}!`;
  };
  ```

Function declarations are hoisted, while function expressions are not.

### Function Parameters and Return Values

Functions can accept parameters and return values, making them versatile tools for modular programming.

```javascript
function add(a, b) {
    return a + b;
}

const result = add(3, 4); // result = 7
```

## Creating and Using Modules

### Exporting Functions

In JavaScript, you can export functions from a module using the `export` keyword. For example:

```javascript
// math.js
export function add(a, b) {
    return a + b;
}
```

### Importing Functions

To use functions from another module, you can import them using the `import` statement:

```javascript
// app.js
import { add } from './math.js';

const result = add(3, 4); // result = 7
```

### Example: Creating a Module

Let's create a simple module to calculate the area of a rectangle:

```javascript
// rectangle.js
export function calculateArea(length, width) {
    return length * width;
}
```

Now, we can import and use this module in our application:

```javascript
// app.js
import { calculateArea } from './rectangle.js';

const length = 5;
const width = 3;

const area = calculateArea(length, width);
console.log(`The area of the rectangle is ${area} square units.`);
```

## Scope of a Variable in JavaScript

Variable scope defines the context in which a variable is declared and where it can be accessed. JavaScript has three main types of scope:

- **Global Scope**: Variables declared outside any function or block are in global scope and can be accessed throughout the code.

- **Function Scope**: Variables declared within a function are in function scope and can only be accessed within that function.

- **Block Scope**: Variables declared with `let` and `const` within a block (e.g., loops or conditionals) are in block scope and can only be accessed within that block.

### Global Scope

#### Global Variables

Variables declared outside any function or block are considered global and have global scope. They can be accessed and modified from any part of the code.

```javascript
var globalVar = 10;

function exampleFunction() {
    console.log(globalVar); // Accessible
}

console.log(globalVar); // Accessible
```

##### The `window` Object

In a web browser environment, global variables are also properties of the `window` object.

```javascript
var globalVar = 10;

function exampleFunction() {
    console.log(window.globalVar); // Accessible
}

console.log(window.globalVar); // Accessible
```

### Function Scope

#### Local Variables

Variables declared within a function are in function scope and can only be accessed within that function. They are not visible outside the function.

```javascript
function exampleFunction() {
    var localVar = 20;
    console.log(localVar); // Accessible
}

console.log(localVar); // Error: localVar is not defined
```

#### Scope Chain

JavaScript follows a hierarchical scope chain. If a variable is not found in the current function scope, it will look for it in the outer scope until it reaches the global scope.

```javascript
var globalVar = 10;

function outerFunction() {
    var outerVar = 20;

    function innerFunction() {
        var innerVar = 30;
        console.log(globalVar); // Accessible (from outer scope)
        console.log(outerVar); // Accessible (from the same scope)
        console.log(innerVar); // Accessible (from the same scope)
    }

    innerFunction();
    console.log(innerVar); // Error: innerVar is not defined (outside its scope)
}

outerFunction();
```

### Block Scope

Block scope was introduced with the `let` and `const` declarations in ECMAScript 6 (ES6). Variables declared with `let` and `const` are block-scoped, meaning they are only accessible within the block where they are defined.

#### `let` and `const` Declarations

```javascript
if (true) {
    let blockVar = 42;
    console.log(blockVar); // Accessible
}

console.log(blockVar); // Error: blockVar is not defined (outside its block)
```

#### `var` Declarations

In contrast, variables declared with `var` are function-scoped and are not limited to block scope. This can lead to unexpected behavior.

```javascript
if (true) {
    var varVar = 42;
    console.log(varVar); // Accessible
}

console.log(varVar); // Accessible (outside its block)
```

### Variable Hoisting

Variable hoisting is a JavaScript behavior where variable declarations (not assignments) are moved to the top of their containing function or block scope during compilation. This can lead to surprising results if you're not aware of it.

```javascript
console.log(hoistedVar); // undefined
var hoistedVar = 5;
```

### Best Practices for Variable Scope

- **Use `const` and `let`**: Prefer `const` and `let` over `var` to avoid unexpected behavior and to limit variables to block scope when necessary.

- **Minimize Global Variables**: Avoid polluting the global scope with too many variables to prevent naming conflicts and improve code maintainability.

- **Avoid Variable Hoisting Issues**: Declare variables before using them to avoid hoisting-related bugs.

- **Keep Functions Small**: Limit the scope of variables by breaking your code into smaller functions.

## Function Types

### Named Functions

A named function has a specific name and can be defined using the `function` keyword.

```javascript
function add(a, b) {
    return a + b;
}
```

### Anonymous Functions

Anonymous functions have no name and are often used as arguments to other functions or assigned to variables.

```javascript
const multiply = function(a, b) {
    return a * b;
};
```

### Arrow Functions

Arrow functions provide a concise syntax for writing functions, especially when they have a single statement in the body.

```javascript
const divide = (a, b) => a / b;
```

## Hoisting and Function Expressions

In JavaScript, function declarations are hoisted to the top of their containing scope, which means they can be used before they are declared. However, function expressions are not hoisted.

```javascript
console.log(foo()); // Works due to hoisting

function foo() {
    return "I was hoisted!";
}

console.log(bar()); // Error: bar is not a function

const bar = function() {
    return "I was not hoisted!";
};
```

## Closures

Closures occur when a function retains access to variables from its outer scope even after that outer function has finished executing. Closures are powerful and can be used for various purposes.

```javascript
function outer() {
    let outerVar = "I'm from outer!";
    
    function inner() {
        console.log(outerVar); // Access outerVar from the outer function
    }
    
    return inner;
}

const closureExample = outer();
closureExample(); // "I'm from outer!"
```

## IIFE (Immediately Invoked Function Expression)

An IIFE is a function that is executed immediately after it is defined. It's often used to create a private scope and avoid polluting the global namespace.

```javascript
(function() {
    const privateVar = "I'm private!";
    console.log(privateVar); // Accessible within the IIFE
})();
```

## Function Best Practices

- **Keep functions small and focused**: Functions should have a single responsibility and be concise.
- **Use meaningful names**: Choose descriptive names for your functions and parameters to improve code readability.
- **Document your functions**: Add comments or use JSDoc comments to explain the purpose and usage of your functions.
- **Avoid global functions**: Minimize the use of global functions to prevent naming conflicts.
- **Consider immutability**: When working with data, prefer functions that do not modify the original data but return a new copy.

## Nested functions

In JavaScript, a nested function is a function defined within another function. The inner function has access to the variables and parameters of the outer function. This concept enables the creation of more structured and organized code by encapsulating related logic within functions.

### Creating Nested Functions

#### Function Declarations within Functions

```javascript
function outerFunction() {
    // Outer function logic
    
    function innerFunction() {
        // Inner function logic
    }
    
    // More outer function logic
}
```

#### Function Expressions within Functions

```javascript
function outerFunction() {
    // Outer function logic
    
    const innerFunction = function() {
        // Inner function logic
    };
    
    // More outer function logic
}
```

### Scope of Nested Functions

#### Accessing Outer Variables

Nested functions have access to variables and parameters of their containing (outer) functions. This concept is known as "closure."

```javascript
function outerFunction() {
    const outerVar = 10;

    function innerFunction() {
        console.log(outerVar); // Access outerVar from the outer function
    }

    innerFunction();
}

outerFunction();
```

### Use Cases and Benefits

#### Modularization and Encapsulation

Nested functions allow you to modularize your code by breaking down complex tasks into smaller, more manageable functions. This enhances code readability and makes it easier to maintain and debug.

#### Closure and Data Privacy

Closure, a result of nested functions, enables data encapsulation and privacy. You can hide variables within an outer function, preventing direct access from outside the scope.

### Practical Examples

#### Nested Function for Calculation

```javascript
function calculator() {
    let result = 0;

    function add(x) {
        result += x;
    }

    function subtract(x) {
        result -= x;
    }

    function getResult() {
        return result;
    }

    return { add, subtract, getResult };
}

const calc = calculator();
calc.add(5);
calc.subtract(2);
console.log(calc.getResult()); // Output: 3
```

#### Closure for Counter

```javascript
function counter() {
    let count = 0;

    return function() {
        return ++count;
    };
}

const increment = counter();

console.log(increment()); // Output: 1
console.log(increment()); // Output: 2
```

## Built-in Functions

### String Manipulation Functions

#### String Length

- `length`: Returns the number of characters in a string.

```javascript
const str = "JavaScript";
console.log(str.length); // Output: 10
```

#### Substring Extraction

- `substring(startIndex, endIndex)`: Extracts a portion of a string.

```javascript
const str = "Hello, World!";
const subStr = str.substring(0, 5);
console.log(subStr); // Output: "Hello"
```

#### String Concatenation

- `concat(string1, string2, ...)`: Combines multiple strings into one.

```javascript
const firstName = "John";
const lastName = "Doe";
const fullName = firstName.concat(" ", lastName);
console.log(fullName); // Output: "John Doe"
```

#### Search and Replace

- `indexOf(searchString)`: Searches for a substring within a string and returns its position.

```javascript
const str = "JavaScript is amazing!";
const position = str.indexOf("is");
console.log(position); // Output: 12
```

### Array Manipulation Functions

#### Adding and Removing Elements

- `push(element1, element2, ...)`: Adds elements to the end of an array.

```javascript
const colors = ["red", "green"];
colors.push("blue");
console.log(colors); // Output: ["red", "green", "blue"]
```

- `pop()`: Removes the last element from an array.

```javascript
const fruits = ["apple", "banana", "cherry"];
const removedFruit = fruits.pop();
console.log(fruits); // Output: ["apple", "banana"]
console.log(removedFruit); // Output: "cherry"
```

#### Array Transformation

- `map(callback)`: Creates a new array by applying a callback function to each element.

```javascript
const numbers = [1, 2, 3];
const doubled = numbers.map(num => num * 2);
console.log(doubled); // Output: [2, 4, 6]
```

- `filter(callback)`: Creates a new array with elements that pass a given test.

```javascript
const scores = [85, 92, 78, 95, 89];
const passingScores = scores.filter(score => score >= 90);
console.log(passingScores); // Output: [92, 95]
```

### Mathematical Functions

#### Basic Mathematical Operations

- `Math.abs(x)`: Returns the absolute value of a number.

```javascript
const num = -5;
const absoluteValue = Math.abs(num);
console.log(absoluteValue); // Output: 5
```

- `Math.sqrt(x)`: Returns the square root of a number.

```javascript
const square = 16;
const squareRoot = Math.sqrt(square);
console.log(squareRoot); // Output: 4
```

#### Random Number Generation

- `Math.random()`: Generates a random decimal number between 0 (inclusive) and 1 (exclusive).

```javascript
const randomNum = Math.random();
console.log(randomNum); // Output: A random decimal number between 0 and 1
```

### Date and Time Functions

#### Date Creation

- `new Date()`: Creates a new Date object representing the current date and time.

```javascript
const currentDate = new Date();
console.log(currentDate); // Output: Current date and time
```

#### Date Formatting and Parsing

- `toDateString()`: Converts a Date object to a human-readable date string.

```javascript
const today = new Date();
const dateString = today.toDateString();
console.log(dateString); // Output: "Mon Sep 12 2023"
```

- `Date.parse(dateString)`: Parses a date string and returns the number of milliseconds since January 1, 1970.

```javascript
const dateStr = "2023-09-12T08:30:00Z";
const milliseconds = Date.parse(dateStr);
console.log(milliseconds); // Output: 1662994200000
```

#### Date Arithmetic

- Date objects support various arithmetic operations, such as addition and subtraction, to perform date calculations.

```javascript
const currentDate = new Date();
const tomorrow = new Date(currentDate);
tomorrow.setDate(currentDate.getDate() + 1);
console.log(tomorrow); // Output: Date representing tomorrow
```

### Global Functions

#### `setTimeout` and `setInterval`

- `setTimeout(callback, delay)`: Executes a function after a specified delay (in milliseconds).

```javascript
setTimeout(() => {
    console.log("Delayed message");
}, 2000); // Output after 2 seconds
```

- `setInterval(callback, interval)`: Repeatedly executes a function at a specified interval (in milliseconds).

```javascript
setInterval(() => {
    console.log("Repeated message");
}, 1000); // Output every second


```

#### `parseInt` and `parseFloat`

- `parseInt(string, radix)`: Parses a string and returns an integer.

```javascript
const numStr = "42";
const num = parseInt(numStr);
console.log(num); // Output: 42
```

- `parseFloat(string)`: Parses a string and returns a floating-point number.

```javascript
const floatStr = "3.14";
const floatNum = parseFloat(floatStr);
console.log(floatNum); // Output: 3.14
```

### Custom extension Functions

You can create your own custom functions to extend JavaScript's functionality.

```javascript
String.prototype.reverse = function() {
    return this.split("").reverse().join("");
};

const reversedStr = "JavaScript".reverse();
console.log(reversedStr); // Output: "tpircSavaJ"
```
