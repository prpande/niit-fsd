# Questions and Answers

## Question 1

### Debug the function below to count the number of vowels in each word of a string array. Also write `main()` and pass the provided `string` array.

```java
public void countAllVowels(String[] string)
{
    int count;
    for (int i = 0; i < string.length; i++) 
    {
        char ch[]= string[i].toCharArray();
        for (int j = 0; j < ch.length; j++) 
        {
            if(ch[j] == 'a'||ch[j] == 'e'||ch[j] == 'i'||ch[j] == 'o'||ch[j] == 'u')
            {
                count ++;
            }
        }
        System.out.println(string[i] + " Vowels " + count);
    }
}
```

Input sample

```java
String string[]= {"Tommy","JOHN","JeNNy","Robert"};
```

***Solution in src\session\CountVowels.java***

## Question 2

### Write a program to accept a string and check if it is palindrome or not

Example: `nitin` is a palindrome. Reverse of `nitin` = `nitin`

***Solution in src\session\Palindrome.java***

## Question 3

### Write a program to accept a string and return all the vowels present in the string in a char array.

***Solution in src\session\ExtractVowels.java***

## Question 4 : Explain `String.split()` function in Java and give examples

In Java, the `String.split()` function is used to split a given string into an array of substrings based on a specified delimiter. \
The delimiter is a regular expression pattern that defines where the string should be divided. Each occurrence of the delimiter in the original string is used as a splitting point, and the resulting substrings are stored in an array.

The basic syntax of the `String.split()` method is as follows:

```java
String[] splitArray = originalString.split(delimiter);
```

Here, `originalString` is the string you want to split, and `delimiter` is the regular expression pattern that defines the splitting points.

### Example 1: Splitting by a Spac

```java
String sentence = "Hello world, how are you?";
String[] words = sentence.split(" "); // Splitting by space
for (String word : words) 
{
    System.out.println(word);
}
```

Output:

```text
Hello
world,
how
are
you?
```

### Example 2: Splitting by a Comma

```java
String csvData = "John,Doe,30,New York";
String[] fields = csvData.split(","); // Splitting by comma
for (String field : fields) 
{
    System.out.println(field);
}
```

Output:

```text
John
Doe
30
New York
```

### Example 3: Splitting with Multiple Characters

```java
String text = "apple,banana,grape;orange";
String[] fruits = text.split("[,;]"); // Splitting by comma or semicolon
for (String fruit : fruits) 
{
    System.out.println(fruit);
}
```

Output:

```text
apple
banana
grape
orange
```

### Example 4: Limiting the Number of Splits

```java
String data = "one:two:three:four:five";
String[] parts = data.split(":", 3); // Splitting into at most 3 parts
for (String part : parts) 
{
    System.out.println(part);
}
```

Output:

```text
one
two
three:four:five
```

The delimiter is treated as a regular expression, so we might need to escape special characters using backslashes if they have special meanings in regex (e.g., ".", "*", "?").

## Question 5: In Java, what is the difference between stack and heap?

In Java, the terms "stack" and "heap" refer to two different areas of memory used for different purposes in the execution of programs:

### Stack

The stack is a region of memory used for storing method execution frames, also known as stack frames. Each time a method is called, a new frame is created on the stack to store local variables, method arguments, and control information. The stack operates in a Last-In-First-Out (LIFO) manner, meaning that the most recently called method is the first one to be removed when it completes execution.

Key characteristics of the stack:

- Fast memory allocation and deallocation.
- Fixed and limited in size.
- Efficient for managing local variables and method calls.
- Memory management is done automatically by the system.

Stack memory is primarily used for managing the flow of program execution, including method calls, local variables, and function call management.

### Heap

The heap is a region of memory used for dynamic memory allocation, primarily for objects that have a longer lifetime or are created at runtime. Objects created on the heap can be accessed from different parts of the program and persist beyond the scope of the method that created them. Java objects, such as instances of classes, are stored in the heap.

Key characteristics of the heap:

