# Problem Statement : Road Trip

Tom and Richie are traveling from London to York by road. Tom wishes to calculate the distance they have covered in miles, while Richie wishes to calculate it in kilometers. Both have decided to do the km to mile and mile to km conversion by using the Fibonacci Series.

The Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,…

For example,

1. Mile to kilometer conversion: If we take a number from Fibonacci series i.e., 8 then the kilometer value will be 12.874752 by formulae, which is nearly 13 by rounding off to the nearest whole number.
2. Kilometer to mile conversion: If we take a number from Fibonacci series i.e., 89 as kilometer value then mile value will be 55.30203610912272 by formulae, which could be considered as 55 by rounding off to the nearest whole number.
3. In both conversions, the left element will be considered as mile value and right element will be considered as Kilometer value in the Fibonacci series.

Write a Java program to generate the Fibonacci Series by using recursion

## Tasks

1. The class `FibonacciSeries` consists of two methods.

   ```java
   public long fibonacci(long number) 
   ```

    This is a recursive method that takes an integer as input and returns the number of Fibonacci series numbers based on the input.
    If 9 is the input, it must generate the first 9 numbers of the series i.e.,0,1,1, 2, 3, 5, 8, 13, 21.

    ```java
    public void printFibonacciSeries(long number)
    ```

    This method prints the Fibonacci series by calling the `fibonacci()` method to get the next number in the series.

2. In the `main` method, call the `printFibonacciSeries` method and print the series.
3. Execute all the test cases provided in the test folder.
