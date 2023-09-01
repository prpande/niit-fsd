# Polymorphism - 01/09

- Fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass
- Enables writing of code that works with objects in a more generic and flexible way, promoting code reusability and modularity
- Achieved through method overriding and interfaces in Java.

## Interfaces in Java

- Reference type that defines a contract of methods that implementing classes must follow
- Provides a way to achieve multiple inheritance and is used to define a common set of methods that classes must implement
- Help establish a clear separation between the contract (methods that must be implemented) and the implementation details
- Classes can implement multiple interfaces while they can extend only one class.

### Interface implementation example

#### Declaring an Interface

```java
interface Drawable {
    void draw();
    void resize();
}
```

- `Drawable` interface with two methods, `draw()` and `resize()`.
- Classes that implement this interface must provide concrete implementations for these methods

#### Implementing an Interface

```java
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing a circle");
    }
}
```

- `Circle` class implements the `Drawable` interface by providing implementations for both the `draw()` and `resize()` methods

### Interfaces and Polymorphism

- Interfaces are often used to achieve polymorphism, where objects of different classes can be treated as objects of a common interface.

    ```java
    public class Main {
        public static void main(String[] args) {
            Drawable drawable1 = new Circle();
            Drawable drawable2 = new Square();

            drawable1.draw();
            drawable2.draw();
        }
    }
    ```

- `Circle` and `Square` objects are treated as `Drawable` objects due to their implementation of the `Drawable` interface
- Allows calling the `draw()` method on them without knowing their specific types

### Extending Interfaces

- Interfaces can also extend other interfaces, creating a hierarchical structure of contracts.

    ```java
    interface Shape extends Drawable {
        double area();
    }
    ```

- `Shape` interface extends the `Drawable` interface and adds an `area()` method

### Default Methods

- Java 8 introduced default methods in interfaces
- Allow you to provide a default implementation for a method in an interface

    ```java
    interface Loggable {
        default void log(String message) {
            System.out.println("Logging: " + message);
        }
    }
    ```

### Static Methods in Interfaces

- Interfaces can also have static methods
- Invoked on the interface itself and not on the implementing class

    ```java
    interface MathUtils {
        static int add(int a, int b) {
            return a + b;
        }
    }
    ```

## Types of Polymorphism

### Static Polymorphism

- Compile-time Polymorphism (Method Overloading)
- Allows a class to have multiple methods with the same name but different parameter lists
- Appropriate method is chosen at compile-time based on the arguments passed to it
- Similarly, creation of two or more constructors with different parameters called constructor overloading

    ```java
    class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }
    ```

- `add` method is overloaded to accept both integers and doubles
- Appropriate version of the method is selected based on the argument types

### Dynamic Polymorphism

- Runtime Polymorphism (Method Overriding)
- Allows a subclass to provide a specific implementation for a method that is already defined in its superclass
- Allows objects of the subclass to be treated as objects of the superclass, promoting flexibility and modularity
- Compiler checks for methods in the super class during compilation (**early binding**) but invocation determined by JVM during execution (**dynamic method dispatch**).

    ```java
    class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Cat meows");
        }
    }
    ```

- Both `Dog` and `Cat` classes override the `makeSound` method from the `Animal` class
- At runtime, the appropriate version of the method is called based on the actual object type

### Method Overloading vs. Method Overriding

|Method Overloading|Method Overriding|
|:---|:---|
|Static polymorphism or compile-time polymorphism|Dynamic polymorphism or runtime polymorphism|
|Overloading occurs between the methods in the same class|Overriding occurs between the superclass and subclass|
|Overloaded method names are the same, but the parameters are different|Overriding methods have the same signature, i.e., the same name and method arguments|
|Method to call is determined at compile time|Method to call is determined at runtime based on object type|
|||
