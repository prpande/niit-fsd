<!-- omit in toc -->
# Getting Started with JavaScript 20/09

<!-- omit in toc -->
## Contents

- [Introduction to JavaScript](#introduction-to-javascript)
  - [What is JavaScript?](#what-is-javascript)
  - [Why Use JavaScript?](#why-use-javascript)
  - [What JavaScript can do?](#what-javascript-can-do)
  - [What Can In-Browser JavaScript Do?](#what-can-in-browser-javascript-do)
  - [What Can’t In-Browser JavaScript Do?](#what-cant-in-browser-javascript-do)
  - [What Makes JavaScript a Unique language?](#what-makes-javascript-a-unique-language)
- [Getting Started with JavaScript](#getting-started-with-javascript)
  - [Example 1: Inline JavaScript](#example-1-inline-javascript)
  - [Example 2: External JavaScript](#example-2-external-javascript)
- [JavaScript Basics](#javascript-basics)
  - [1. Variables](#1-variables)
  - [2. Data Types](#2-data-types)
  - [3. Functions](#3-functions)
  - [4. Control Structures](#4-control-structures)
  - [5. DOM Manipulation](#5-dom-manipulation)
- [JavaScript Literals](#javascript-literals)
  - [1. Numeric Literals](#1-numeric-literals)
  - [2. String Literals](#2-string-literals)
  - [3. Boolean Literals](#3-boolean-literals)
  - [4. Null Literal](#4-null-literal)
  - [5. Undefined Literal](#5-undefined-literal)
  - [6. Object Literals](#6-object-literals)
  - [7. Array Literals](#7-array-literals)
- [Template Literals](#template-literals)
  - [Syntax of Template Literals](#syntax-of-template-literals)
- [JavaScript Variables](#javascript-variables)
  - [Variable Naming Rules](#variable-naming-rules)
  - [`var` vs `let`](#var-vs-let)
- [JavaScript Data Types](#javascript-data-types)
  - [Primitive Data Types](#primitive-data-types)
  - [Reference Data Types](#reference-data-types)
- [Type Coercion](#type-coercion)
- [Operators](#operators)
  - [1. Arithmetic Operators](#1-arithmetic-operators)
    - [Addition (+)](#addition-)
    - [Subtraction (-)](#subtraction--)
    - [Multiplication (\*)](#multiplication-)
    - [Division (/)](#division-)
    - [Modulus (%)](#modulus-)
    - [Increment (++) and Decrement (--)](#increment--and-decrement---)
  - [2. Assignment Operators](#2-assignment-operators)
    - [Assignment (=)](#assignment-)
    - [Addition Assignment (+=)](#addition-assignment-)
    - [Subtraction Assignment (-=)](#subtraction-assignment--)
  - [3. Comparison Operators](#3-comparison-operators)
    - [Equality (`==`)](#equality-)
    - [Inequality (`!=`)](#inequality-)
    - [Strict Equality (`===`)](#strict-equality-)
    - [Strict Inequality (`!==`)](#strict-inequality-)
    - [Greater Than (`>`), Less Than (`<`), Greater Than or Equal (`>=`), Less Than or Equal (`<=`)](#greater-than--less-than--greater-than-or-equal--less-than-or-equal-)
    - [Comparison Operators and Data Types](#comparison-operators-and-data-types)
      - [Type Coercion with Equality (`==`) and Inequality (`!=`)](#type-coercion-with-equality--and-inequality-)
      - [Strict Comparison with Strict Equality (`===`) and Strict Inequality (`!==`)](#strict-comparison-with-strict-equality--and-strict-inequality-)
    - [Equality vs. Identity](#equality-vs-identity)
      - [Equality (`==`)](#equality--1)
      - [Identity (`===`)](#identity-)
    - [Common Pitfalls](#common-pitfalls)
      - [Type Coercion Surprises](#type-coercion-surprises)
      - [NaN and Comparison](#nan-and-comparison)
  - [4. Logical Operators](#4-logical-operators)
    - [Logical AND (\&\&)](#logical-and-)
    - [Logical OR (||)](#logical-or-)
    - [Logical NOT (!)](#logical-not-)
  - [5. Bitwise Operators](#5-bitwise-operators)
    - [Bitwise AND (\&)](#bitwise-and-)
    - [Bitwise OR (|)](#bitwise-or-)
    - [Bitwise XOR (^)](#bitwise-xor-)
  - [6. Conditional (Ternary) Operator](#6-conditional-ternary-operator)
  - [7. Unary Operators](#7-unary-operators)
    - [Unary Plus (+) and Unary Negation (-)](#unary-plus--and-unary-negation--)
    - [Unary NOT (!)](#unary-not-)
  - [8. Type Operators](#8-type-operators)
    - [typeof Operator](#typeof-operator)
    - [instanceof Operator](#instanceof-operator)
- [Checking Data Types](#checking-data-types)
- [The Ins and Outs of `typeof` in JavaScript](#the-ins-and-outs-of-typeof-in-javascript)
  - [Data Types and `typeof`](#data-types-and-typeof)
    - [Number](#number)
    - [String](#string)
    - [Boolean](#boolean)
    - [Undefined](#undefined)
    - [Null](#null)
    - [Object](#object)
    - [Function](#function)
  - [Common Pitfalls](#common-pitfalls-1)
    - [Null Is Not "null"](#null-is-not-null)
    - [Non-Existent Variables](#non-existent-variables)
  - [Advanced Usage](#advanced-usage)
    - [Checking for Functions](#checking-for-functions)
    - [Handling Arrays](#handling-arrays)
- [Conditional Constructs](#conditional-constructs)
  - [The `if` Statement](#the-if-statement)
  - [The `else` Clause](#the-else-clause)
  - [The `else if` Clause](#the-else-if-clause)
  - [Switch Statement](#switch-statement)
  - [Truthy and Falsy Values](#truthy-and-falsy-values)
    - [Falsy Values](#falsy-values)
    - [Truthy Values](#truthy-values)
  - [Short-Circuit Evaluation](#short-circuit-evaluation)
- [Looping Constructs](#looping-constructs)
  - [The `for` Loop](#the-for-loop)
  - [The `while` Loop](#the-while-loop)
  - [The `do...while` Loop](#the-dowhile-loop)
  - [The `for...in` Loop](#the-forin-loop)
  - [The `for...of` Loop](#the-forof-loop)
  - [Loop Control Statements](#loop-control-statements)
    - [`break` Statement](#break-statement)
    - [`continue` Statement](#continue-statement)
  - [Common Pitfalls of looping constructs](#common-pitfalls-of-looping-constructs)
    - [Infinite Loops](#infinite-loops)
    - [Off-by-One Errors](#off-by-one-errors)
  - [Iterating Arrays with `forEach`](#iterating-arrays-with-foreach)
- [Objects and JSON](#objects-and-json)
  - [Creating Objects](#creating-objects)
    - [Object Literal](#object-literal)
    - [Constructor Function](#constructor-function)
  - [Working with Object Properties](#working-with-object-properties)
    - [Accessing Properties](#accessing-properties)
    - [Modifying Properties](#modifying-properties)
    - [Adding Properties](#adding-properties)
    - [Deleting Properties](#deleting-properties)
  - [Nested Objects](#nested-objects)
  - [JSON: JavaScript Object Notation](#json-javascript-object-notation)
    - [JSON Syntax](#json-syntax)
    - [JSON Data Types](#json-data-types)
  - [Converting Between Objects and JSON](#converting-between-objects-and-json)
    - [Object to JSON](#object-to-json)
    - [JSON to Object](#json-to-object)
  - [Common Pitfalls](#common-pitfalls-2)
    - [JSON Limitations](#json-limitations)
    - [Property Order](#property-order)
  - [Advanced Techniques](#advanced-techniques)
    - [Object Methods](#object-methods)
    - [Object Destructuring](#object-destructuring)

## Introduction to JavaScript

### What is JavaScript?

- JavaScript is a client side scripting language.
- It is used to make web pages alive.
- It is used to programmatically perform actions within the page.
- When JavaScript was created, it was initially called “LiveScript”.
- But Java was a very popular language at that time, so it was decided that positioning a language as a “younger brother” of Java would help.
- It requires substantial updates to maintain its different versions. The ECMA is a standard maintained for any of the scripting languages that pushes for new updates. The ECMA was first launched in 1997.

### Why Use JavaScript?

1. **Client-Side Interactivity:** Allows you to create interactive features on websites, such as form validation, animations, and user interface enhancements, without relying on server-side processing.

2. **Cross-Browser Compatibility:** Works across different web browsers, making it a versatile choice for web developers.

3. **Ecosystem:** Vast ecosystem of libraries and frameworks, like React, Angular, and Vue.js, which simplify and expedite web development.

4. **Server-Side Development:** With Node.js, JavaScript can also be used for server-side programming, allowing for full-stack development with a single language.

### What JavaScript can do?

- JavaScript can execute not only in the browser, but also on the server.
- We will use JavaScript as a client as well as server side language.
- JavaScript has evolved greatly as a language and is now used to perform a wide variety of tasks

### What Can In-Browser JavaScript Do?

- If JavaScripts are used in any websites, then it should not be given any low level CPU permissions like switching off the CPU etc. That is why JavaScript is made with extremely safe permissions that does not have any permission to access low level CPU usage

- JavaScript can add new HTML and change existing HTML from DOM.
- It can even react to any events (actions).
- It can also manage the AJAX requests (GET or POST request)
- JavaScript can get and set cookies and use local storage.

### What Can’t In-Browser JavaScript Do?

- JavaScript cannot read or write to and from computer hard disk without user permissions
- The browser does not allow the JavaScript of any website to collect the AJAX information of the other website because it generates the error of  same origin policy.

### What Makes JavaScript a Unique language?

- It has a complete integration of HTML and CSS. They provide it with a lot of extra support
- It provides the use of simple APIs (Application Programming Interface)
- It also supports the major modern browsers which are enabled by default. If you turn off the feature of JavaScript in the browser, you cannot access any website.

## Getting Started with JavaScript

Can embed JavaScript code directly within an HTML document using `<script>` tags or create separate `.js` files and reference them in your HTML.

### Example 1: Inline JavaScript

```html
<!DOCTYPE html>
<html>
<head>
    <title>Inline JavaScript Example</title>
</head>
<body>
    <button onclick="sayHello()">Click me</button>

    <script>
        function sayHello() {
            alert("Hello, world!");
        }
    </script>
</body>
</html>
```

In this example, we have an HTML document containing a button element and an inline JavaScript function that displays an alert when the button is clicked.

### Example 2: External JavaScript

Create a new file called `script.js` with the following content:

```javascript
function greetUser() {
    let name = prompt("What's your name?");
    alert(`Hello, ${name}!`);
}
```

Then, reference this external script in your HTML:

```html
<!DOCTYPE html>
<html>
<head>
    <title>External JavaScript Example</title>
</head>
<body>
    <button onclick="greetUser()">Greet me</button>

    <script src="script.js"></script>
</body>
</html>
```

This demonstrates how to use an external JavaScript file and the `prompt` function to interact with the user.

## JavaScript Basics

### 1. Variables

Variables are used to store and manipulate data. You can declare variables using `var`, `let`, or `const`. For example:

```javascript
let age = 25;
const name = "John";
```

### 2. Data Types

JavaScript supports various data types, including numbers, strings, booleans, objects, arrays, and more.

```javascript
let num = 42;
let greeting = "Hello, world!";
let isTrue = true;
let person = { name: "Alice", age: 30 };
let fruits = ["apple", "banana", "cherry"];
```

### 3. Functions

Functions are reusable blocks of code that perform specific tasks. You can define functions and call them when needed.

```javascript
function add(a, b) {
    return a + b;
}

let result = add(5, 7); // result will be 12
```

### 4. Control Structures

JavaScript provides control structures like `if`, `else`, `for`, and `while` for making decisions and repeating actions.

```javascript
if (age >= 18) {
    console.log("You are an adult.");
} else {
    console.log("You are a minor.");
}

for (let i = 0; i < 5; i++) {
    console.log(`Iteration ${i}`);
}
```

### 5. DOM Manipulation

The Document Object Model (DOM) is a programming interface that allows JavaScript to interact with HTML and CSS to dynamically change the content and structure of web pages.

```javascript
let element = document.getElementById("myElement");
element.innerHTML = "New content";
element.style.color = "red";
```

## JavaScript Literals

- Represent fixed values that you directly include in your code
- Used to create and initialize variables

### 1. Numeric Literals

Numeric literals represent numbers. They can be integers or floating-point numbers.

```javascript
let integerLiteral = 42;
let floatLiteral = 3.14;
```

### 2. String Literals

String literals represent text. You can use single (''), double ("") or backticks (\`\`) to create strings.

```javascript
let singleQuoted = 'Hello, world!';
let doubleQuoted = "JavaScript is fun!";
let templateString = `My name is ${name}`;
```

### 3. Boolean Literals

Boolean literals represent true or false values.

```javascript
let isTrue = true;
let isFalse = false;
```

### 4. Null Literal

The null literal represents the intentional absence of any object value.

```javascript
let emptyValue = null;
```

### 5. Undefined Literal

The undefined literal represents a variable that has been declared but not assigned a value.

```javascript
let x;
console.log(x); // Outputs: undefined
```

### 6. Object Literals

Object literals represent collections of key-value pairs enclosed in curly braces `{}`.

```javascript
let person = {
    name: 'Alice',
    age: 30,
    address: {
        street: '123 Main St',
        city: 'Anytown'
    }
};
```

### 7. Array Literals

Array literals represent ordered lists of values, typically of the same type, enclosed in square brackets `[]`.

```javascript
let colors = ['red', 'green', 'blue'];
let numbers = [1, 2, 3, 4, 5];
```

## Template Literals

Template literals are enclosed in backticks (\`\`) instead of single ('') or double ("") quotes, which are used for regular strings. Template literals offer several advantages over traditional strings:

1. **Multiline Strings**: You can write multiline strings without needing to use newline characters (`\n`).

2. **String Interpolation**: You can embed variables and expressions directly within the string using `${...}`.

3. **Expression Evaluation**: Expressions inside `${}` are evaluated, allowing you to perform calculations or call functions within the string.

4. **Easier to Read**: Template literals often result in more readable and maintainable code, especially for complex strings.

### Syntax of Template Literals

The basic syntax of a template literal is as follows:

```javascript
`string text ${expression} string text`
```

- The backticks (\`\`) enclose the entire template literal.
- `${expression}` is a placeholder where you can insert variables or expressions.
- `string text` can be any string content, including multiline text.

**Example 1: Basic Usage**

```javascript
const name = "Alice";
const greeting = `Hello, ${name}!`;

console.log(greeting); // Outputs: "Hello, Alice!"
```

In this example, we use a template literal to create a greeting string that includes the value of the `name` variable within `${}`.

**Example 2: Multiline Strings**

```javascript
const multiline = `
    This is a
    multiline string.
`;

console.log(multiline);
// Outputs:
//     This is a
//     multiline string.
```

Template literals make it easy to create multiline strings without using explicit newline characters.

**Example 3: Expression Evaluation**

```javascript
const a = 5;
const b = 10;
const sumMessage = `The sum of ${a} and ${b} is ${a + b}.`;

console.log(sumMessage); // Outputs: "The sum of 5 and 10 is 15."
```

You can perform calculations and include the results directly within the template literal.

## JavaScript Variables

- Variables in JavaScript are used to store and manipulate data
- To declare a variable, you can use `var`, `let`, or `const`:
  - `var` (function-scoped): Variables declared with `var` are function-scoped, which means they are accessible throughout the function where they are declared.

  - `let` (block-scoped): Variables declared with `let` are block-scoped, meaning they are only accessible within the block where they are defined.

  - `const` (block-scoped, immutable): Constants declared with `const` are also block-scoped, but their values cannot be changed once assigned.

**Example 1: Using `var`**

```javascript
function exampleVar() {
    var x = 10;
    if (true) {
        var x = 20; // This will affect the outer variable x
    }
    console.log(x); // Outputs: 20
}
exampleVar();
```

**Example 2: Using `let`**

```javascript
function exampleLet() {
    let y = 10;
    if (true) {
        let y = 20; // This creates a new block-scoped variable y
    }
    console.log(y); // Outputs: 10
}
exampleLet();
```

**Example 3: Using `const`**

```javascript
function exampleConst() {
    const z = 10;
    // Attempting to reassign a constant will result in an error
    // z = 20; // Error: Assignment to constant variable
    console.log(z); // Outputs: 10
}
exampleConst();
```

### Variable Naming Rules

- Use meaningful names that describe the variable's purpose.
- Variables are **case-sensitive** (`myVar` and `myvar` are different).
- Start variable names with a letter, underscore (_), or dollar sign ($).
- Subsequent characters can be letters, numbers, underscores, or dollar signs.

### `var` vs `let`

| Feature                       | `var`                                | `let`                               |
| ------------------------------ | ------------------------------------ | ----------------------------------- |
| Variable Scope                | Function scope                      | Block scope                         |
| Hoisting                       | Hoisted to the top of the function  | Hoisted to the top of the block    |
| Re-declaration Allowed         | Yes                                  | No                                  |
| Temporal Dead Zone (TDZ)       | No                                   | Yes                                 |
| Initialization Required        | No                                   | Yes (unless declared with `undefined`) |
| Global Object Property         | Yes (`var` variables attach to the global object) | No                                  |
| Use in Loops                  | Prone to unexpected behavior in loops | Recommended for loop-scoped variables |
| ES6 and Later                 | Considered outdated and discouraged  | Recommended for modern JavaScript   |


1. **Variable Scope**:
   - `var` has a function scope. Variables declared with `var` are accessible throughout the entire function in which they are declared.
   - `let` has a block scope. Variables declared with `let` are only accessible within the block (enclosed by curly braces) where they are defined.

2. **Hoisting**:
   - Variables declared with `var` are hoisted to the top of their function or global scope. This means you can use a `var` variable before it's declared in code, although it will be `undefined`.
   - Variables declared with `let` are hoisted to the top of their block scope but remain in the "Temporal Dead Zone" (TDZ) until they are actually declared in code. Accessing them before declaration results in a `ReferenceError`.

3. **Re-declaration Allowed**:
   - With `var`, you can re-declare a variable within the same scope without any error.
   - `let` does not allow you to re-declare a variable with the same name within the same block scope. It will result in a `SyntaxError`.

4. **Temporal Dead Zone (TDZ)**:
   - The TDZ is a phase between entering the scope and the actual declaration of a `let` variable. During this phase, accessing the variable results in a `ReferenceError`. This helps catch variable-related issues early.

5. **Initialization Required**:
   - Variables declared with `var` are not required to be initialized at the time of declaration. They will have the value `undefined` by default.
   - Variables declared with `let` are required to be initialized at the time of declaration. If not initialized, they will remain in the TDZ until a value is assigned.

6. **Global Object Property**:
   - Variables declared with `var` at the global scope become properties of the global object (e.g., `window` in browsers). This can lead to unexpected behavior and namespace pollution.
   - Variables declared with `let` at the global scope do not become properties of the global object. They stay within their respective scope.

7. **Use in Loops**:
   - Variables declared with `var` in loops may have unexpected behavior due to their function scope. They are often used incorrectly and can lead to unintended results.
   - Variables declared with `let` in loops have block scope, making them suitable for loop variables and preventing common issues associated with `var` in loops.

8. **ES6 and Later**:
   - `var` is part of the older ECMAScript standards and is considered outdated and discouraged in modern JavaScript development.
   - `let` was introduced in ECMAScript 6 (ES6) and is recommended for use in modern JavaScript code. It offers better scoping and safer variable behavior.

- `let` and is generally preferred in modern JavaScript development. It is more predictable and helps in writing safer and more maintainable code.

## JavaScript Data Types

- Data types categorize values and determine how they can be manipulated. 
- JavaScript has two main categories of data types: **primitive data types** and **reference data types**.

### Primitive Data Types

- Primitive data types are immutable, meaning their values cannot be changed once they are assigned

1. **Number**: Represents numeric values. It includes integers, floats, and special values like `NaN` and `Infinity`.

    ```javascript
    let age = 30;
    let pi = 3.14159;
    let notANumber = NaN;
    let positiveInfinity = Infinity;
    ```

2. **String**: Represents text. Strings are enclosed in single (''), double ("") or backticks (\`\`) quotes.

    ```javascript
    let name = 'John';
    let message = "Hello, world!";
    let templateString = `My name is ${name}`;
    ```

3. **Boolean**: Represents either `true` or `false`, often used for conditional statements.

    ```javascript
    let isOnline = true;
    let isWorking = false;
    ```

4. **Undefined**: Represents a variable that has been declared but not assigned a value.

    ```javascript
    let x;
    console.log(x); // Outputs: undefined
    ```

5. **Null**: Represents the absence of a value or an intentionally empty value.

    ```javascript
    let emptyValue = null;
    ```

6. **Symbol (ES6)**: Represents a unique and immutable value, often used as object property keys.

    ```javascript
    const uniqueKey = Symbol('description');
    ```

### Reference Data Types

- Reference data types are mutable and store references to objects

1. **Object**: Represents a collection of key-value pairs (properties and methods).

    ```javascript
    let person = {
        name: 'Alice',
        age: 25,
        sayHello: function() {
            console.log('Hello!');
        }
    };
    ```

2. **Array**: Represents an ordered list of values, typically of the same type.

    ```javascript
    let colors = ['red', 'green', 'blue'];
    let numbers = [1, 2, 3, 4, 5];
    ```

3. **Function**: Functions in JavaScript are first-class objects, which means they can be assigned to variables, passed as arguments, and returned from other functions.

    ```javascript
    function add(a, b) {
        return a + b;
    }
    ```

## Type Coercion

JavaScript has a concept called **type coercion**, which can lead to unexpected behavior if you're not careful. Type coercion is the automatic conversion of values from one data type to another.

For example:

```javascript
let num = 5;
let str = '10';

console.log(num + str); // Outputs: "510"
```

Here, JavaScript coerces the number `5` to a string and then concatenates it with the string `'10'`.

## Operators

### 1. Arithmetic Operators

Arithmetic operators are used to perform mathematical operations on numbers.

#### Addition (+)

```javascript
let sum = 5 + 3; // Result: 8
```

#### Subtraction (-)

```javascript
let difference = 10 - 4; // Result: 6
```

#### Multiplication (*)

```javascript
let product = 6 * 7; // Result: 42
```

#### Division (/)

```javascript
let quotient = 20 / 4; // Result: 5
```

#### Modulus (%)

```javascript
let remainder = 17 % 3; // Result: 2
```

#### Increment (++) and Decrement (--)

```javascript
let count = 5;
count++; // Increment by 1, count is now 6
count--; // Decrement by 1, count is now 5 again
```

### 2. Assignment Operators

Assignment operators are used to assign values to variables.

#### Assignment (=)

```javascript
let x = 10;
```

#### Addition Assignment (+=)

```javascript
let y = 5;
y += 3; // Equivalent to y = y + 3, y is now 8
```

#### Subtraction Assignment (-=)

```javascript
let z = 10;
z -= 2; // Equivalent to z = z - 2, z is now 8
```

### 3. Comparison Operators

Comparison operators are used to compare two values or expressions and return a Boolean result (either `true` or `false`). JavaScript provides several comparison operators, each with specific use cases.

#### Equality (`==`)

The equality operator (`==`) checks if two values are equal, performing type coercion if needed.

```javascript
let a = 5;
let b = "5";

console.log(a == b); // Outputs: true (coerced comparison)
```

#### Inequality (`!=`)

The inequality operator (`!=`) checks if two values are not equal, performing type coercion if needed.

```javascript
let x = 10;
let y = "10";

console.log(x != y); // Outputs: false (coerced comparison)
```

#### Strict Equality (`===`)

The strict equality operator (`===`) checks if two values are equal without type coercion.

```javascript
let m = 42;
let n = "42";

console.log(m === n); // Outputs: false (strict comparison)
```

#### Strict Inequality (`!==`)

The strict inequality operator (`!==`) checks if two values are not equal without type coercion.

```javascript
let p = 3;
let q = "3";

console.log(p !== q); // Outputs: true (strict comparison)
```

#### Greater Than (`>`), Less Than (`<`), Greater Than or Equal (`>=`), Less Than or Equal (`<=`)

These operators compare numerical values.

```javascript
let num1 = 5;
let num2 = 10;

console.log(num1 > num2); // Outputs: false
console.log(num1 < num2); // Outputs: true
console.log(num1 >= num2); // Outputs: false
console.log(num1 <= num2); // Outputs: true
```

#### Comparison Operators and Data Types

Comparison operators can behave differently depending on the data types of the values being compared.

##### Type Coercion with Equality (`==`) and Inequality (`!=`)

When using the equality and inequality operators, JavaScript performs type coercion if the operands have different data types.

```javascript
let a = 5;
let b = "5";

console.log(a == b); // Outputs: true (coerced comparison)
console.log(a != b); // Outputs: false (coerced comparison)
```

##### Strict Comparison with Strict Equality (`===`) and Strict Inequality (`!==`)

Strict equality and strict inequality operators do not perform type coercion. They compare both the values and data types.

```javascript
let m = 42;
let n = "42";

console.log(m === n); // Outputs: false (strict comparison)
console.log(m !== n); // Outputs: true (strict comparison)
```

#### Equality vs. Identity

JavaScript has two types of equality: equality (`==`) and identity (`===`).

##### Equality (`==`)

The equality operator compares values after performing type coercion if necessary. It checks whether values are equal in terms of their content.

```javascript
let a = 5;
let b = "5";

console.log(a == b); // Outputs: true (coerced comparison)
```

##### Identity (`===`)

The identity operator compares values without type coercion. It checks whether values are both equal in content and have the same data type.

```javascript
let m = 42;
let n = "42";

console.log(m === n); // Outputs: false (strict comparison)
```

#### Common Pitfalls

##### Type Coercion Surprises

Beware of type coercion when using `==` and `!=` as it can lead to unexpected results.

```javascript
console.log(0 == false); // Outputs: true (coerced comparison)
console.log("" == false); // Outputs: true (coerced comparison)
```

##### NaN and Comparison

Comparing `NaN` using any comparison operator (including `===` and `!==`) will always result in `false`.

```javascript
console.log(NaN === NaN); // Outputs: false
```

### 4. Logical Operators

Logical operators are used to combine or manipulate Boolean values.

#### Logical AND (&&)

```javascript
let isTrue = true;
let isFalse = false;

console.log(isTrue && isFalse); // false
```

#### Logical OR (||)

```javascript
console.log(isTrue || isFalse); // true
```

#### Logical NOT (!)

```javascript
console.log(!isTrue); // false
```

### 5. Bitwise Operators

Bitwise operators perform bit-level manipulation on integers.

#### Bitwise AND (&)

```javascript
let x = 5; // Binary: 0101
let y = 3; // Binary: 0011

console.log(x & y); // Result: 1 (Binary: 0001)
```

#### Bitwise OR (|)

```javascript
console.log(x | y); // Result: 7 (Binary: 0111)
```

#### Bitwise XOR (^)

```javascript
console.log(x ^ y); // Result: 6 (Binary: 0110)
```

### 6. Conditional (Ternary) Operator

The conditional operator allows for concise conditional expressions.

```javascript
let age = 18;
let message = (age >= 18) ? "Adult" : "Minor";
console.log(message); // "Adult"
```

### 7. Unary Operators

Unary operators operate on a single operand.

#### Unary Plus (+) and Unary Negation (-)

```javascript
let number = 5;
console.log(+number); // 5
console.log(-number); // -5
```

#### Unary NOT (!)

```javascript
console.log(!true); // false
console.log(!false); // true
```

### 8. Type Operators

Type operators are used to determine the data type of a value.

#### typeof Operator

```javascript
let value = 42;
console.log(typeof value); // "number"
```

#### instanceof Operator

```javascript
class Vehicle {}
let car = new Vehicle();
console.log(car instanceof Vehicle); // true
```

## Checking Data Types

You can check the data type of a variable or expression using the `typeof` operator:

```javascript
console.log(typeof age); // Outputs: "number"
console.log(typeof name); // Outputs: "string"
console.log(typeof isOnline); // Outputs: "boolean"
console.log(typeof person); // Outputs: "object"
```

## The Ins and Outs of `typeof` in JavaScript

The `typeof` operator is a built-in operator in JavaScript that returns a string representing the data type of a value or expression. It is often used for debugging, conditional statements, and type checking.

### Data Types and `typeof`

JavaScript has several fundamental data types, and `typeof` is particularly useful for identifying them.

#### Number

```javascript
let num = 42;
console.log(typeof num); // Outputs: "number"
```

#### String

```javascript
let text = "Hello, world!";
console.log(typeof text); // Outputs: "string"
```

#### Boolean

```javascript
let isTrue = true;
console.log(typeof isTrue); // Outputs: "boolean"
```

#### Undefined

```javascript
let undefinedVar;
console.log(typeof undefinedVar); // Outputs: "undefined"
```

#### Null

```javascript
let nullVar = null;
console.log(typeof nullVar); // Outputs: "object" (Note: This is a known JavaScript quirk)
```

#### Object

```javascript
let person = { name: "Alice", age: 30 };
console.log(typeof person); // Outputs: "object"
```

#### Function

```javascript
function greet() {
    console.log("Hello!");
}

console.log(typeof greet); // Outputs: "function"
```

### Common Pitfalls

#### Null Is Not "null"

One common pitfall is that `typeof null` returns "object," which is a historical quirk in JavaScript. Be cautious when using `typeof` to check for null values.

```javascript
let nullValue = null;
console.log(typeof nullValue); // Outputs: "object"
```

#### Non-Existent Variables

When using `typeof` on variables that haven't been declared, it does not throw an error; instead, it returns "undefined."

```javascript
console.log(typeof undefinedVariable); // Outputs: "undefined"
```

### Advanced Usage

#### Checking for Functions

You can use `typeof` to check if a variable is a function before calling it.

```javascript
function greet() {
    console.log("Hello!");
}

if (typeof greet === "function") {
    greet(); // Call the function
}
```

#### Handling Arrays

`typeof` cannot reliably distinguish between arrays and objects. To check if a value is an array, use `Array.isArray()` instead.

```javascript
let arr = [1, 2, 3];
console.log(Array.isArray(arr)); // Outputs: true
```

## Conditional Constructs

### The `if` Statement

The `if` statement is the most basic form of conditional construct. It executes a block of code if a specified condition is true.

**Syntax:**

```javascript
if (condition) {
    // Code to be executed if the condition is true
}
```

**Example:**

```javascript
let age = 25;

if (age >= 18) {
    console.log("You are an adult.");
}
```

### The `else` Clause

The `else` clause can be used with the `if` statement to specify a block of code to be executed if the condition is false.

**Syntax:**

```javascript
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}
```

**Example:**

```javascript
let age = 15;

if (age >= 18) {
    console.log("You are an adult.");
} else {
    console.log("You are a minor.");
}
```

### The `else if` Clause

You can use the `else if` clause to specify additional conditions to check if the previous condition is false.

**Syntax:**

```javascript
if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if none of the conditions are true
}
```

**Example:**

```javascript
let score = 75;

if (score >= 90) {
    console.log("A");
} else if (score >= 80) {
    console.log("B");
} else if (score >= 70) {
    console.log("C");
} else {
    console.log("D");
}
```

### Switch Statement

The `switch` statement is used to evaluate an expression against multiple possible case values.

**Syntax:**

```javascript
switch (expression) {
    case value1:
        // Code to execute if expression matches value1
        break;
    case value2:
        // Code to execute if expression matches value2
        break;
    // ...
    default:
        // Code to execute if no cases match
}
```

**Example:**

```javascript
let day = "Monday";

switch (day) {
    case "Monday":
        console.log("It's the start of the workweek.");
        break;
    case "Saturday":
    case "Sunday":
        console.log("It's the weekend!");
        break;
    default:
        console.log("It's a weekday, but not Monday.");
}
```

### Truthy and Falsy Values

JavaScript has truthy and falsy values, which are non-boolean values that are evaluated as either true or false in a boolean context.

#### Falsy Values

- `false`
- `0` (zero)
- `""` (empty string)
- `null`
- `undefined`
- `NaN` (Not-a-Number)

#### Truthy Values

Any value that is not falsy is truthy.

```javascript
if (0) {
    console.log("This won't be executed.");
} else {
    console.log("This will be executed.");
}
```

### Short-Circuit Evaluation

Logical operators (`&&` and `||`) use short-circuit evaluation. They only evaluate the second operand if necessary.

## Looping Constructs

### The `for` Loop

The `for` loop is a widely used looping construct that allows you to iterate over a range of values.

**Syntax:**

```javascript
for (initialization; condition; increment/decrement) {
    // Code to be executed in each iteration
}
```

**Example:**

```javascript
for (let i = 0; i < 5; i++) {
    console.log(i);
}
```

### The `while` Loop

The `while` loop repeatedly executes a block of code as long as a specified condition remains true.

**Syntax:**

```javascript
while (condition) {
    // Code to be executed in each iteration
}
```

**Example:**

```javascript
let count = 0;

while (count < 5) {
    console.log(count);
    count++;
}
```

### The `do...while` Loop

The `do...while` loop is similar to the `while` loop but guarantees that the code block is executed at least once before checking the condition.

**Syntax:**

```javascript
do {
    // Code to be executed in each iteration
} while (condition);
```

**Example:**

```javascript
let num = 0;

do {
    console.log(num);
    num++;
} while (num < 5);
```

### The `for...in` Loop

The `for...in` loop is used to iterate over the properties of an object.

**Syntax:**

```javascript
for (variable in object) {
    // Code to be executed in each iteration
}
```

**Example:**

```javascript
const person = {
    name: "Alice",
    age: 30,
    city: "Anytown"
};

for (let key in person) {
    console.log(key + ": " + person[key]);
}
```

### The `for...of` Loop

The `for...of` loop is used to iterate over the values of iterable objects, such as arrays and strings.

**Syntax:**

```javascript
for (variable of iterable) {
    // Code to be executed in each iteration
}
```

**Example:**

```javascript
const colors = ["red", "green", "blue"];

for (let color of colors) {
    console.log(color);
}
```

### Loop Control Statements

JavaScript provides loop control statements to modify the flow of loops.

#### `break` Statement

The `break` statement is used to exit a loop prematurely.

```javascript
for (let i = 0; i < 5; i++) {
    if (i === 3) {
        break;
    }
    console.log(i);
}
```

#### `continue` Statement

The `continue` statement is used to skip the current iteration and proceed to the next one.

```javascript
for (let i = 0; i < 5; i++) {
    if (i === 2) {
        continue;
    }
    console.log(i);
}
```

### Common Pitfalls of looping constructs

#### Infinite Loops

Be cautious when writing loops to avoid creating infinite loops that never terminate.

```javascript
// Infinite loop, no termination condition
while (true) {
    console.log("This will run forever!");
}
```

#### Off-by-One Errors

Pay attention to loop bounds to avoid off-by-one errors.

```javascript
for (let i = 0; i <= 5; i++) {
    console.log(i); // Outputs 0 to 5, not just 0 to 4
}
```

### Iterating Arrays with `forEach`

The `forEach` method is a more modern way to iterate over arrays.

```javascript
const colors = ["red", "green", "blue"];

colors.forEach(function (color) {
    console.log(color);
});
```

## Objects and JSON

- Objects are collections of key-value pairs, where each key is a string (or symbol), and each value can be any data type
- JSON is a text-based data interchange format that closely resembles JavaScript object literals
- JSON is often used to exchange data between a server and a web application

### Creating Objects

#### Object Literal

You can create an object using an object literal, which consists of curly braces `{}` and key-value pairs separated by colons `:`.

```javascript
const person = {
    name: "Alice",
    age: 30,
    city: "Anytown"
};
```

#### Constructor Function

You can also create objects using constructor functions.

```javascript
function Person(name, age, city) {
    this.name = name;
    this.age = age;
    this.city = city;
}

const person = new Person("Alice", 30, "Anytown");
```

### Working with Object Properties

#### Accessing Properties

You can access object properties using dot notation or square brackets.

```javascript
console.log(person.name); // "Alice"
console.log(person["age"]); // 30
```

#### Modifying Properties

You can modify object properties by assigning new values.

```javascript
person.age = 31;
person["city"] = "Newtown";
```

#### Adding Properties

You can add new properties to an object.

```javascript
person.job = "Engineer";
```

#### Deleting Properties

You can delete object properties using the `delete` operator.

```javascript
delete person.city;
```

### Nested Objects

Objects can contain other objects, creating nested structures.

```javascript
const address = {
    street: "123 Main St",
    zip: "12345"
};

const person = {
    name: "Alice",
    age: 30,
    address: address
};
```

### JSON: JavaScript Object Notation

- Lightweight data interchange format that is easy for humans to read and write, and easy for machines to parse and generate
- JSON objects resemble JavaScript object literals but are expressed as strings.

#### JSON Syntax

```json
{
    "key1": "value1",
    "key2": "value2",
    "key3": "value3"
}
```

#### JSON Data Types

JSON supports the following data types:

- Strings: `"Hello, JSON!"`
- Numbers: `42`
- Booleans: `true` or `false`
- Null: `null`
- Arrays: `["apple", "banana", "cherry"]`
- Objects: `{"name": "Alice", "age": 30}`

### Converting Between Objects and JSON

#### Object to JSON

You can convert JavaScript objects to JSON using `JSON.stringify()`.

```javascript
const person = {
    name: "Alice",
    age: 30
};

const personJSON = JSON.stringify(person);
```

#### JSON to Object

You can convert JSON strings to JavaScript objects using `JSON.parse()`.

```javascript
const personJSON = '{"name": "Alice", "age": 30}';
const person = JSON.parse(personJSON);
```

### Common Pitfalls

#### JSON Limitations

JSON has some limitations compared to JavaScript objects. It cannot represent functions, undefined values, or cyclical references.

```javascript
const data = {
    func: function() {
        console.log("This cannot be represented in JSON.");
    },
    undef: undefined
};
const dataJSON = JSON.stringify(data); // Errors
```

#### Property Order

The order of properties in JavaScript objects is not guaranteed, while JSON objects maintain property order as of ES6.

```javascript
const person = {
    age: 30,
    name: "Alice"
};
const personJSON = '{"age": 30, "name": "Alice"}';
```

### Advanced Techniques

#### Object Methods

Objects can have methods (functions) as properties.

```javascript
const circle = {
    radius: 5,
    area: function() {
        return Math.PI * this.radius * this.radius;
    }
};
console.log(circle.area()); // 78.54
```

#### Object Destructuring

You can use object destructuring to extract properties into variables.

```javascript
const person = {
    name: "Alice",
    age: 30
};

const { name, age } = person;
console.log(name); // "Alice"
console.log(age); // 30
```
