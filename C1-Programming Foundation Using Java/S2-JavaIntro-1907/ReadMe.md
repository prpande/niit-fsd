# Introduction to Java, Variables, Datatypes and Operators 19/07

- High level programming language
- Object oriented programming language like C++. Lower languages like C and pascal -> structured approach
- Used widely in major software engineering companies

## Computer

Consists of

- hardware
- software -> collection of programs to perform variety of tasks
  - system -> assist the system how to work
  - application -> used for specific tasks on top of the resources provided by the system
  - database -> to store high volume of data

## Language

A medium to author softwares

### Basic language constructs

- variables
  - named memory locations
  - used to store values
- operators
  - arithmetic + - *
  - relational or comparison < > <= == !=
  - logical && || !
  - unary ++ --
  - ternary ?:
- datatypes -> used to define what type of value to be stored in a variable
  - int, float, double, char, boolean

## History of Java

- in 1991 at Sun Microsystems by Green Team comprising James Gosling, Patrick Naugthon, Mike Schredian, Herbert Scheild
- first named Oak -> symbol of strength
- proposed name Silk
- Java island in Indonesia where first coffee seeds were identified

## Features of Java

- Simple -> english like statements
- Pure OOP language; C++ not pure OOP as it functions even without constructs like class/objects when following C format.
- Robust - reliable due to features like exception handling, garbage collection
- Portable - platform independent. Write once run anywhere (WORA)
- Secure - distributed/isolated environment (JVM)
- case sensitive
- source files have extension .java

## Class

- Starts with a capital letter
- Follow Pascal casing
- Filename should be the same at the class defined in it
  
## Methods

- main()
  - entry point to the program
  - execution starts from main

## Compile and Execute steps

**Compile** -> creates .class file

    $> javac fileName.java

.class file  is bytecode file -> highly optimized set of instructions understood by JVM and can be executed on any machine if JVM is installed

**Execute**

    $> java fileName

## Frequently Terms Used

### **JDK - Java Development Kit**

Platform independent software development kit containing tools for developing, debugging programs etc.

### **JIT - Just in Time compiler**

Part if class loader that translates bytecode into machine code.

### **JRE - Java Runtime Environment**

Environment to execute java code

### **JVM - Java Virtual Machine**

Inside JVM, responsible for interpreting and executing the bytecode and generating machine code to run the java programs that is understandable by the underlying OS.

**Note:** JVM is platform dependant.


# Introduction to Java, Variables, Datatypes and Operators 20/07

## Casting

- Java is statically-typed programming language
- All variables must be declared before use
- Use arithmetic assignment operator or compound assignment operator
- Type casting to convert from one type to another
- Data loss can occur if casting from a larger memory size datatype to a smaller one

### Widening Casting (Implicit)

- Automatic Type Conversion
- Occurs when both types are compatible and the target type is larger than source type
- `byte` -> `short` ->`int` -> `long` -> `float` -> `double`

**Example**

```java
public class ImplicitCastingExample 
{
    public static void main(String args[]) 
    {
        byte i = 40;
        // No casting needed for below conversion
        short j = i; //byte is promoted to short ,short to int and so on
        int k = j;
        long l = k;
        float m = l;
        double n = m;
        System.out.println("byte value : "+i);
        System.out.println("short value : "+j);
        System.out.println("int value : "+k);
        System.out.println("long value : "+l);
        System.out.println("float value : "+m);
        System.out.println("double value : "+n);
    }
}
```

**Output**

```text
    byte value : 40
    short value : 40
    int value : 40
    long value : 40
    float value : 40.0
    double value : 40.0
```

### Narrowing Casting (Explicit)

- Need Explicit Conversion
- When assigning a larger type to a smaller type
- While coding ensure no data loss

**Example**