- Slower memory allocation and deallocation compared to the stack.
- Dynamic and flexible in size.
- Objects created on the heap need to be explicitly managed by the programmer (usually via garbage collection).
- Suitable for managing objects with varying lifetimes.

Heap memory is responsible for storing objects and data structures that require more flexibility and have longer lifetimes compared to local variables and method frames.

The main difference between the stack and the heap in Java lies in their purposes and the types of data they manage. The stack is used for managing method execution frames and local variables with a short lifetime, while the heap is used for storing objects and data structures with longer lifetimes that need to be accessed from different parts of the program.

## Question 6: In Java, what are stack frames?

In Java, a stack frame (also known as an activation record or method frame) is a data structure that represents the state of a single method's execution within the call stack. The call stack is a region of memory used to manage the execution of methods and their associated data during program execution.

Each time a method is called, a new stack frame is created and pushed onto the call stack. This frame contains important information about the method being executed, including:

1. **Local Variables:** The method's parameters and any variables declared within the method. These variables are specific to the current method invocation and are not accessible from outside the method.

2. **Return Address:** The memory address to which the program should return after the method completes execution. This ensures that the program continues execution at the correct point.

3. **Operand Stack:** Used to store intermediate values during method execution, such as those used in calculations or intermediate results of expressions.

4. **Frame Data:** Additional information related to the method call, such as references to objects or dynamic linking information.

5. **Dynamic Linking Information:** Information used for dynamic method dispatch, allowing the program to determine which method to call in the case of polymorphism and method overriding.

As the method executes, the local variables and other relevant data are stored within the stack frame, and the program counter keeps track of the current instruction being executed within the method. When the method completes its execution, the stack frame is popped off the call stack, and the control returns to the point specified by the return address.

The call stack and stack frames are crucial for managing the flow of program execution, including method calls, handling local variables, and ensuring the correct sequence of method invocations and returns. 
> It's important to note that the stack has a limited size, so if the call stack becomes too deep due to excessive method calls, it can lead to a stack overflow error.

## Question 7: Explain following concepts

### Immutability of Strings

In Java, strings are immutable, which means that once a string object is created, its value cannot be changed. This fundamental property of strings has several implications:

1. **Value Cannot be Modified:** Once a string is created, its characters cannot be modified individually. For example, if you have a string "hello", you cannot change the 'h' to 'H' directly within the string itself.

2. **Creating a New String:** Any operation that appears to modify a string actually creates a new string object with the modified value, leaving the original string unchanged. This can have performance implications when performing a lot of string manipulation.

3. **Thread Safety:** Because strings are immutable, they are inherently thread-safe. Multiple threads can read the same string without worrying about concurrent modifications.

4. **Caching and Optimization:** The immutability property allows Java to perform various optimizations, like string interning and sharing of string instances, which can save memory and improve performance.

### String Pool

The string pool (also known as the string constant pool) is a special memory area in the Java heap where string literals are stored. Since strings are widely used in Java programs, they created a mechanism to optimize memory usage by reusing common string values. Here's how it works:

1. **String Interning:** When a string literal is encountered, Java checks if it already exists in the string pool. If it does, the existing reference is returned. If not, a new entry is added to the pool, and the reference to the new string is returned.

2. **String Sharing:** Since strings are immutable, it's safe to share them across different parts of the program. So, if two strings have the same content, they can share the same memory space in the pool.

```java
String str1 = "hello"; // Created in the string pool
String str2 = "hello"; // Reference to the same string in the pool
String str3 = new String("hello"); // Created in the heap, not in the pool
```

In the above example, `str1` and `str2` will reference the same string object in the string pool. However, `str3` will create a new string object in the heap because it's explicitly created using the `new` keyword.

The string pool helps save memory by reusing common string values and enhances performance by enabling quick comparisons of string values using reference equality (using `==`), as long as the strings are from the string pool.

> Because of the immutability of strings, when we perform operations that seem to modify a string (like concatenation), a new string is created, potentially impacting memory and performance.

## Question 8

### Write a program to count the number of spaces present in a string like `"Java is a programming language"`

***Solution in src\session\CountSpaces.java***

