# Inheritance - 30/08

- One of the fundamental concepts in object-oriented programming (OOP)
- Allows creation of a new class (the subclass or derived class) that inherits the properties and behaviors (fields and methods) of an existing class (the superclass or base class)
- Subclass can extend or customize the behavior inherited from the superclass, enabling the creation of more specialized classes while maintaining a strong connection to the parent/base class
- Enables the creation of a hierarchical relationship between classes, where the subclass can reuse and extend the functionality of the superclass
- Promotes code reusability, extensibility, and the organization of classes in a logical hierarchy

## Syntax of Inheritance

The syntax to create a subclass that inherits from a superclass is as follows:

```java
class Subclass extends Superclass {
    // Additional attributes and methods specific to the subclass
}
```

## Example of Inheritance

- Building a program to model different types of vehicles.
- Start with a base class called `Vehicle`, which contains common attributes and methods that all vehicles share

```java
class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println("Starting the vehicle.");
    }

    public void stop() {
        System.out.println("Stopping the vehicle.");
    }
}
```

- Create a subclass called `Car` that inherits from the `Vehicle` class:

```java
class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    public void honk() {
        System.out.println("Car is honking.");
    }
}

// Derived class (subclass)
class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, int year, boolean hasSideCar) {
        super(brand, year);
        this.hasSideCar = hasSideCar;
    }

    public void wheelie() {
        System.out.println("Motorcycle performed a wheelie.");
    }
}
```

- `Vehicle` is the base class that contains common attributes and methods related to all vehicles.
- `Car` is a derived class that inherits from `Vehicle`. It adds a specific attribute `numDoors` and a method `honk()` that is unique to cars.
- `Motorcycle` is another derived class that inherits from `Vehicle`. It adds an attribute `hasSideCar` and a method `wheelie()`.

### Implementation

```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2023, 4);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 2022, true);

        myCar.start();
        myCar.honk();
        myCar.stop();

        myMotorcycle.start();
        myMotorcycle.wheelie();
        myMotorcycle.stop();
    }
}
```

### Output

```text
Vehicle started.
Car honked.
Vehicle stopped.
Vehicle started.
Motorcycle performed a wheelie.
Vehicle stopped.
```

## Benefits of Inheritance

1. **Code Reusability:**
   Inheritance promotes the reuse of existing code. Common attributes and behaviors defined in the superclass are automatically inherited by subclasses. This eliminates the need to rewrite the same code in multiple places and minimizes code duplication, leading to more efficient and maintainable codebases.

   **Example:**
   Consider a superclass `Animal` with attributes and methods common to all animals. Subclasses like `Dog`, `Cat`, and `Bird` can inherit from `Animal`, avoiding the need to redefine basic animal properties for each subclass.

2. **Extensibility:**
   Inheritance enables the extension of existing classes by adding new attributes and methods in the subclasses. This allows developers to tailor classes to specific requirements while preserving the core functionality inherited from the superclass.

   **Example:**
   Extending the `Vehicle` superclass with a `Car` subclass, developers can add unique features like the number of doors and specialized methods like `honk()`.

3. **Hierarchical Organization:**
   Inheritance facilitates the organization of classes in a clear and logical hierarchy. Real-world relationships between entities can be represented in this hierarchy, making the codebase easier to understand and navigate.

   **Example:**
   Building a hierarchy of geometric shapes, such as `Shape` as the superclass and subclasses like `Circle`, `Rectangle`, and `Triangle`, allows for a natural and intuitive arrangement of classes.

4. **Polymorphism:**
   Inheritance contributes to the concept of polymorphism, where objects of different classes can be treated as instances of a common superclass. This enables dynamic behavior and enhances flexibility in method invocation.

   **Example:**
   Treating both `Dog` and `Cat` subclasses as instances of the `Animal` superclass allows a method like `makeSound()` to be invoked on any animal object, resulting in behavior specific to each subclass.

5. **Maintenance Efficiency:**
   When updates or modifications are required, making changes in the superclass can automatically affect all subclasses that inherit from it. This ensures consistent behavior throughout the codebase and reduces the effort needed for maintenance.

   **Example:**
   Modifying the `start()` method in the `Vehicle` superclass to handle engine diagnostics would automatically apply to all subclasses like `Car`, `Truck`, and `Motorcycle`.

## Composition and Inheritance Relationships

### Composition

- Design principle in object-oriented programming where a class is composed of one or more instances of other classes, usually as part of its state
- One class (the container or composite) holds references to objects of other classes (the components), and the components' lifecycles are managed by the container.
- Involves building complex objects by combining simpler objects as part of their state.

