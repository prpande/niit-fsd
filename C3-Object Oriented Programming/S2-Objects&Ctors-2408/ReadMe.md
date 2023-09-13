<!-- omit in toc -->
# Objects and Constructors 24/08

<!-- omit in toc -->
## Contents

- [Constructor](#constructor)
- [Creating Objects and Memory Allocation](#creating-objects-and-memory-allocation)
  - [Stack Memory Allocation](#stack-memory-allocation)
  - [Heap Memory Allocation](#heap-memory-allocation)
- [Copy Constructors](#copy-constructors)
- [`static` Keyword](#static-keyword)
- [`final` Keyword](#final-keyword)
- [`this` Keyword](#this-keyword)
- [`this` Keyword (Ctor chaining)](#this-keyword-ctor-chaining)
- [`static` Initialization Block](#static-initialization-block)

## Constructor

- Instance method used to initialize the object.
- Called automatically once as soon as object is created.
- No return type
- More than one constructor in a class.
- Instance method that usually has the same name as the class,
- Used to set the values of the attributes/fields of an object, either to default or to user-defined values.
- Compiler applies `default` if any specific ( `public`, `private` or `protected`) access modifier is not defined
- Constructor is not declared.
- Default Constructor cannot be found inside the `.java`. it's found in the `.class` file

## Creating Objects and Memory Allocation

- Instantiated using the `new` keyword followed by a constructor call
- Memory is allocated in two main areas: the stack and the heap
- Reference to the object resides on the stack
- Actual object and its instance variables are stored in the heap.

```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        // Here, myCar is the reference stored in the stack,
        // and the actual Car object is created in the heap.
    }
}
```

> Memory allocation for objects is managed by the Java Virtual Machine (JVM) which handles memory allocation and garbage collection for you, so you don't need to worry about managing memory explicitly as in languages like C or C++.

### Stack Memory Allocation

- Used for storing method-specific local variables, method parameters, and control flow information
- Operates in a last-in-first-out (LIFO) manner, meaning the most recently called method is at the top of the stack
- Memory allocation and deallocation in the stack are fast because it involves simply adjusting the stack pointer
- When an object is initialized inside a method, a reference to that object is stored on the stack if it's a local variable
- Actual object data resides in the heap, but the reference to it is on the stack.

### Heap Memory Allocation

- Used for storing objects and their instance variables
- More dynamic memory area and can be considered a pool of memory that's used to allocate and de-allocate objects.
- On initialization the reference to the object is returned, and this reference is stored on the stack or within another object, pointing to the heap-allocated memory

## Copy Constructors

- Creates an object using another object of same class
- Creates duplicate copy of existing object
- Useful for deep copy/clone

```java
public class Car {
    // ...
    
    // Copy constructor
    public Car(Car otherCar) {
        this.make = otherCar.make;
        this.model = otherCar.model;
        this.year = otherCar.year;
    }
}
```

## `static` Keyword

- Used to define class-level attributes and methods
- Shared among all instances of the class
- Accessed using the class name, not an object reference
- Initialized once during the programs lifetime.

## `final` Keyword

- Applied to variables, methods, and classes
- `final` variables cannot be changed after it is assigned a value
- `final` methods cannot be overridden by subclasses
- `final` classes cannot be extended

## `this` Keyword

- Used to refer to the current instance of a class
- When used within a constructor, refers to the instance of the class that is being created
- Commonly used in constructors to disambiguate between instance variables and constructor parameters that have the same name

Here's how the `this` keyword is typically used in the context of constructors:

```java
public class MyClass {
    private int value;

    // Constructor with a parameter named 'value'
    public MyClass(int value) {
        // Using 'this' to assign the parameter 'value' to the instance variable 'value'
        this.value = value;
    }

    // Getter method for 'value'
    public int getValue() {
        return value;
    }
}
```

In this example, the `this.value` inside the constructor refers to the instance variable `value` of the object being created, whereas the `value` in the constructor's parameter list refers to the parameter passed when creating an object.

Using `this` can help avoid confusion between local variables (such as constructor parameters) and instance variables with the same name. It explicitly tells the compiler that you're referring to the instance variable rather than the local variable.

## `this` Keyword (Ctor chaining)

- Also be used to call other constructors within the same class (constructor chaining).

```java
public class Car {
    // ...
    
    // Constructor chaining using this
    public Car(String make, String model) {
        this(make, model, 0);
    }
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
```

## `static` Initialization Block

- Used to initialize static variables or perform other static operations
- Executed when the class is loaded and before any static methods or variables are accessed

```java
public class Car {
    static int count;
    
    static {
        count = 0;
        System.out.println("Static block initialized");
    }
    
    // ...
}
```
