# Implementing Conditional Constructs 24/07

- Decision making constructs
- `==` : Equality comparison operator
- Nested `if` : `if` inside another `if` block
  
```java
  if(condition1)
  {
    ...
    if(condition2)
    {
      ...
    }
  }
```

- `if` - `else if` ladder: Consecutive `if` - `else` blocks with another `if` - `else` block inside the previous `else`'s block

```java
  if(condition1)
  {
    ...
  }
  else if(condition2)
  {
    ...
  }
  else if(condition3)
  {
    ...
  }
  ...
```

## Scanner class

- Used to accept inputs from the specified channel during initialization.
- Contained in predefined Util package.
- Included using `import java.util.Scanner;`
- Values read using methods like `nextInt()`. `nextFloat()`, `next()` (for accepting `String`) etc.
  - `nextLine()` returns every character in a line of text right up until the carriage return
  - `next()` splits the line up into individual words, returning individual text Strings one at a time. It read input from the input device till the space character.

```java
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number: ");
  int num = sc.nextInt();
  System.out.println("Enter name: ");
  String name = sc.next();
```
