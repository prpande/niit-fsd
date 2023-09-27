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
