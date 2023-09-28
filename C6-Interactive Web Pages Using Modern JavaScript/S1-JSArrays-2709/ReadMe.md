<!-- omit in toc -->
# JavaScript Objects and Arrays - 27/09

<!-- omit in toc -->
## Contents

- [Objects](#objects)
  - [Introduction to Objects](#introduction-to-objects)
  - [Creating Objects](#creating-objects)
    - [Literal Notation](#literal-notation)
    - [Constructor Notation](#constructor-notation)
  - [Object Properties](#object-properties)
  - [Object Methods](#object-methods)
  - [Accessing Object Members](#accessing-object-members)
  - [Object Initialization](#object-initialization)
  - [Object Iteration](#object-iteration)
    - [`for...in` Loop](#forin-loop)
    - [`Object.keys()`](#objectkeys)
    - [`Object.values()`](#objectvalues)
  - [Object Prototypes](#object-prototypes)
  - [Object Destructuring](#object-destructuring)
- [Arrays](#arrays)
  - [Creating Arrays](#creating-arrays)
    - [Array Literal Notation](#array-literal-notation)
    - [Array Constructor Notation](#array-constructor-notation)
    - [Array Properties](#array-properties)
  - [Array Methods](#array-methods)
    - [Mutator Methods](#mutator-methods)
    - [Accessor Methods](#accessor-methods)
    - [Iteration Methods](#iteration-methods)
  - [Common Array Operations](#common-array-operations)
  - [Array Destructuring](#array-destructuring)
    - [Basic Array Destructuring](#basic-array-destructuring)
    - [Default Values](#default-values)
    - [Rest Syntax in Array Destructuring](#rest-syntax-in-array-destructuring)
    - [Swapping Variables](#swapping-variables)
    - [Nested Array Destructuring](#nested-array-destructuring)
    - [Object Destructuring with Arrays](#object-destructuring-with-arrays)
  - [Spread Operator](#spread-operator)
    - [Basic Usage of the Spread Operator](#basic-usage-of-the-spread-operator)
    - [Concatenating Arrays](#concatenating-arrays)
    - [Copying Arrays](#copying-arrays)
    - [Spreading Elements in Function Arguments](#spreading-elements-in-function-arguments)
    - [Spreading Objects into Arrays](#spreading-objects-into-arrays)
    - [Spreading Strings and Iterables](#spreading-strings-and-iterables)
    - [Common Pitfalls](#common-pitfalls)
  - [Multidimensional Arrays](#multidimensional-arrays)

## Objects

### Introduction to Objects

In JavaScript, an object is a composite data type that allows you to group together related data and functions into a single entity. Objects are widely used for modeling real-world entities and organizing code.

### Creating Objects

There are several ways to create objects in JavaScript:

#### Literal Notation

You can create an object using curly braces and defining key-value pairs:

```javascript
const person = {
  firstName: "John",
  lastName: "Doe",
  age: 30
};
```

#### Constructor Notation

You can use the `Object` constructor to create an empty object and then add properties and methods to it:

```javascript
const car = new Object();
car.make = "Toyota";
car.model = "Camry";
car.year = 2022;
```

### Object Properties

Objects can have properties, which are essentially variables associated with the object. Properties are defined using key-value pairs. In the example above, `firstName`, `lastName`, and `age` are properties of the `person` object.

### Object Methods

Objects can also have methods, which are functions associated with the object. Methods are defined similarly to properties, but their values are functions. Here's an example:

```javascript
const person = {
  firstName: "John",
  lastName: "Doe",
  getFullName: function() {
    return `${this.firstName} ${this.lastName}`;
  }
};

console.log(person.getFullName()); // Output: "John Doe"
```

### Accessing Object Members

You can access object properties and methods using dot notation or square brackets:

```javascript
const person = {
  firstName: "John",
  lastName: "Doe"
};

console.log(person.firstName); // Dot notation
console.log(person["lastName"]); // Square brackets
```

### Object Initialization

You can initialize object properties and methods during object creation:

```javascript
const person = {
  firstName: "John",
  lastName: "Doe",
  getFullName() {
    return `${this.firstName} ${this.lastName}`;
  }
};
```

### Object Iteration

You can iterate over an object's properties and methods using various methods:

#### `for...in` Loop

```javascript
for (let key in person) {
  console.log(`${key}: ${person[key]}`);
}
```

#### `Object.keys()`

```javascript
const keys = Object.keys(person);
console.log(keys); // Output: ["firstName", "lastName", "getFullName"]
```

#### `Object.values()`

```javascript
const values = Object.values(person);
console.log(values); // Output: ["John", "Doe", [Function: getFullName]]
```

### Object Prototypes

JavaScript objects are prototype-based, which means they inherit properties and methods from a prototype object. You can create custom prototypes and use them to extend objects.

```javascript
function Person(firstName, lastName) {
  this.firstName = firstName;
  this.lastName = lastName;
}

Person.prototype.getFullName = function() {
  return `${this.firstName} ${this.lastName}`;
};

const person = new Person("John", "Doe");
console.log(person.getFullName()); // Output: "John Doe"
```

### Object Destructuring

Destructuring allows you to extract object properties and assign them to variables.

```javascript
const person = {
  firstName: "John",
  lastName: "Doe"
};

const { firstName, lastName } = person;
console.log(firstName); // Output: "John"
```

## Arrays

An array is an ordered collection of values that can be of any data type. In JavaScript, arrays are dynamic, which means their size can change during runtime. They are used to store multiple values in a single variable, making it easier to work with large sets of data.

### Creating Arrays

#### Array Literal Notation

You can create an array using square brackets and add values separated by commas:

```javascript
const fruits = ["apple", "banana", "cherry"];
```

#### Array Constructor Notation

Arrays can also be created using the `Array` constructor:

```javascript
const colors = new Array("red", "green", "blue");
```

#### Array Properties

JavaScript arrays have several properties, including:

- `length`: Returns the number of elements in the array.

```javascript
const numbers = [1, 2, 3, 4, 5];
console.log(numbers.length); // Output: 5
```

### Array Methods

Arrays provide a wide range of methods for manipulation. We can categorize them into three groups: Mutator methods, Accessor methods, and Iteration methods.

#### Mutator Methods

Mutator methods modify the array directly.

- `push()`: Adds one or more elements to the end of the array.

```javascript
const fruits = ["apple", "banana"];
fruits.push("cherry");
console.log(fruits); // Output: ["apple", "banana", "cherry"]
```

- `pop()`: Removes the last element from the array.

```javascript
const fruits = ["apple", "banana", "cherry"];
fruits.pop();
console.log(fruits); // Output: ["apple", "banana"]
```

#### Accessor Methods

Accessor methods do not modify the array but provide information about it.

- `concat()`: Combines two or more arrays and returns a new array.

```javascript
const fruits = ["apple", "banana"];
const moreFruits = ["cherry", "orange"];
const allFruits = fruits.concat(moreFruits);
console.log(allFruits); // Output: ["apple", "banana", "cherry", "orange"]
```

- `indexOf()`: Returns the first index at which a given element can be found in the array.

```javascript
const numbers = [1, 2, 3, 4, 5];
const index = numbers.indexOf(3);
console.log(index); // Output: 2
```

#### Iteration Methods

Iteration methods allow you to iterate over array elements.

- `forEach()`: Executes a provided function once for each array element.

```javascript
const fruits = ["apple", "banana", "cherry"];
fruits.forEach((fruit) => {
  console.log(fruit);
});
// Output:
// apple
// banana
// cherry
```

### Common Array Operations

Arrays are versatile and can be used for various operations.

- **Sorting an Array**

You can use the `sort()` method to sort an array in place.

```javascript
const numbers = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];
numbers.sort();
console.log(numbers); // Output: [1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9]
```

- **Filtering an Array**

The `filter()` method creates a new array with all elements that pass a test.

```javascript
const numbers = [1, 2, 3, 4, 5];
const evenNumbers = numbers.filter((num) => num % 2 === 0);
console.log(evenNumbers); // Output: [2, 4]
```

- **Mapping an Array**

The `map()` method creates a new array with the results of applying a function to each element.

```javascript
const numbers = [1, 2, 3, 4, 5];
const squaredNumbers = numbers.map((num) => num * num);
console.log(squaredNumbers); // Output: [1, 4, 9, 16, 25]
```

### Array Destructuring

Array destructuring is a feature introduced in ECMAScript 2015 (ES6) that simplifies the process of extracting values from arrays. It provides a convenient way to assign array elements to variables without the need for explicit indexing.

#### Basic Array Destructuring

You can use array destructuring by enclosing variables in square brackets `[]` on the left side of an assignment statement, which matches the structure of the array on the right side. Here's a basic example:

```javascript
const colors = ['red', 'green', 'blue'];
const [firstColor, secondColor, thirdColor] = colors;

console.log(firstColor); // Output: 'red'
console.log(secondColor); // Output: 'green'
console.log(thirdColor); // Output: 'blue'
```

#### Default Values

You can also provide default values for variables in case the corresponding element in the array is undefined. This is especially useful when working with arrays of varying lengths:

```javascript
const fruits = ['apple', 'banana'];
const [firstFruit, secondFruit, thirdFruit = 'orange'] = fruits;

console.log(firstFruit); // Output: 'apple'
console.log(secondFruit); // Output: 'banana'
console.log(thirdFruit); // Output: 'orange'
```

#### Rest Syntax in Array Destructuring

The rest syntax (`...`) in array destructuring allows you to capture remaining elements of an array into a new array variable. This is particularly handy when you don't know how many elements you want to extract:

```javascript
const numbers = [1, 2, 3, 4, 5];
const [firstNumber, secondNumber, ...restNumbers] = numbers;

console.log(firstNumber); // Output: 1
console.log(secondNumber); // Output: 2
console.log(restNumbers); // Output: [3, 4, 5]
```

#### Swapping Variables

Array destructuring provides an elegant way to swap the values of two variables without using a temporary variable:

```javascript
let a = 5;
let b = 10;

[a, b] = [b, a];

console.log(a); // Output: 10
console.log(b); // Output: 5
```

#### Nested Array Destructuring

You can nest array destructuring to extract values from multidimensional arrays:

```javascript
const matrix = [[1, 2], [3, 4]];
const [[a, b], [c, d]] = matrix;

console.log(a); // Output: 1
console.log(b); // Output: 2
console.log(c); // Output: 3
console.log(d); // Output: 4
```

#### Object Destructuring with Arrays

You can also combine object destructuring with array destructuring when working with arrays of objects:

```javascript
const users = [{ name: 'Alice', age: 30 }, { name: 'Bob', age: 25 }];
const [{ name: firstName, age: firstAge }, { name: secondName, age: secondAge }] = users;

console.log(firstName); // Output: 'Alice'
console.log(firstAge); // Output: 30
console.log(secondName); // Output: 'Bob'
console.log(secondAge); // Output: 25
```

### Spread Operator

The spread operator (`...`) is a syntactic feature in JavaScript that allows you to expand elements of an iterable (such as an array) into another iterable or as arguments to a function. It simplifies various operations involving arrays and enhances code readability.

#### Basic Usage of the Spread Operator

The primary use of the spread operator is to create a shallow copy of an array or to spread its elements into another array:

```javascript
const arr1 = [1, 2, 3];
const arr2 = [...arr1]; // Shallow copy of arr1

console.log(arr2); // Output: [1, 2, 3]
```

#### Concatenating Arrays

The spread operator is particularly useful for concatenating arrays:

```javascript
const arr1 = [1, 2];
const arr2 = [3, 4];
const combined = [...arr1, ...arr2];

console.log(combined); // Output: [1, 2, 3, 4]
```

#### Copying Arrays

To create a deep copy of a multi-dimensional array, you can recursively apply the spread operator:

```javascript
const nestedArray = [[1, 2], [3, 4]];
const deepCopy = [...nestedArray.map(innerArray => [...innerArray])];

console.log(deepCopy); // Output: [[1, 2], [3, 4]]
```

#### Spreading Elements in Function Arguments

The spread operator can be used to pass elements of an array as individual arguments to a function:

```javascript
function sum(a, b, c) {
  return a + b + c;
}

const numbers = [1, 2, 3];
const result = sum(...numbers);

console.log(result); // Output: 6
```

#### Spreading Objects into Arrays

You can use the spread operator to merge objects into arrays:

```javascript
const person = { name: 'John', age: 30 };
const hobbies = ['reading', 'gaming'];

const merged = [...hobbies, { ...person }];

console.log(merged);
// Output: ['reading', 'gaming', { name: 'John', age: 30 }]
```

#### Spreading Strings and Iterables

The spread operator can be used with strings and other iterable objects as well:

```javascript
const str = 'Hello';
const charArray = [...str];

console.log(charArray); // Output: ['H', 'e', 'l', 'l', 'o']
```

#### Common Pitfalls

- **Nested Arrays**: Be cautious when spreading nested arrays, as it creates a shallow copy of the outer array but still references the inner arrays. Changes to inner arrays will affect both the original and the copied arrays.

```javascript
const nestedArray = [[1, 2], [3, 4]];
const shallowCopy = [...nestedArray];

shallowCopy[0][0] = 99;

console.log(nestedArray); // Output: [[99, 2], [3, 4]]
```

- **Immutable Operations**: While the spread operator is helpful for creating new arrays, it doesn't provide immutable operations. If you need to perform complex immutable operations, consider using libraries like Immutable.js.

### Multidimensional Arrays

Arrays in JavaScript can also be multidimensional, meaning they can contain other arrays as elements. This is useful for representing matrices or tables.

```javascript
const matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
];
console.log(matrix[1][2]); // Output: 6
```
