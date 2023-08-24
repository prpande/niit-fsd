# Creating Objects and Constructors

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

## Copy Constructors

- Creates an object using another object of same class
- Creates duplicate copy of existing object
- Useful for deep copy/clone

## `static` Keyword

- Used to define class-level attributes and methods
- Shared among all instances of the class
- Accessed using the class name, not an object reference

## `final` Keyword

- Applied to variables, methods, and classes
- `final` variables cannot be changed after it is assigned a value
- `final` methods cannot be overridden by subclasses
- `final` classes cannot be extended