#### **Example:** Modeling a computer system

- `Computer` class might contain components like a `Processor`, `Memory`, and `HardDrive`, which are separate classes responsible for their specific functionalities
- `Computer` class composes these components to create a complete computer system

```java
class Processor {
    // Processor-related methods and attributes
}

class Memory {
    // Memory-related methods and attributes
}

class HardDrive {
    // Hard drive-related methods and attributes
}

class Computer {
    private Processor processor;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        processor = new Processor();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    // Computer-related methods
}
```

### Inheritance

- Involves creating a new class based on an existing class, inheriting its attributes and methods, and optionally adding or modifying them.

#### **Example (contd.)**

- Might have different types of computers, such as `DesktopComputer` and `LaptopComputer`, that share common features with the base `Computer` class.

```java
class DesktopComputer extends Computer {
    private Monitor monitor;

    public DesktopComputer() {
        monitor = new Monitor();
    }

    // DesktopComputer-related methods
}

class LaptopComputer extends Computer {
    private Battery battery;

    public LaptopComputer() {
        battery = new Battery();
    }

    // LaptopComputer-related methods
}
```

## `super` keyword

- Used to refer to the immediate parent class's members (fields, methods, constructors) when a subclass wants to override or extend their behavior
- Especially useful when the subclass has a member with the same name as the parent class

### Usage

1. **Accessing Parent Class Members:**

   ```java
   class Parent {
       int num = 10;
   }

   class Child extends Parent {
       int num = 20;

       void display() {
           System.out.println("Child num: " + num);       // Accessing child's num
           System.out.println("Parent num: " + super.num); // Accessing parent's num
       }
   }
   ```

   In this example, `super.num` refers to the `num` field of the parent class `Parent`.

2. **Invoking Parent Class Constructors:**

   ```java
   class Parent {
       Parent(int value) {
           // Parent class constructor logic
       }
   }

   class Child extends Parent {
       Child(int value) {
           super(value); // Invoking parent class constructor
       }
   }
   ```

   Here, `super(value)` invokes the parameterized constructor of the parent class.

3. **Overriding Parent Class Methods:**

   ```java
   class Parent {
       void display() {
           System.out.println("Parent class display");
       }
   }

   class Child extends Parent {
       @Override
       void display() {
           super.display(); // Invoking parent class's display method
           System.out.println("Child class display");
       }
   }
   ```

   In this case, `super.display()` calls the overridden method in the parent class.

4. **Accessing Parent Class Method from Static Context:**

   ```java
   class Parent {
       static void staticMethod() {
           System.out.println("Parent class static method");
       }
   }

   class Child extends Parent {
       static void staticMethod() {
           super.staticMethod(); // Accessing parent's static method from child's static method
           System.out.println("Child class static method");
       }
   }
   ```

   The `super` keyword can also be used to access static members of the parent class from a static context in the child class.

- Powerful tool for maintaining the relationship between parent and child classes in Java
- Allows access to and extend the functionality of the parent class while customizing behavior in the subclass

## Types of Inheritances

1. **Single Inheritance:**

   - A subclass extends only one superclass
   - Java supports single inheritance, which means a class can have only one direct parent class
   - Ensures a clear and simple hierarchy, but it can limit code reuse when multiple unrelated functionalities need to be inherited

   ```java
   class Parent {
       // Parent class members
   }

   class Child extends Parent {
       // Child class members
   }
   ```

2. **Multiple Inheritance (through Interfaces):**

   - Java doesn't support multiple inheritance of classes due to the "diamond problem," which can lead to ambiguity when two superclasses have a method with the same name
   - However, Java achieves a form of multiple inheritance through interfaces
   - A class can implement multiple interfaces, allowing it to inherit method signatures from multiple sources

   ```java
   interface InterfaceA {
       void methodA();
   }

   interface InterfaceB {
       void methodB();
   }

   class MyClass implements InterfaceA, InterfaceB {
       public void methodA() {
           // Implementation
       }

       public void methodB() {
           // Implementation
       }
   }
   ```

3. **Multilevel Inheritance:**

   - A subclass extends another subclass, creating a chain of inheritance
   - Each subclass inherits from the one above it, forming a hierarchical structure

   ```java
   class Grandparent {
       // Grandparent class members
   }

   class Parent extends Grandparent {
       // Parent class members
   }

   class Child extends Parent {
       // Child class members
   }
   ```

