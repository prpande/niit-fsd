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
