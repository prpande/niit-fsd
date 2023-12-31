# Implement Modular Programming using Functions

- Optimization
- Modularity
- Reusability
- IPO cycle - Input -> Processing -> Output
  
|Input|->|Processing|->|Output|
|:---:|:---:|:---:|:---:|:---:|
|parameters||Function logic||returned value|
|||||

- Built-in and user-defined
- Naming convention follows camel-case eg. `calculateArea`.
- Structure of a method - function signature

```html
    <modifier> <returnType> <methodName>(<parameters>)
    {
        <method body>
    }
```

- If a method doesn't return a value the *returnType* will be `void`.
- Methods send value back to the calling method using the `return` keyword.
- Member methods of a class are called using the `.` operator on an object of the class. Eg. `scanner.nextInt()`.

- Local Variables: variables defined inside a specific block of code/ loop /method.
- Instance Variables: declared inside the class and not inside any of its methods.
- Objects are not needed to call another method of the same class.