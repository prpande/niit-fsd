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
