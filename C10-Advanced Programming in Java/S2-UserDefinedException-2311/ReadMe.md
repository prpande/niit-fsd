<!-- omit in toc -->
# Create and Implement a User-defined Exception 23/11

Exception handling is a critical aspect of robust Java programming. While Java provides a set of built-in exceptions, there are scenarios where developers need to create their own exceptions to handle specific situations gracefully.

<!-- omit in toc -->
## Content

- [Understanding Exception Hierarchy](#understanding-exception-hierarchy)
- [Creating Custom Exceptions](#creating-custom-exceptions)
- [Best Practices for Custom Exceptions](#best-practices-for-custom-exceptions)
- [Throwing Custom Exceptions](#throwing-custom-exceptions)
- [Handling Custom Exceptions](#handling-custom-exceptions)
- [Chained Exceptions](#chained-exceptions)
- [Checked vs Un-Checked exceptions](#checked-vs-un-checked-exceptions)
- [`throw` vs `throws` keywords](#throw-vs-throws-keywords)

## Understanding Exception Hierarchy

Before diving into user-defined exceptions, it's crucial to understand the existing exception hierarchy in Java. All exceptions are derived from the `Throwable` class, which has two main subclasses: `Exception` and `Error`. The `Exception` class further divides into checked exceptions and unchecked exceptions (RuntimeExceptions).

```java
public class CustomException extends Exception {
    // constructor, methods, etc.
}
```

By extending the `Exception` class, developers create a checked exception that forces calling code to handle or declare it.

## Creating Custom Exceptions

User-defined exceptions are created by extending either the `Exception` class for checked exceptions or the `RuntimeException` class for unchecked exceptions. Let's consider a scenario where a banking application needs to handle an insufficient balance situation.

```java
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
```

In the above example, `InsufficientBalanceException` is a checked exception with a constructor that allows the developer to provide a custom error message.

## Best Practices for Custom Exceptions

1. Descriptive Naming: Choose meaningful names for custom exceptions that clearly convey the error scenario, enhancing code readability.

2. Provide Contextual Information: Include informative error messages in the exception constructors to help developers understand the cause of the exception.

3. Immutable Properties: If additional information needs to be conveyed with the exception, use immutable properties or parameters in the constructor to prevent unintended modification.

## Throwing Custom Exceptions

Once a custom exception is defined, it can be thrown explicitly using the `throw` keyword. In the context of our `InsufficientBalanceException`, consider the following example:

```java
public class Account {
    private double balance;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal");
        }
        // Withdraw logic
    }
}
```

## Handling Custom Exceptions

Custom exceptions are meant to be caught and handled appropriately. When calling code interacts with methods that throw custom exceptions, it should handle them using either a `try-catch` block or declare them in the method signature using `throws`.

```java
public class TransactionManager {
    public void processTransaction(Account account, double amount) {
        try {
            account.withdraw(amount);
            // Additional transaction logic
        } catch (InsufficientBalanceException e) {
            System.err.println("Transaction failed: " + e.getMessage());
            // Log or handle the exception accordingly
        }
    }
}
```

## Chained Exceptions

Java supports the concept of chained exceptions, allowing developers to associate multiple exceptions together. This is useful when an exception is caused by another exception.

```java
public void performOperation() throws CustomException {
    try {
        // Some operation that may throw an exception
    } catch (Exception e) {
        throw new CustomException("Operation failed", e);
    }
}
```

In the above example, the original exception (`e`) is chained with the custom exception, providing a more comprehensive view of the failure.

## Checked vs Un-Checked exceptions

Certainly! Here's a tabular differentiation between checked and unchecked exceptions in Java:

| Aspect                        | Checked Exceptions                                | Unchecked Exceptions (RuntimeExceptions)        |
|-------------------------------|--------------------------------------------------|--------------------------------------------------|
| **Compilation Requirement**   | Must be either caught using try-catch or declared in the method signature using "throws" | Compiler does not enforce catching or declaring, providing more flexibility |
| **Inheritance Hierarchy**     | Extend the `Exception` class or its subclasses    | Extend the `RuntimeException` class or its subclasses |
| **Examples**                  | IOException, SQLException, ClassNotFoundException | NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException |
| **Intended Use**              | Represents exceptional conditions that a well-written application should anticipate and recover from | Indicates programming errors or bugs, often a result of faulty logic or incorrect use of APIs |
| **Handling Approach**         | Forces developers to handle exceptions explicitly, enhancing code reliability | Developers have the flexibility to handle exceptions if desired, but it's not mandatory |

## `throw` vs `throws` keywords

Certainly! Here's a tabular differentiation between the `throw` and `throws` keywords in Java:

| Aspect                | `throw` Keyword                          | `throws` Keyword                                    |
|-----------------------|------------------------------------------|----------------------------------------------------|
| **Usage**             | Used to explicitly throw an exception.    | Used in method signature to declare checked exceptions that the method might throw. |
| **Applicability**     | Used within methods to throw exceptions. | Used in method declarations to indicate the types of exceptions that the method might throw. |
| **Syntax**            | `throw new ExceptionType("message");`    | `void methodName() throws ExceptionType { // method body }` |
| **Multiplicity**      | Can throw multiple exceptions in a method. | Lists multiple exception types separated by commas. |
| **Handling Requirement** | Exception must be caught or propagated up the call stack. | Caller of the method must handle or propagate the declared exceptions. |
| **Effect on Flow**    | Stops the normal flow of the program and transfers control to the nearest catch block. | Does not affect the normal flow of the program; exceptions are thrown when specific conditions are met. |