```java
    public class ExplicitCastingExample 
    {
        public static void main(String args[]) 
        {
            double d = 30.0;
            // Explicit casting is needed for below conversion
            float f = (float) d;
            long l = (long) f;
            int i = (int) l;
            short s = (short) i;
            byte b = (byte) s;
            System.out.println("double value : "+d);
            System.out.println("float value : "+f);
            System.out.println("long value : "+l);
            System.out.println("int value : "+i);
            System.out.println("short value : "+s);
            System.out.println("byte value : "+b);
        }
    }
```

**Output**

```text
    double value : 30.0
    float value : 30.0
    long value : 30
    int value : 30
    short value : 30
    byte value : 30
```

### Converting to `String`

Use `valueOf()` function in `String` class

**Example**

```java
    public class Main
    {
        public static void main(String[] args)
        {
            // create int type variable
            int num = 10;
            System.out.println("The integer value is: " + num);

            // converts int to string type
            String data = String.valueOf(num);
            System.out.println("The string value is: " + data);
        }
    }

```

**Output**

```text
    The integer value is: 10
    The string value is: 10
```

### Converting from `String`

Use parse methods like `parseInt()` for `int` present in the wrapper classes.

**Example**

```java
    public class Main
    {
        public static void main(String[] args)
        {
            // create string type variable
            String data = "10";
            System.out.println("The string value is: " + data);

            // convert string variable to int
            int num = Integer.parseInt(data);
            System.out.println("The integer value is: " + num);
        }
    }
```

## Java's primitive datatypes

`n` = size in bytes\
then,\
`range` = -2<sup>`n`-1</sup> to 2<sup>`n`-1</sup>-1

|**Type**|**Size in Bytes**|**Range**|
|:---|:---|:---|
|`byte`|1 byte|-128 to 127|
|`short`|2 bytes|-32,768 to 32,767|
|`int`|4 bytes|-2,147,483,648 to 2,147,483, 647|
|`long`|8 bytes|-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807|
|`float`|4 bytes|1.40239846e-45f to 3.40282347e+38f|
|`double`|8 bytes|4.94065645841246544e-324 to 1.79769313486231570e+308|
|`char`|2 bytes|0 to 65,536 (unsigned)|
|`boolean`|not defined precisely <sup>`1`</sup>|true or false|
|||

<sup>`1`</sup> `boolean` represents one bit of information, but its "size" isn't something that's precisely defined

> **NOTE:** Java does not support unsigned types. Only exception is `char`

### Default values of primitive data types in Java

|**Type**|**Default Value**|
|:---|:---|
|`byte`|0|
|`short`|0|
|`int`|0|
|`long`|0|
|`float`|0.0f|
|`double`|0.0d|
|`char`|`'\u0000'` means 0|
|`boolean`|False|
|`String`|Null|
|||

In java `boolean` `true` value is a non-zero value and `false` value is zero. ​

## Binary Arithmetic and Operators

|**Decimal**|**Binary**|
|:---|:---|
|0|0000|
|1|0001|
|2|0010|
|3|0011|
|4|0100|
|5|0101|
|6|0110|
|7|0111|
|8|1000|
|9|1001|
|10|1010|
|||

### Binary to Decimal Conversion

0010 1000 <sub>(2)</sub>\
= (0 x 2<sup>7</sup> + 0 x 2<sup>6</sup> + 1 x 2<sup>5</sup> + 0 x 2<sup>4</sup> + 1 x 2<sup>3</sup> + 0 x 2<sup>2</sup> + 0 x 2<sup>1</sup> + 0 x 2<sup>0</sup>) <sub>(10)</sub>\
= (0 + 32 + 0 + 8 + 0 + 0 + 0) <sub>(10)</sub>\
= (32 + 8 ) <sub>(10)</sub>\
= 40 <sub>(10)</sub>

### Decimal to Binary Conversion

|**Base**|**Quotient**|**Remainder**|
|:---:|:---:|:---:|
|2|58|0|
|2|29|1|
|2|14|0|
|2|7|1|
|2|3|1|
|2|1|1|
|2|0|0|
|2|0|0|
|||

