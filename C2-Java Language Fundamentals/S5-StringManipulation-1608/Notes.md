# String Manipulation 16/08

## String Basics

- Non primitive datatype
- Array of `char`. Individual characters can be accessed by index. Eg `str[0]`
- `String` is a pre-defined class in Java
- Defined in `java.lang`
- Strings are immutable - once defined cannot be changed
- **String Class Methods:** Methods like `length()`, `charAt()`, `substring()`, and `concat()` available in the `String` class.
- **String Concatenation:** `+` operator combines strings and demonstrate its use.
- **Example:**

    ```java
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName;
    int length = fullName.length();
    String substring = fullName.substring(5);
    ```

## Immutability of Strings

- Once a string is created, its value cannot be changed.
- Advantages of Immutability: thread safety, predictability, and it simplifies debugging.
- Creating New Strings: any modification to a string results in a new string object being created.
- **Example:**

    ```java
    String original = "Hello";
    String modified = original.concat(", world!"); // Creates a new string
    ```

## String Pool

- a mechanism to store and reuse string literals.
- strings created using double quotes are pooled for memory efficiency.
- string literals with strings created using the `new` keyword, do not participate in the pool.
- **Example:**

    ```java
    String str1 = "Hello";       // Pooled
    String str2 = "Hello";       // Reuses pooled "Hello" string
    String str3 = new String("Hello"); // Not pooled
    ```

## StringBuilder and StringBuffer

- `StringBuilder` and `StringBuffer` for mutable character sequences.
- `StringBuffer` is thread-safe due to synchronization, while `StringBuilder` is not.
- **Performance Gain:** using these classes reduces memory overhead during repeated modifications.
- **Example:**

    ```java
    StringBuilder stringBuilder = new StringBuilder("Hello");
    stringBuilder.append(", world!");
    String result = stringBuilder.toString();
    ```

## Memory Implications, Optimization, and Allocation

- Using string literals efficiently utilizes the String Pool.
- **Introduction to Allocation:** memory allocation occurs in two main areas: stack and heap.

## Stack and Heap Allocation

- **Stack Allocation:**  a region for method invocations and local variables. Memory allocation and de-allocation are automatic.
  - primitive data types and references to objects are stored in the stack.
- **Heap Allocation:** a dynamic memory area for objects. Memory management is manual, and objects persist beyond method scope.
  - objects themselves are stored in the heap, while references are stored in the stack.
- **Stack vs Heap:** differences between stack and heap, including speed, memory management, and object lifetimes.
- **Examples:**

    ```java
    public class StackHeapAllocationDemo {
        public static void main(String[] args) {
            int primitive = 10; // Stored in stack
            String str = "Hello, world!"; // Reference stored in stack, object in heap

            allocateOnStack();
            allocateOnHeap();
        }

        public static void allocateOnStack() {
            int localVar = 5; // Local variable stored in stack
        }

        public static void allocateOnHeap() {
            String dynamicStr = new String("Dynamic String"); // Object and reference in heap
        }
    }
    ```

## String Comparison and Memory Allocation

- **Equals Method:** `equals()` method for comparing string contents. Compares values, not memory addresses.
- **`==` Operator:**  for comparing references. Compares memory addresses.
- Comparison methods working with respect to stack and heap memory allocation. **Examples:**

    ```java
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");

    boolean equalsComparison = str1.equals(str2); // true
    boolean operatorComparison = str1 == str2;    // true
    boolean equalsWithNew = str1.equals(str3);    // true
    boolean operatorWithNew = str1 == str3;       // false
    ```
