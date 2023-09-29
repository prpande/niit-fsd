<!-- omit in toc -->
# JavaScript Array Operations & Functions - 29/09

<!-- omit in toc -->
## Contents

- [JavaScript Built-in Array Functions](#javascript-built-in-array-functions)
  - [1. `push()`](#1-push)
  - [2. `unshift()`](#2-unshift)
  - [3. `pop()`](#3-pop)
  - [4. `shift()`](#4-shift)
  - [5. `splice()`](#5-splice)
  - [6. `forEach()`](#6-foreach)
  - [7. `map()`](#7-map)
  - [8. `filter()`](#8-filter)
  - [9. `slice()`](#9-slice)
  - [10. `find()`](#10-find)
  - [11. `indexOf()`](#11-indexof)
  - [12. `reduce()`](#12-reduce)
  - [13. `sort()`](#13-sort)
  - [14. `join()`](#14-join)
  - [15. `reverse()`](#15-reverse)
- [Spread Operator](#spread-operator)
  - [Basic Usage of the Spread Operator](#basic-usage-of-the-spread-operator)
  - [Concatenating Arrays](#concatenating-arrays)
  - [Copying Arrays](#copying-arrays)
  - [Spreading Elements in Function Arguments](#spreading-elements-in-function-arguments)
  - [Spreading Objects into Arrays](#spreading-objects-into-arrays)
  - [Spreading Strings and Iterables](#spreading-strings-and-iterables)
  - [Common Pitfalls](#common-pitfalls)
- [Function Expressions](#function-expressions)
  - [Features and Properties](#features-and-properties)
  - [Example](#example)
- [Arrow Functions](#arrow-functions)
  - [Features and Properties](#features-and-properties-1)
  - [Example](#example-1)
- [`for...in` Loop](#forin-loop)
  - [Features and Properties](#features-and-properties-2)
  - [Example](#example-2)
- [`for...of` Loop](#forof-loop)
  - [Features and Properties](#features-and-properties-3)
  - [Example](#example-3)
- [Function Chaining](#function-chaining)
  - [Features and Properties](#features-and-properties-4)
  - [Example](#example-4)

## JavaScript Built-in Array Functions

### 1. `push()`

The `push()` method adds one or more elements to the end of an array and returns the new length of the array.

```javascript
let fruits = ['apple', 'banana'];
let newLength = fruits.push('orange', 'cherry');
console.log(fruits); // ['apple', 'banana', 'orange', 'cherry']
console.log(newLength); // 4
```

### 2. `unshift()`

The `unshift()` method adds one or more elements to the beginning of an array and returns the new length of the array.

```javascript
let fruits = ['apple', 'banana'];
let newLength = fruits.unshift('orange', 'cherry');
console.log(fruits); // ['orange', 'cherry', 'apple', 'banana']
console.log(newLength); // 4
```

### 3. `pop()`

The `pop()` method removes the last element from an array and returns that element.

```javascript
let fruits = ['apple', 'banana', 'cherry'];
let removed = fruits.pop();
console.log(fruits); // ['apple', 'banana']
console.log(removed); // 'cherry'
```

### 4. `shift()`

The `shift()` method removes the first element from an array and returns that element.

```javascript
let fruits = ['apple', 'banana', 'cherry'];
let removed = fruits.shift();
console.log(fruits); // ['banana', 'cherry']
console.log(removed); // 'apple'
```

### 5. `splice()`

The `splice()` method can add or remove elements from an array at a specified index. It returns an array of the removed elements.

```javascript
let fruits = ['apple', 'banana', 'cherry'];
let removed = fruits.splice(1, 1, 'kiwi', 'grape');
console.log(fruits); // ['apple', 'kiwi', 'grape', 'cherry']
console.log(removed); // ['banana']
```

### 6. `forEach()`

The `forEach()` method executes a provided function once for each array element.

```javascript
let numbers = [1, 2, 3];
numbers.forEach(function (num) {
  console.log(num);
});
// Output:
// 1
// 2
// 3
```

### 7. `map()`

The `map()` method creates a new array by applying a function to each element of the original array.

```javascript
let numbers = [1, 2, 3];
let doubled = numbers.map(function (num) {
  return num * 2;
});
console.log(doubled); // [2, 4, 6]
```

### 8. `filter()`

The `filter()` method creates a new array with all elements that pass a test defined by a provided function.

```javascript
let numbers = [1, 2, 3, 4, 5];
let even = numbers.filter(function (num) {
  return num % 2 === 0;
});
console.log(even); // [2, 4]
```

### 9. `slice()`

The `slice()` method returns a shallow copy of a portion of an array into a new array.

```javascript
let fruits = ['apple', 'banana', 'cherry', 'date'];
let sliced = fruits.slice(1, 3);
console.log(sliced); // ['banana', 'cherry']
```

### 10. `find()`

The `find()` method returns the first element in an array that satisfies a provided testing function.

```javascript
let ages = [18, 21, 16, 25];
let adult = ages.find(function (age) {
  return age >= 18;
});
console.log(adult); // 18
```

### 11. `indexOf()`

The `indexOf()` method returns the first index at which a given element can be found in the array, or -1 if it is not present.

```javascript
let fruits = ['apple', 'banana', 'cherry'];
let index = fruits.indexOf('banana');
console.log(index); // 1
```

### 12. `reduce()`

The `reduce()` method reduces an array to a single value by applying a function to each element and accumulating the result.

```javascript
let numbers = [1, 2, 3, 4];
let sum = numbers.reduce(function (accumulator, current) {
  return accumulator + current;
}, 0);
console.log(sum); // 10
```

### 13. `sort()`

The `sort()` method sorts the elements of an array in place and returns the sorted array.

```javascript
let fruits = ['banana', 'cherry', 'apple'];
fruits.sort();
console.log(fruits); // ['apple', 'banana', 'cherry']
```

### 14. `join()`

The `join()` method creates and returns a new string by concatenating all the elements in an array.

```javascript
let fruits = ['apple', 'banana', 'cherry'];
let result = fruits.join(', ');
console.log(result); // 'apple, banana, cherry'
```

### 15. `reverse()`

The `reverse()` method reverses the order of elements in an array in place.

```javascript
let fruits = ['apple', 'banana', 'cherry'];
fruits.reverse();
console.log(fruits); // ['cherry', 'banana', 'apple']
```

## Spread Operator

The spread operator (`...`) is a syntactic feature in JavaScript that allows you to expand elements of an iterable (such as an array) into another iterable or as arguments to a function. It simplifies various operations involving arrays and enhances code readability.

### Basic Usage of the Spread Operator

The primary use of the spread operator is to create a shallow copy of an array or to spread its elements into another array:

```javascript
const arr1 = [1, 2, 3];
const arr2 = [...arr1]; // Shallow copy of arr1

console.log(arr2); // Output: [1, 2, 3]
```

### Concatenating Arrays

The spread operator is particularly useful for concatenating arrays:

```javascript
const arr1 = [1, 2];
const arr2 = [3, 4];
const combined = [...arr1, ...arr2];

console.log(combined); // Output: [1, 2, 3, 4]
```

### Copying Arrays

To create a deep copy of a multi-dimensional array, you can recursively apply the spread operator:

```javascript
const nestedArray = [[1, 2], [3, 4]];
const deepCopy = [...nestedArray.map(innerArray => [...innerArray])];

console.log(deepCopy); // Output: [[1, 2], [3, 4]]
```

### Spreading Elements in Function Arguments

The spread operator can be used to pass elements of an array as individual arguments to a function:

```javascript
function sum(a, b, c) {
  return a + b + c;
}

const numbers = [1, 2, 3];
const result = sum(...numbers);

console.log(result); // Output: 6
```

### Spreading Objects into Arrays

You can use the spread operator to merge objects into arrays:

```javascript
const person = { name: 'John', age: 30 };
const hobbies = ['reading', 'gaming'];

const merged = [...hobbies, { ...person }];

console.log(merged);
// Output: ['reading', 'gaming', { name: 'John', age: 30 }]
```

### Spreading Strings and Iterables

The spread operator can be used with strings and other iterable objects as well:

```javascript
const str = 'Hello';
const charArray = [...str];

console.log(charArray); // Output: ['H', 'e', 'l', 'l', 'o']
```

### Common Pitfalls

- **Nested Arrays**: Be cautious when spreading nested arrays, as it creates a shallow copy of the outer array but still references the inner arrays. Changes to inner arrays will affect both the original and the copied arrays.

```javascript
const nestedArray = [[1, 2], [3, 4]];
const shallowCopy = [...nestedArray];

shallowCopy[0][0] = 99;

console.log(nestedArray); // Output: [[99, 2], [3, 4]]
```

- **Immutable Operations**: While the spread operator is helpful for creating new arrays, it doesn't provide immutable operations. If you need to perform complex immutable operations, consider using libraries like Immutable.js.

## Function Expressions

Function expressions in JavaScript are a way to define functions as values of variables. Unlike function declarations, function expressions can be anonymous.

### Features and Properties

- Can be anonymous or named.
- Can be assigned to variables.
- Can be passed as arguments to other functions.
- Can be used in closures.

### Example

```javascript
// Anonymous function expression
let add = function (a, b) {
  return a + b;
};

// Named function expression
let multiply = function multiply(a, b) {
  return a * b;
};

console.log(add(2, 3)); // 5
console.log(multiply(4, 5)); // 20
```

## Arrow Functions

Arrow functions are a concise way to write functions in JavaScript. They have a more straightforward syntax and automatically bind to the surrounding context (the value of `this`).

### Features and Properties

- Shorter syntax compared to function expressions.
- Lexical `this` binding, making it useful in callbacks.

### Example

```javascript
// Function expression
let greet1 = function (name) {
  return `Hello, ${name}!`;
};

// Arrow function
let greet2 = (name) => `Hello, ${name}!`;

console.log(greet1('Alice')); // Hello, Alice!
console.log(greet2('Bob')); // Hello, Bob!
```

## `for...in` Loop

The `for...in` loop is used to iterate over the enumerable properties of an object. It's often used with objects and not recommended for arrays.

### Features and Properties

- Iterates over object properties.
- Not recommended for arrays due to potential issues.

### Example

```javascript
const person = {
  name: 'Alice',
  age: 30,
  job: 'Engineer',
};

for (let key in person) {
  console.log(`${key}: ${person[key]}`);
}
// Output:
// name: Alice
// age: 30
// job: Engineer
```

## `for...of` Loop

The `for...of` loop is used to iterate over iterable objects like arrays, strings, maps, and sets.

### Features and Properties

- Iterates over iterable objects.
- Provides a simpler syntax than `for...in`.

### Example

```javascript
const colors = ['red', 'green', 'blue'];

for (const color of colors) {
  console.log(color);
}
// Output:
// red
// green
// blue
```

## Function Chaining

Function chaining is a technique in JavaScript where multiple functions are called on an object one after another, each modifying the object and returning it. It's commonly used with libraries and frameworks like jQuery.

### Features and Properties

- Allows chaining of methods on an object.
- Each method typically returns the modified object.

### Example

```javascript
class Calculator {
  constructor(value) {
    this.value = value;
  }

  add(num) {
    this.value += num;
    return this;
  }

  subtract(num) {
    this.value -= num;
    return this;
  }

  getResult() {
    return this.value;
  }
}

const calc = new Calculator(0);
const result = calc.add(5).subtract(3).add(10).getResult();
console.log(result); // 12
```
