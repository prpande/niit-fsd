# Introduction to Object-Oriented Programming

- normal language programming — procedural paradigm — step by Step
- C++- not pure- code can be written without classes and object + main() is not inside any class
- .Net, Java- Pure OOP
- Object-Oriented Programming is a powerful paradigm that helps you organize and manage complex code by representing real-world entities as objects

## What is Object-Oriented Programming?

Object-Oriented Programming (OOP) is a programming paradigm that revolves around the concept of "objects." An object is a self-contained unit that combines data (attributes) and actions (methods) that can be performed on the data. OOP helps in modeling real-world entities and their interactions in a more intuitive and organized manner.

## Classes and Objects

- **Class:** A blueprint or template for creating objects. It defines the attributes and methods that objects of the class will have.
  - Types of classes in java:
    1. Execution class: runnable class(used to run the program) --this is main class as inside main method we can call methods from other classes.
    2. Definition: Regular blueprint based class. Can define objects Of that class
    3. Inheritance - derived/abstract class

- **Object:** An instance of a class. It represents a real-world entity and contains its own unique set of data and behavior.

## Basic OOP Principles

### Encapsulation

Encapsulation refers to bundling data (attributes) and methods (functions) that operate on the data into a single unit, i.e., the object. This concept provides data hiding and helps in controlling access to the object's internals.

### Inheritance

Inheritance allows a new class (subclass or derived class) to inherit attributes and methods from an existing class (superclass or base class). It promotes code reuse and establishes an "is-a" relationship between classes.

### Polymorphism

Polymorphism enables objects of different classes to be treated as objects of a common superclass. It allows different classes to implement methods with the same name but different behaviors. Polymorphism fosters flexibility and extensibility in your code.

### Declaring Classes and Objects

```java
class ClassName 
{
    // Attributes/Fields
    dataType attributeName;
    
    // Constructor
    ClassName() 
    {
        // Constructor code
    }
    
    // Methods
    returnType methodName(parameterType parameterName) 
    {
        // Method code
    }
}

// Creating an object
ClassName objectName = new ClassName();
```

### Constructors

Constructors are special methods that are used to initialize objects when they are created. They have the same name as the class and do not have a return type.

### Fields and Methods

Fields or instance variables are variables within a class that store data, while methods are functions that define the behavior of the class. Access modifiers (public, private, protected) control the visibility and accessibility of fields and methods.

> Methods are created in memory and they are shared by objects