## Question 9: What are the laws of recursion

The key principles, often referred to as the "laws of recursion" are as follows.

1. **Base Case(s):** Every recursive function must have one or more base cases, which are specific scenarios where the function does not make a recursive call but provides a direct answer. Base cases are essential to prevent infinite recursion and to ensure that the recursion eventually terminates.

2. **Making Progress:** With each recursive call, the input or problem size must move closer to the base case(s). In other words, the function's arguments should be modified in a way that leads to reaching the base case(s).

3. **Design Rule:** Assume that the recursive function works correctly for smaller inputs and use that assumption to solve the current problem.

Here's a simple example to illustrate the laws of recursion:

```java
// Example: Calculating the factorial of a non-negative integer using recursion

public class RecursionExample 
{

    public static int factorial(int n) 
    {
        // Base case: factorial of 0 is 1
        if (n == 0) 
        {
            return 1;
        }
        // Making progress: n is getting closer to the base case
        else 
        {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) 
    {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
}
```

In this example, the laws of recursion are followed:

1. **Base Case:** When `n` becomes 0, the function returns 1, which is the base case.
2. **Making Progress:** In each recursive call, `n` is decremented by 1, moving closer to the base case.
3. **Design Rule:** The function assumes that `factorial(n - 1)` returns the correct result for smaller inputs, and it uses that to compute the result for `n`.

## Question 10: What are the steps or technique used in recursion for problem solving

Solving problems using recursion involves breaking down complex problems into smaller, more manageable subproblems, and then solving those subproblems using recursive calls. Here's a step-by-step technique to approach problem solving using recursion:

1. **Identify the Base Case:**
   - Determine the simplest possible scenario where a direct solution can be provided without further recursion. This is your base case.
   - Base cases are essential to ensure that the recursion eventually terminates.

2. **Define the Recursive Case:**
   - Express the problem in terms of a smaller subproblem or multiple subproblems of the same type.
   - Break down the problem into smaller pieces that can be solved using the same approach.

3. **Make Progress Toward the Base Case:**
   - Ensure that each recursive call reduces the problem's size or input toward reaching the base case.
   - Modify the function's arguments in a way that leads to eventually reaching the base case(s).

4. **Assume Recursion Works (Inductive Hypothesis):**
   - Assume that the recursive calls will correctly solve the smaller subproblems.
   - Use this assumption to solve the current problem by combining the solutions of the subproblems.

5. **Combine Subproblem Solutions:**
   - Combine the results obtained from the recursive calls to solve the original problem.
   - This combination step may involve mathematical operations, data structure manipulations, or other logical operations.

6. **Handle Any Necessary Cleanup or Restoration:**
   - If needed, perform any cleanup or restoration of data after the recursive calls are complete.
   - Ensure that the function's state is appropriately maintained during the recursion.

Here's a general template for implementing a recursive function using the steps mentioned above:

```java
public ReturnType recursiveFunction(Parameters...) 
{
    // Base case(s)
    if (condition) 
    {
        return baseCaseValue;
    }
    
    // Recursive case
    ReturnType subproblemResult = recursiveFunction(modifiedParameters...);
    
    // Combine subproblem solutions
    ReturnType combinedResult = combine(subproblemResult);
    
    // Cleanup or restoration (if necessary)
    
    return combinedResult;
}
```

## Question 11

### Rectify the following code of recursion

```java
public long multiplyOdds(int n)
{
    if(n<0)
    {
        return -1;
    }
    if(n==0) 
    {
        return 1;
    }
    if(! (n % 2 == 0)) 
    {
        return multiplyOdds(n - 1);
    }
    else 
    {
        return  n * multiplyOdds(n - 1);
    }
}
```

### Answer

```java
public long multiplyOdds(int n)
{
    if(n<0)
    {
        return -1;
    }
    if(n==0) 
    {
        return 1;
    }
    if(n % 2 == 0) // reversing the condition to fix the logic
    {
        return multiplyOdds(n - 1);
    }
    else 
    {
        return  n * multiplyOdds(n - 1);
    }
}
```
