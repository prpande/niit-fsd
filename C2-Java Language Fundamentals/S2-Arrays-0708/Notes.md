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