58 <sub>(10)</sub> = 0011 1010 <sub>(2)</sub>

### Bitwise Operators

- Perform evaluation and calculation in a bit by bit manner at the binary level.
- `<<` (left shift), `>>` (right shift), `&` (bitwise and), `|` (bitwise or), `~` (complement), `^` (XOR), `>>>` (unsigned right shift)

> For logical XOR use `logicalXOR()` `static` method in `Boolean` wrapper class. (Introduced in Java 8)

**XOR Truth Table**

|**A**|**B**|&#124;&#124; (logical OR)|&#124; (bitwise OR)| `^` (XOR)|
|:---:|:---:|:---:|:---:|:---:|
|0|0|0|0|0|
|1|0|0|1|1|
|0|1|1|1|1|
|1|1|1|1|0|
|||||

**Example**

```java
    int a = 10;
    int b = a<<2;
    System.out.println(a + "<<2 = " + b);
```

10 <sub>(10)</sub> = <mark>00</mark>00 1010 <sub>(2)</sub>\
So,\
10<sub>(10)</sub> `<<` 2 = 0010 1000 <sub>(2)</sub> = 40 <sub>(10)</sub>\
<mark>00</mark> get truncated

**Output**

```text
    10<<2= 40
```

**Example**

```java
    int a = 20;
    int b = a>>2;
    System.out.println(a + ">>2 = " + b);
```

**Output**

```text
    20>>2= 5
```

> **NOTE:** Operations `A<<n` is equivalent to multiplying `A` by 2 <sup>`n`</sup> and `A>>n` is equivalent to dividing `A` by 2 <sup>`n`</sup>.

**Example**

```java
    int a = 10;
    int b = 20;
    int res = a & b;
    System.out.println(a + " & " + b + " = " + res);
```

|||||||||||||
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|10 <sub>(10)</sub>| |0|0|0|0| |1|0|1|0|
|`&`| |||||||||||
|20 <sub>(10)</sub>| |0|0|0|1| |0|1|0|0|
|| |0|0|0|0| |0|0|0|0|= 0 <sub>(10)</sub>|
||||||||||

**Output**

```text
    10 & 20 = 0
```

**Example**

```java
    int a = 10;
    int b = 20;
    int res = a | b;
    System.out.println(a + " | " + b + " = " + res);
```

|||||||||||||
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|10 <sub>(10)</sub>| |0|0|0|0| |1|0|1|0|
|&#124;| |||||||||||
|20 <sub>(10)</sub>| |0|0|0|1| |0|1|0|0|
|| |0|0|0|1| |1|1|1|0|= 30 <sub>(10)</sub>|
||||||||||

**Output**

```text
    10 | 20 = 30
```

**Example**

```java
    public class Main
    {
        public static void main(String[] args)
        {
            int a = 10, b = 20;
            int and = a & b;
            int or = a | b;
            int complement = ~a;
            int xor = a ^ b;
            System.out.println(a + " & " + b + " = " + and);
            System.out.println(a + " | " + b + " = " + or);
            System.out.println("~ "+ a + " = " + complement);
            System.out.println(a + " ^ " + b + " = " + xor); 

            int num = 5;
            int leftShift = num << 4;
            int rightShift = num >> 2;
            
            System.out.println(a + " << 4 = " + leftShift); // 5<<10<<20<<40<<80
            System.out.println(a + " >> 2 = " + rightShift); // 5>>2>>1
        }
    }
```

**Output**

```text
    10 & 20 = 0
    10 | 20 = 30
    ~ 10 = -11
    10 ^ 20 = 30
    5 << 4 = 80
    5 >> 2 = 1
```

# Introduction to Java, Variables, Datatypes and Operators 21/07

## Precedence And Associativity