4. **Hierarchical Inheritance:**

   - Occurs when multiple subclasses inherit from a single superclass
   - Each subclass specializes the behavior inherited from the common superclass

   ```java
   class Vehicle {
       // Vehicle class members
   }

   class Car extends Vehicle {
       // Car class members
   }

   class Motorcycle extends Vehicle {
       // Motorcycle class members
   }
   ```

5. **Hybrid (Combination) Inheritance:**

   - Combines multiple types of inheritance, including single, multiple (interfaces), multilevel, and hierarchical inheritance
   - Important to handle this type of inheritance carefully to avoid complications and ambiguity

   ```java
   class A {
       // Class A members
   }

   interface B {
       // Interface B members
   }

   class C extends A implements B {
       // Class C members
   }
   ```

6. **Cyclic Inheritance:**

   - Occurs when classes form a cycle in their inheritance relationships
   - Can lead to confusion and compilation errors

   ```java
   class A extends B {
       // Class A members
   }

   class B extends A {
       // Class B members
   }
   ```

## Constructors and Inheritance

- Constructors play a crucial role in inheritance by facilitating the initialization of objects in both the superclass and subclass
- They ensure that the object's state is properly set up when creating instances of derived classes
- In Java, when a subclass is instantiated, its constructor implicitly invokes the constructor of its superclass as part of the object creation process

### Constructor Chaining

- When a subclass is created, its constructor must ensure that the initialization process begins with the constructor of the superclass. This process is called constructor chaining.
- Java accomplishes this by automatically inserting a call to the superclass constructor using the `super()` keyword as the first statement in the subclass constructor.

    ```java
    class Parent {
        Parent() {
            System.out.println("Parent's constructor");
        }
    }

    class Child extends Parent {
        Child() {
            super(); // Automatically added by Java
            System.out.println("Child's constructor");
        }
    }
    ```

- When a `Child` object is created, the `Child` constructor calls the `Parent` constructor using `super()`, ensuring that the superclass's initialization takes place before the subclass's.

### Parameterized Constructors and Superclass Constructors

- If the superclass has parameterized constructors, the subclass constructors need to explicitly call the appropriate superclass constructor using `super(...)` to ensure proper initialization of inherited fields.

    ```java
    class Parent {
        int value;

        Parent(int value) {
            this.value = value;
        }
    }

    class Child extends Parent {
        Child(int value) {
            super(value); // Calling the superclass constructor
        }
    }
    ```

### Default Constructors

- If the superclass has only a parameterless (default) constructor, Java implicitly inserts a call to it in the subclass constructor if no explicit `super(...)` call is provided.

    **Example with Inheritance and Constructors:**

    ```java
    class Animal {
        String type;

        Animal(String type) {
            this.type = type;
            System.out.println("Animal constructor");
        }
    }

    class Dog extends Animal {
        String breed;

        Dog(String type, String breed) {
            super(type); // Calling the superclass constructor
            this.breed = breed;
            System.out.println("Dog constructor");
        }
    }
    ```

## Abstract Classes

- Class that cannot be instantiated on its own and is meant to serve as a blueprint for its subclasses
- Used to define common attributes and methods that can be inherited by multiple subclasses
- Provide a way to achieve abstraction and define a common interface for a group of related classes while allowing specific implementation details to be left to the subclasses

### Key Points about Abstract Classes

#### 1. Cannot be Instantiated

- Abstract classes cannot be directly instantiated using the `new` keyword
- Because they might contain incomplete or undefined methods
- Serve as a foundation for other classes to extend from.

#### 2. May Contain Abstract Methods

- Can have abstract methods, which are declared without a body
- Subclasses that extend an abstract class must provide concrete implementations for these abstract methods

#### 3. Can Have Concrete Methods

- Can also have regular (concrete) methods with complete implementations
- Subclasses inherit these methods along with any abstract methods

#### 4. Can Have Constructors

- Can have constructors that are used to initialize fields common to all subclasses

#### 5. Provide Code Reusability

- Allow you to define common behavior in one place, which is inherited by multiple subclasses
- Promotes code reusability and maintainability

#### 6. Used for Polymorphism

- Often used as a base for polymorphism
- Allow you to create reference variables of the abstract class type that can hold instances of its concrete subclasses

### Example of an Abstract Class

```java
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double area(); // Abstract method

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}
```

- `Shape` is an abstract class that defines a common interface for various shapes
- `Circle` and `Rectangle` extend the `Shape` class and provide concrete implementations for the `area()` method
