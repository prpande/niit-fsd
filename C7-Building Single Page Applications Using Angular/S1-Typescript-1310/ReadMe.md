<!-- omit in toc -->
# Build Interactive Web Pages with TypeScript - 13/10

<!-- omit in toc -->
## Content

- [Need of TypeScript](#need-of-typescript)
  - [The JavaScript Quandary](#the-javascript-quandary)
    - [Dynamic Typing](#dynamic-typing)
    - [Noisy Code](#noisy-code)
  - [The TypeScript Solution](#the-typescript-solution)
    - [Static Typing](#static-typing)
    - [Type Annotations](#type-annotations)
  - [Advanced Features](#advanced-features)
- [Data Types in TypeScript](#data-types-in-typescript)
  - [Basic Data Types](#basic-data-types)
  - [Advanced Data Types](#advanced-data-types)
- [Function Execution with Type Annotations](#function-execution-with-type-annotations)
  - [Defining Function Signatures](#defining-function-signatures)
  - [Optional Parameters](#optional-parameters)
  - [Default Parameters](#default-parameters)
  - [Rest Parameters](#rest-parameters)
  - [Function Overloads](#function-overloads)
  - [Arrow Functions](#arrow-functions)
  - [Function Callbacks](#function-callbacks)
- [Object Types with Type Aliases](#object-types-with-type-aliases)
  - [What are Type Aliases?](#what-are-type-aliases)
  - [Defining Object Types](#defining-object-types)
  - [Extending Object Types](#extending-object-types)
  - [Union Types](#union-types)
  - [Optional Properties](#optional-properties)
  - [Readonly Properties](#readonly-properties)
  - [Mapped Types](#mapped-types)
- [Classes in TypeScript](#classes-in-typescript)
  - [What are Classes?](#what-are-classes)
  - [Defining Classes](#defining-classes)
  - [Creating Objects](#creating-objects)
  - [Accessing Properties and Methods](#accessing-properties-and-methods)
  - [Constructors](#constructors)
  - [Inheritance](#inheritance)
  - [Access Modifiers](#access-modifiers)
- [Generics in TypeScript](#generics-in-typescript)
  - [What Are Generics?](#what-are-generics)
  - [The Basics of Generics](#the-basics-of-generics)
    - [Using Generics in Functions](#using-generics-in-functions)
    - [Using Generics in Classes](#using-generics-in-classes)
  - [Constraints](#constraints)
  - [Default Values](#default-values)
  - [Mapped Types](#mapped-types-1)

## Need of TypeScript

JavaScript is the cornerstone of web development. Its flexibility and versatility have made it the go-to language for building interactive web applications. But as your projects grow in size and complexity, JavaScript's dynamic nature can become a double-edged sword, leading to bugs, maintenance challenges, and collaboration issues. Enter TypeScript, a statically-typed superset of JavaScript.

### The JavaScript Quandary

#### Dynamic Typing

JavaScript's dynamic typing allows variables to change types at runtime. While this flexibility can be handy, it can also lead to hard-to-trace bugs and unexpected behavior.

```javascript
let x = 5;      // x is a number
x = "Hello";    // Now x is a string
console.log(x); // What will this print?
```

#### Noisy Code

JavaScript doesn't provide strong tools for expressing complex data structures. This can result in verbose code and difficulty understanding data shapes.

```javascript
const user = { name: "Alice", age: 30, email: "alice@example.com" };
```

### The TypeScript Solution

#### Static Typing

TypeScript introduces static typing, which means that variables have well-defined types at compile-time. This can catch errors early in the development process.

```typescript
let x: number = 5;
x = "Hello"; // Error: Type 'string' is not assignable to type 'number'.
```

#### Type Annotations

TypeScript allows you to annotate variables with types, making your code more self-documenting and enhancing code readability.

```typescript
const user: { name: string, age: number, email: string } = {
  name: "Alice",
  age: 30,
  email: "alice@example.com",
};
```

### Advanced Features

- Interfaces: TypeScript introduces interfaces to define the shape of objects, making code more maintainable and self-documented.
- Classes: TypeScript supports classes and inheritance, bringing object-oriented programming to JavaScript.
- Modules: TypeScript's module system allows you to organize and reuse code, reducing complexity and improving collaboration.
- Generics: Generics provide a way to write reusable, type-safe functions and classes.

## Data Types in TypeScript

### Basic Data Types

1. **Number**

    The `number` type is used for both integer and floating-point numbers.

    ```typescript
    let age: number = 25;
    ```

2. **String**

    The `string` type represents textual data.

    ```typescript
    let name: string = "Alice";
    ```

3. **Boolean**

    The `boolean` type represents true or false values.

    ```typescript
    let isStudent: boolean = true;
    ```

4. **Array**

    The `array` type represents a list of elements, all of the same type.

    ```typescript
    let scores: number[] = [98, 76, 89];
    ```

5. **Tuple**

    A `tuple` is an array with a fixed number of elements, each with a known type.

    ```typescript
    let person: [string, number] = ["Bob", 30];
    ```

6. **Enum**

    An `enum` is a set of named constant values.

    ```typescript
    enum Color { Red, Green, Blue }
    let favoriteColor: Color = Color.Green;
    ```

7. **Any**

    The `any` type is a dynamic type that's similar to plain JavaScript. It's often used when you don't know or can't specify a variable's type in advance.

    ```typescript
    let user: any = "John";
    user = 42; // Valid
    ```

8. **Void**

    The `void` type is usually used as a return type for functions that don't return a value.

    ```typescript
    function sayHello(): void {
    console.log("Hello, World!");
    }
    ```

9. **Null and Undefined**

    The `null` and `undefined` types represent null and undefined values, respectively.

    ```typescript
    let data: null = null;
    let status: undefined = undefined;
    ```

### Advanced Data Types

1. **Interfaces**

    Interfaces define the structure of objects, making your code more organized and self-documenting.

    ```typescript
    interface Person {
    name: string;
    age: number;
    }
    ```

2. **Classes**

    TypeScript supports classes and object-oriented programming concepts.

    ```typescript
    class Animal {
    constructor(public name: string) { }
    move(distance: number = 0) {
        console.log(`${this.name} moved ${distance} meters.`);
    }
    }
    ```

3. **Modules**

    TypeScript's module system allows you to organize and reuse code effectively.

    ```typescript
    // Math.ts
    export function add(a: number, b: number): number {
    return a + b;
    }
    ```

4. **Generics**

    Generics allow you to write reusable and type-safe functions, classes, and interfaces.

    ```typescript
    function identity<T>(arg: T): T {
    return arg;
    }
    ```

5. **Union and Intersection Types**

    You can combine types using union (`|`) and intersection (`&`) operators.

    ```typescript
    type StringOrNumber = string | number;
    type Employee = { name: string } & { jobTitle: string };
    ```

6. **Literal Types**

    You can specify exact values as types using literals.

    ```typescript
    let result: "success" | "error" = "success";
    ```

7. **Type Assertions**

    Type assertions allow you to tell TypeScript to treat a value as a specific type.

    ```typescript
    let userInput: any = "Hello, TypeScript!";
    let strLength: number = (userInput as string).length;
    ```

## Function Execution with Type Annotations

### Defining Function Signatures

In TypeScript, you can specify the type of arguments and the return type of a function using type annotations.

```typescript
function add(a: number, b: number): number {
  return a + b;
}
```

In this example, the `add` function takes two arguments, both of type `number`, and returns a value of type `number`.

### Optional Parameters

You can make function parameters optional by adding a `?` to the parameter name.

```typescript
function greet(name: string, greeting?: string): string {
  if (greeting) {
    return `${greeting}, ${name}!`;
  } else {
    return `Hello, ${name}!`;
  }
}

const message = greet("Alice"); // "Hello, Alice!"
```

In this case, the `greeting` parameter is optional, allowing you to call `greet` with just the `name` parameter.

### Default Parameters

Default parameters provide a default value for a parameter in case no argument is passed.

```typescript
function greet(name: string, greeting: string = "Hello"): string {
  return `${greeting}, ${name}!`;
}

const message = greet("Bob"); // "Hello, Bob!"
```

Here, if you don't provide a `greeting`, it defaults to "Hello."

### Rest Parameters

The `...` syntax allows you to accept a variable number of arguments as an array.

```typescript
function sum(...numbers: number[]): number {
  return numbers.reduce((acc, curr) => acc + curr, 0);
}

const result = sum(1, 2, 3, 4, 5); // 15
```

The `sum` function can accept any number of arguments, and they are treated as an array of numbers.

### Function Overloads

Function overloads enable you to define multiple function signatures for a single function.

```typescript
function add(a: number, b: number): number;
function add(a: string, b: string): string;
function add(a: any, b: any): any {
  return a + b;
}
```

In this example, the `add` function can accept either two numbers or two strings, and it returns the corresponding type.

### Arrow Functions

Arrow functions are a concise way to define functions with type annotations.

```typescript
const square = (x: number): number => x * x;
```

Arrow functions automatically infer the return type based on the expression, but you can also explicitly specify it.

### Function Callbacks

Functions can accept other functions as arguments, which is common in JavaScript for asynchronous operations.

```typescript
function fetchData(callback: (data: string) => void): void {
  // Simulate fetching data
  const data = "This is some data.";
  callback(data);
}

fetchData((data) => {
  console.log(data); // "This is some data."
});
```

Here, `fetchData` takes a callback function that defines its type.

## Object Types with Type Aliases

### What are Type Aliases?

In TypeScript, a type alias is a custom name for a type. It allows you to create complex and custom types for better code readability and reusability. You can use type aliases to define object structures, and even combine them with other types.

### Defining Object Types

Let's start by defining a simple object type using a type alias:

```typescript
type Person = {
  name: string;
  age: number;
};
```

In this example, we've created a type alias `Person` that defines an object with two properties: `name` of type `string` and `age` of type `number`.

### Extending Object Types

Type aliases can be extended, which is especially useful for creating reusable object types:

```typescript
type Person = {
  name: string;
  age: number;
};

type Employee = Person & {
  jobTitle: string;
};
```

Here, the `Employee` type extends the `Person` type, adding the `jobTitle` property. The `&` operator is used to combine the types.

### Union Types

You can use type aliases to define union types for objects. This is helpful when an object can have different shapes:

```typescript
type Shape = Circle | Square;

type Circle = {
  kind: "circle";
  radius: number;
};

type Square = {
  kind: "square";
  sideLength: number;
};
```

In this example, `Shape` can represent either a `Circle` or a `Square`, and TypeScript enforces that objects of type `Shape` adhere to one of these structures.

### Optional Properties

Type aliases can define optional properties using the `?` symbol:

```typescript
type Car = {
  make: string;
  model: string;
  year?: number;
};
```

In this case, the `year` property is optional, meaning it may or may not be present in objects of type `Car`.

### Readonly Properties

Type aliases can define readonly properties using the `readonly` modifier:

```typescript
type Point = {
  readonly x: number;
  readonly y: number;
};
```

This ensures that the `x` and `y` properties cannot be modified after they are assigned values.

### Mapped Types

Type aliases can be combined with mapped types to create new types based on existing ones. Mapped types are especially useful when you want to modify the properties of an object type:

```typescript
type Readonly<T> = {
  readonly [P in keyof T]: T[P];
};

type Person = {
  name: string;
  age: number;
};

type ReadonlyPerson = Readonly<Person>;
```

In this example, we've used a mapped type `Readonly` to create a new type `ReadonlyPerson` that makes all properties of `Person` readonly.

## Classes in TypeScript

### What are Classes?

In TypeScript, classes are blueprints for creating objects. They define both the structure (properties) and behavior (methods) of objects. Classes bring the power of OOP to JavaScript developers, allowing them to create custom data types, encapsulate data and methods, and enable inheritance and polymorphism.

### Defining Classes

To define a class in TypeScript, use the `class` keyword followed by the class name:

```typescript
class Person {
  // Properties
  name: string;
  age: number;

  // Constructor
  constructor(name: string, age: number) {
    this.name = name;
    this.age = age;
  }

  // Method
  greet() {
    return `Hello, my name is ${this.name} and I'm ${this.age} years old.`;
  }
}
```

In this example, we define a `Person` class with properties `name` and `age`, a constructor to initialize these properties, and a `greet` method to return a greeting message.

### Creating Objects

To create an object from a class, use the `new` keyword:

```typescript
const alice = new Person("Alice", 30);
```

Here, we create a `Person` object named `alice` with the specified properties.

### Accessing Properties and Methods

You can access a class's properties and methods using the dot notation:

```typescript
console.log(alice.name); // "Alice"
console.log(alice.age);  // 30
console.log(alice.greet()); // "Hello, my name is Alice and I'm 30 years old."
```

This allows you to interact with the object and utilize its functionality.

### Constructors

Constructors are special methods that are executed when an object is created from a class. You can use constructors to initialize object properties.

```typescript
class Circle {
  radius: number;

  constructor(radius: number) {
    this.radius = radius;
  }

  area() {
    return Math.PI * this.radius ** 2;
  }
}
```

In this example, the `Circle` class uses a constructor to set the `radius` property when a `Circle` object is created.

### Inheritance

Classes can inherit properties and methods from other classes, allowing you to create hierarchies of related classes. Use the `extends` keyword to specify the parent class.

```typescript
class Employee {
  name: string;
  role: string;

  constructor(name: string, role: string) {
    this.name = name;
    this.role = role;
  }

  introduce() {
    return `Hi, I'm ${this.name}, and I work as a ${this.role}.`;
  }
}

class Manager extends Employee {
  constructor(name: string) {
    super(name, "Manager");
  }
}
```

Here, the `Manager` class inherits from the `Employee` class, reusing its properties and methods. The `super` keyword calls the parent class constructor.

### Access Modifiers

You can use access modifiers to control the visibility and accessibility of class members. TypeScript provides three access modifiers:

- `public`: The member is accessible from anywhere.
- `protected`: The member is accessible within the class and its subclasses.
- `private`: The member is only accessible within the class.

```typescript
class Student {
  private id: number;

  constructor(id: number) {
    this.id = id;
  }

  getId() {
    return this.id;
  }
}
```

In this example, the `id` property is private, so it can only be accessed from within the class.

## Generics in TypeScript

### What Are Generics?

Generics are a powerful feature in TypeScript that allow you to write code that is highly reusable while maintaining type safety. They enable you to create functions, classes, and interfaces that work with a variety of data types, while preserving type information at compile time.

### The Basics of Generics

#### Using Generics in Functions

The basic syntax for defining a generic function in TypeScript looks like this:

```typescript
function identity<T>(arg: T): T {
  return arg;
}

const str: string = identity("Hello, TypeScript");
const num: number = identity(42);
```

In this example, the function `identity` uses a type parameter `T` to capture the type of the argument passed in. The type of the return value is inferred from the argument.

#### Using Generics in Classes

Generics can also be applied to classes. Here's an example:

```typescript
class Box<T> {
  private value: T;

  constructor(value: T) {
    this.value = value;
  }

  getValue(): T {
    return this.value;
  }
}

const numberBox = new Box(42);
const stringBox = new Box("TypeScript");
```

In this code, the `Box` class is parameterized with `T`, which represents the type of the value stored in the box. You can create instances of `Box` with different data types.

### Constraints

Generics can be further refined by adding constraints to them, ensuring that the generic type adheres to a specific shape or behavior.

```typescript
interface Printable {
  print(): void;
}

function printAndReturn<T extends Printable>(item: T): T {
  item.print();
  return item;
}
```

In this example, the `printAndReturn` function works with objects of type `T`, but the constraint `T extends Printable` ensures that `T` must have a `print` method.

### Default Values

You can provide default values for generic type parameters, making your code more concise and user-friendly.

```typescript
function getProperty<T, K extends keyof T>(obj: T, key: K): T[K] {
  return obj[key];
}
```

Here, the `key` parameter is constrained to be a valid key of the object `obj`.

### Mapped Types

Mapped types allow you to create new types by transforming the properties of existing types.

```typescript
type Optional<T> = {
  [P in keyof T]?: T[P];
};

const original = { name: "Alice", age: 30 };
const modified: Optional<typeof original> = { age: 31 };
```

In this example, the `Optional` type is a mapped type that adds optional modifiers to the properties of the original type.