- Java has well-defined rules for evaluating expressions, including operator precedence, operator associativity, and order of operand evaluation
- **Operator Precedence:** Specifies the manner inn which operands are grouped with operators.
  - For example, `1 + 2 * 3` is treated as `1 + (2 * 3)`, wheareas `1 * 2 + 3` is treated as `(1 * 2) + 3` because multiplication has a higher precedence than the additon operator
  - Parentheses can be used to override the default operator precedence rules
- **Operator Associativity:** When an expression having 2 operators with the same precedence, the operators and operands are grouped according to their associativity.
  - For example, `72 / 2 / 3` is treated as `(72 / 2) / 3` since the division operator os left to right associate.
  - Parentheses can be used to override the default operator associativity rules
- Most operators are left-to-right associative. Assignment operator is an exception, which is right-to-left associative. `x = y = z = 17` is treated as `x = (y = (z = 17))`

|**Level**|**Operator**|**Description**|**Associativity**|
|:---:|:---:|:---:|:---:|
|16 |`()`<br>`[]`<br>`.`|parentheses<br>array access<br>member access|left-to-right|
|15|`++`<br>`--`|unary post-increment<br>unary post-decrement| left-to-right|
|14|`+`<br>`-`<br>`!`<br>`~`<br>`++`<br>`--`|unary plus<br>unary minus<br>unary logical NOT<br>unary bitwise NOT<br>unary pre-increment<br>unary pre-decrement|right-to-left|
|13|`()`<br>`new`|cast<br>object creation|right-to-left|
|12|`* / %`|multiplicative|left-to-right|
|11|`+ -`<br>`+`|additive<br>string concatenation|left-to-right|
|10|`<< >>`<br>`>>>`|shift|left-to-right|
|9|`< <=`<br>`> >=`<br>`instanceof`|relational|left-to-right|
|8|`==`<br>`!=`|equality|left-to-right|
|7|`&`|bitwise AND|left-to-right|
|6|`^`|bitwise XOR|left-to-right|
|5|&#124;|bitwise OR|left-to-right|
|4|`&&`|logical AND|left-to-right|
|3|&#124;&#124;|logical OR|left-to-right|
|2|`?:`|ternary|right-to-left|
|1|`= += -=`<br>`*= /= %=`<br>`&= ^=` &#124;`=`<br>`<<= >>= >>>=`|assignment|right-to-left|
|0|`->`|lambda expression arrow|right-to-left|
|||||

> There is no explicit operator precedence table in Java Language Specification. Instead the operator precedence and associativity rules are inferred via the grammar that defines the language.

**Example**

```java
    System.out.println("1 + 2 = " + 1 + 2);
    System.out.println("1 + 2 = " + (1 + 2));
```

**OutPut**

```text
    1 + 2 = 12
    1 + 2 = 3
```

**Explanation:** If either of the operands of the `+` operator is a `String`, the other is automatically cast to a `String`. Concatenation and addition have the same precedence and are left-to-right associative. The parentheses on the second statement ensures that the second `+` operator performs addition instead of concatenation.

**Example**

```java
    System.out.println(1 + 2 + "abc");
    System.out.println("abc" + 1 + 2);
```

**Output**

```text
    3abc
    abc12
```

**Example**

```java
    boolean a = false;
    boolean b = false;
    boolean c = true;
    System.out.println(a == b == c);
```

**Output**

```text
    true
```

**Explanation:** Equality operator is left-to-right associative, so first `a == b` is calculated then its result is compared with `c`.

**Example**

```java
    System.out.println(+-~17);
```

**Output**

```text
    18
```

**Explanation:** Unary operators are right-to-left associative. So `+(-(~17))` = -18, the `-(-18)` = 18.

**Example**

```java
    int x= 5;
    int y =10;
    System.out.println(++x * y--);
```

**Output**

```text
    60
```

**Example**

```java
    y =10;
    System.out.println(y+++y);
```

**Output**

