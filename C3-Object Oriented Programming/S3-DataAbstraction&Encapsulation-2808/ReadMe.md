# Implement Data Abstraction and Encapsulation

- OOP- -class, object constr
- package, visibility modifiers

- MVC - model, view, controller

## Packages

- Namespace to organize set of related classes, interfaces, and other resources together
- Provide a hierarchical structure to manage the codebase, making it easier to manage and maintain larger projects
- Containers for classes
- Defined using the `package` keyword at the beginning of a Java file, and classes can be accessed across packages using the `import` statement.
- Help prevent naming conflicts between classes with similar names by using the package name as a namespace.

### Advantages of Packages

1. **Organize Code:** Group related classes and resources together, making it easier to find and manage them.
2. **Encapsulation:** Control the access to classes and members using access modifiers like `public`, `private`, `protected`, and `default`.
3. **Namespace Management:** Help avoid naming collisions between classes that might have the same name but belong to different packages.
4. **Access Control:** Can restrict access to certain classes or members based on package-level visibility.

```java
package com.example;
import com.example.otherpackage.OtherClass;
public class MyClass {
    // Class implementation
}
```

## Principles of OOP

Features or pillars of OOP

1. **Encapsulation**: Bundling data and methods that operate on that data into a single unit (class), while hiding the internal details from the outside.
2. **Inheritance**: Creating new classes that inherit properties and behaviors from existing classes, forming a hierarchical structure.
3. **Polymorphism**: Allowing objects of different classes to be treated as objects of a common superclass through method overriding and interfaces.
4. **Abstraction**: Simplifying complex reality by modeling classes based on their essential properties and behaviors, while hiding irrelevant details.

### Encapsulation

- Involves bundling data (attributes) and methods (functions) that operate on the data into a single unit called a class, like a *capsule*
- Information hiding
- Preventing contamination
- Restricts direct access to the internal details of an object and instead provides controlled access through methods, ensuring data integrity and security
  - **Setter and getter methods**: Prevent variables from misuse or unwanted changes by other objects.

#### **Key points about encapsulation**

1. **Data Hiding:** Hides the internal state of an object from the outside world. Data attributes are often marked as private, preventing direct access.
2. **Access Control:** Access to the data within an object is controlled through methods (getters and setters), allowing you to enforce rules and validations.
3. **Data Integrity:** Ensures that the data remains in a valid state by implementing checks and validations in setter methods.
4. **Flexibility:** Can change the internal representation of data without affecting the external code using the class.

#### Example of encapsulation in Java

```java
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null && !newName.isEmpty()) {
            name = newName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }
}
```

- `Person` class encapsulates the `name` and `age` attributes
- Direct access to these attributes is restricted, and access is provided through getter and setter methods
- Setter methods implement validation checks to ensure that the data remains valid.

#### **Access specifiers**

- Restrict access to the variables in a class at multiple levels.
- Visibility modifiers
- Control how these members can be accessed from different parts of the program
- Determine whether a variable or method in a class can be used or invoked by another class in the same package or in another package.
- Help in achieving encapsulation and controlling the visibility of members, which contributes to better code organization, security, and maintainability.

|Access|`default`|`private`|`protected`|`public`|
|:---|:---:|:---:|:---:|:---:|
|Same class|Yes|Yes|Yes|Yes|
|Same package subclass|Yes|*No*|Yes|Yes|
|Same package non-subclass|Yes|*No*|Yes|Yes|
|Different package subclass|***No***|*No*|Yes|Yes|
|Different package non-subclass|***No***|*No*|*No*|Yes|
|||||

1. **`public`:** Members marked as `public` are accessible from any class or package. There's no restriction on access.
2. **`private`:** Members marked as `private` are only accessible within the same class. They are hidden from external classes and packages.
3. **`protected`:** Members marked as `protected` are accessible within the same class, subclasses (even if they're in different packages), and within the same package.
4. **`default` (package-private):** When no access specifier is used, the member has default access, also known as package-private access. Members with default access are accessible within the same package but not from outside that package.

#### **Example**

```java
public class MyClass {
    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    int defaultVar; // Default access

    public void publicMethod() {
        // Code here
    }

    private void privateMethod() {
        // Code here
    }

    protected void protectedMethod() {
        // Code here
    }

    void defaultMethod() {
        // Code here
    }
}
```

- `publicVar` and `publicMethod()` are accessible from anywhere
- `privateVar` and `privateMethod()` are accessible only within the same class
- `protectedVar` and `protectedMethod()` are accessible within the class, subclasses, and the same package
- `defaultVar` and `defaultMethod()` are accessible within the same package

### Abstraction

- Involves hiding the complex implementation details and showing only the essential features of an object
- Helps in managing complexity, promoting code reusability, and providing a clear interface for interacting with objects without needing to understand their intricate inner workings.
- Both the variables and methods of a class can be abstracted out

#### **Key points about abstraction**

1. **Hiding Complexity:** Allows you to hide the internal details and complexities of an object, exposing only what is necessary for the user to interact with it.
2. **Creating Abstract Classes and Interfaces:** `abstract` `class` and `interface` that define the structure, methods, and properties that must be implemented by concrete subclasses.
3. **Incomplete Implementation:** Abstract classes can have abstract methods that are declared but not defined in the abstract class. Subclasses must provide concrete implementations for these methods.
4. **Polymorphism:** Abstraction enables polymorphism, allowing different classes to be treated as instances of a common superclass or interface, leading to more flexible and extensible code.

#### Example of abstraction

```java
abstract class Shape {
    abstract void draw(); // Abstract method

    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
```

- `Shape` class is an abstract class with an abstract method `draw()`
- `Circle` and `Rectangle` classes are concrete subclasses of `Shape` that provide implementations for the `draw()` method. 
- `displayInfo()` method is inherited by the subclasses, showcasing how abstraction hides the complexity of implementation details.
