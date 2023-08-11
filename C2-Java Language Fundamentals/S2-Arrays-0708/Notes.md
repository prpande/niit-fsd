# Working with Arrays 0708

- Needed when the program needs to access and use multiple data values of the same type.
- Managing separate variables for each data value is impractical and not scalable.

## Arrays

- Contain organized variables of the same datatype - *Data Structure*
- *Homogenous* - same datatype for all data stored
- Static in nature - fixed no. of values - Size of array cannot be altered during runtime
- Individual items are know as *elements*
- *Index* is the position of an element in the array
- Elements stored in contiguous memory locations
- *referenceType* datatype
- Indices start from *0*
- **Declaration**

    ```java
        dataType variableName[];
        dataType[] variableName;
    ```

- **Initialization** : memory allocation

    ```java
        int age[] = new age[10]
    ```

- Size of an array stored as array property `length`

    ```java
        int size = array.length;
    ```

### Single Dimension Array

- Single index values

|**Array**|21|32|41|5|67|...|32|
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|**Index**|0|1|2|3|4|...|*length-1*|
||

### Multi Dimensional Arrays

- Collection Of elements with a multi-index value.
- Arrays of arrays.

|**Index**|0|1|2|...|columns-1|
|:---:|:---:|:---:|:---:|:---:|:---:|
|**0**|5|8|10|...|0|
|**1**|11|44|71|...|1|
|**2**|3|19|43|...|-17|
|**...**|...|...|...|...|...|
|**rows-1**|7|13|8|...|6|
||

### Initialization

- Arrays initialized using the `new` keyword

```java
    int length = 10;
    int[] array = new int[length];
    array[0] = 21;
    array[1] = 32;
    array[3] = 41;
    array[4] = 5;
    ...
    array[length-1] = 32;
```

- Loops used to efficiently *traverse* (iterate) through an array and process its data

- Arrays can be initialized in the same line as declaration.

```java
    int array[] = {21, 3, 4, 12, 34};
```

### Reference Types are passed/ used by reference

```java
    int x = 10;
    int y = x;

    int[] arr = {1, 2, 3, 4, 5};
    int[] num = arr;
```

`x` and `y` will represent 2 different memory locations and the value of `x` will be copied to `y`. Modifying `x` will not impact `y`.

`arr` and `num` will point to the same memory location. Modifying any array will change the values for the other one also. Same data accessed by 2 different names.

### Command line Parameter in `main(String[] args)`

- Powerful way to interact with your Java programs from the command line and provide dynamic input without modifying your code.
- `main` method can accept command-line arguments when the program is executed.

- `args` parameter is an array of strings (`String[]`)

- Command-line arguments are provided as space-separated values when running the program

- Individual command-line arguments using array indexing, such as `args[0]` for the first argument, `args[1]` for the second, and so on.

- Usage Examples: you might provide a filename, a configuration option, a number, or any other kind of input data

- Always treated as strings, even if they represent numbers or other data types. You'll need to c
- Convert them to the appropriate data type using methods like `Integer.parseInt()` or `Double.parseDouble()` if needed.

- Example:

    ```text
    java MyProgram arg1 arg2 arg3
    ```

- Check the length of the `args` array before accessing specific indices to avoid `ArrayIndexOutOfBoundsException`.

TODO 1)Write a program to show the count of occurrence of every digit in following array
	{10,5,10,2,6,2,5,2,10}
like 10---3
      5---2
      2---3
      6---1

2)Write a program to show sum of three digit number present in following array:
	{22,234,1,100,58,111,2}

3)run below programs in main() one by one and check the difference

for(int i=1;i<=10;i++);
{
System.out.println("hello"+i);
}
System.out.println("hi"+i);


ang1 sp3
==============================

for(int i=1;i<=10;i++)
{
System.out.println("hello"+i);
}
System.out.println("hi"+i);
==============================
use scanner yourself and run this program

int i=0;
while(true)
{
System.out.println("enter a number");
i=sc.nextInt();
System.out.println("want to continue press y else n");

if(ch=='y')
break;
}

=============
Q1) Write a program to accept 5 elements of an int type in an array and find the lowest value and show it.
