# Implement Data Abstraction and Encapsulation

- OOP- -class, object constr
- package, visibility modifiers

- MVC - model, view, controller

## Packages

- Namespace to organize set of related classes
- Containers for classes

## Principles of OOP

- features or pillars of OOP
  - **Abstraction** - Ignoring irrelevant concepts and concentrating on relevant functionalities
  - **Encapsulation**  - Information hiding
  - **Inheritance** - deriving class from an existing class
  - **Polymorphism** - one object can have different forms

### Encapsulation

- Information hiding
- Preventing contamination
- **Setter and getter methods**: Prevent variables from misuse or unwanted changes by other objects.

#### Access specifiers

- Restrict access to the variables in a class at multiple levels.
- visibility modifiers
- Determine whether a variable or method in a class can be used or invoked by another class in the same package or in another package.

|Access|`default`|`private`|`protected`|`public`|
|:---|:---:|:---:|:---:|:---:|
|Same class|Yes|Yes|Yes|Yes|
|Same package subclass|Yes|*No*|Yes|Yes|
|Same package non-subclass|Yes|*No*|Yes|Yes|
|Different package subclass|***No***|*No*|Yes|Yes|
|Different package non-subclass|***No***|*No*|*No*|Yes|
|||||

### Abstraction

- Hiding unwanted details and exposing only the most essential information.
- When the object data is not visible to outside its own class, it creates data abstraction
- Both the variables and methods of a class can be abstracted
- Achieved using abstract classes and interfaces