```text
    21
```

## Escape Sequences

- A character with a backslash ( `\` ) just before it is an escape sequence or escape character.
- 8 valid escape sequences in Java

|**Escape Characters**|**Description**|
|:---:|:---|
|`\t`|Inserts tab|
|`\'`|Inserts single quote|
|`\"`|Inserts double quote|
|`\r`|Inserts a carriage return|
|`\\`|Inserts a backslash character|
|`\n`|Inserts a new line|
|`\f`|Inserts a form feed|
|`\b`|Inserts a backspace|
|||

- Java also supports **Unicode escape characters**.
  - Backslash ( `\` ) followed by one or more `u` characters and **four** hexadecimal digits like `\uXXXX`
  - Represents `\u0000` to `\uFFFF`

## System.out.format

- Accepts a string specifying how the objects passed as second parameters are to be fomatted
- Format string can contain plain text as well as *format specifiers*, which are special characters that format the passed in objects.
- Format specifiers begin with `%` and end with a *converter*
- *Converter* is a character indicating the type of the argument to be formatted
- There can be additional specifiers/flags between the `%` and the converter

**Example**

```java
    int i = 461012;
    System.out.format("The value of i is: %d", i);
```

**Output**

```text
    The value of i is: 461012
```

**Explanation:** Here the `%d` specifies that the single variable is a decimal integer

### Syntax of the format specifier

|`%`|`1$`|`+0`|`20`|`.10`|`f`|
|:---:|:---:|:---:|:---:|:---:|:---:|
|Begin<br>Format<br>Specifier|Argument<br>Index|Flags|Width|Precision|Conversion|
|||||||

- **Precision:** For floating point values, this is the mathematical precision of the formatted value. For `s` and other general conversions, this is the maximum width of the formatted value; the value is truncated if necessary.
- **Width:** The minimum width of the formatted value; the value is padded if necessary. By default the value is left-padded with blanks.
- **Flags:** specify additional formatting options. Like `+` flag specifies numer should always be formatted with `+` sign, `0` flag specifies that `0` is the padding character. Other flags include `-` (pad on the right) and `,` (format number with locale specific separators)
- **Argument Index:** allows you to explicitly match a designated argument.

|**Format<br>Specifier**|**Conversion Applied**|
|:---:|:---:|
|`%%`|Inserts a `%` sign|
|`%x %X`|Integer hexadecimal|
|`%t %T`|Time and date|
|`%s %S`|String|
|`%n`|Platform dependant new line character|
|`%o`|Octal Integer|
|`%f`|Decimal floating point|
|`%e %E`|Scientific notation|
|`%g`|Causes formatter to use either `%f` or `%e`,<br>whichever is shorter|
|`%h %H`|hash code of the argument|
|`%d`|decimal integer|
|`%c`|character|
|`%b %B`|boolean|
|`%a %A`|floating point hexadecimal|
|||

### Flags and Specifers examples

#### Space format specifier

Useful when creating columns of numbers to align numbers.<br>
Like aligning positive and negative numbers.

```java
    System.out.format("% d", -111);
    System.out.format("% d", 111);
```

Output:

```text
    -111
     111
```

#### `+` Sign Specifier

Adds the `+` sign before positive values.\
No effect on negative numeric values.

```java
    System.out.format("%+d", 111);
    System.out.format("%+d", -111);
```

Output:

```text
    +111
    -111
```

#### `(` specifier

Puts negative numeric values inside parentheses\
No effect on positive values.

```java
    System.out.format("%(d", 111);
    System.out.format("%(d", -111);
```

Output:

```text
    111
    (111)
```

#### Comma `,` specifier

Adds comma separators based on locale.\
Useful when displaying large values.

```java
    System.out.format("%, d", 1000000);
    System.out.format("%, .3f", 32659526566.4521);
```

Output:

```text
    1, 000, 000
    32, 659, 526, 566.452
```

#### Left Justification ( `-` ) specifier

By default all output is right-aligned if the field width is longer than the data printed\
This specifier forces output to be left-aligned.

```java
    System.out.format("|%20.4f|", 1234.1234);
    System.out.format("|%-20.4f|", 1234.1234);
```

Output:

```text
    |           1234.1234|
    |1234.1234           |
```

#### `%n` specifier

Inserts a platform specific newline character

```java
    System.out.format("Have %nA %nGood %nDay");
```

Output:

```text
    Have 
    A
    Good
    Day
```

#### `%%` specifier

Inserts a `%` sign

```java
    System.out.format("10 %% 4 = 2");
```

Output:

```text
    10 % 4 = 2
```

#### `%x %X` format specifiers

Used to represent integer hexadecimal values\
`%x` displays in lowercase\
`%X` displays in upper case

```java
    System.out.format("%x", 250);
    System.out.format("%X", 250);
```

Output:

```text
    fa
    FA
```

#### `%e %E` format specifier

Used to represent is scientific notation of a value
`%e` displays in lowercase\
`%E` displays in upper case

```java
    System.out.format("%e", 123.1234);
    System.out.format("%E", 25123.12340);
```

Output:

```text
    1.231234e+02
    1.231234E+02
```

#### Precision format specifiers

Applied to `%f`,`%e`, `%g` and `%s` specifiers
Value before the decimal `.` specifies the width of output value\
The value after decimal `.` specifies the digits after decimal kept in the output in case of floating point numbers.

```java
    System.out.println("Scientific notation to 2 places: %16.2e", 123.1234567);
    System.out.println("Decimal floating-point notation to 4 places: %.4f", 123.1234567);

    // The %g format specifier causes Formatter
    // to use either %f or %e, whichever is shorter
    System.out.println("Scientific or Decimal floating-point notation to 4 places: %.4g", 123.1234567);

    // Display at most 15 characters in a string.
    System.out.println("String notation to 15 places: %.15s", "12345678901234567890");

    // Format into 10 digit
    System.out.println("value in 10 digits: %010d", 88);
```

Output:

```text
    Scientific notation to 2 places:         1.23e+02
    Decimal floating-point notation to 4 places: 123.1235
    Scientific or Decimal floating-point notation to 4 places: 123.1
    String notation to 15 places: 123456789012345
    value in 10 digits: 0000000088
```

## Wrapper Classes in Java

Class whose object wraps or contains primitive data types\
8 wrapper classes in Java

### Need for Wrapper Classes

- Needed if we want to pass primitive types by reference
- Library classes often handle only objects so with wrapper they can be leveraged for primitive types
- Library data structures in Collection framework like `ArrayList` and `Vector`, store only objects
- Object is needed to support synchronization in multithreading

### Advantages of Wrapper Classes

- Collections can be made using primitive types
- Methods inherited from base `Object` class like `compareTo()`, `equals()`, `toString()` etc. can be called
- Only objects can be cloned
- Object data allows null values
- Objects can be serialized

|**Primitive Data Type**|**Wrapper Class**|
|:---:|:---:|
|`char`|`Character`|
|`byte`|`Byte`|
|`short`|`Short`|
|`int`|`Integer`|
|`long`|`Long`|
|`float`|`Float`|
|`double`|`Double`|
|`boolean`|`Boolean`|
|||

### Autoboxing and Unboxing

- Automatic conversion of primitive types into corresponding wrapper classes is called autoboxing.
- `int` to `Integer`, `long` to `Long`, `double` to `Double` etc.

```java
    char ch = 'A'
    Character a = ch;
```

- Reverse of autoboxing is unboxing. Automatic conversion from an object of a wrapper class to its corresponding primitive type.
- `Integer` to `int`, `Long` to `long`, `Double` to `double` etc.

```java
    Integer iObj = new Integer(55);
    int i = iObj;
```
