# Problem Statement : Add Evens

Write a program with a recursive method called `addEvens` that returns the sum of the given first “n” even integers. ​

For example,

    addEvens(1)  must return 0
    addEvens(9) must return 20
    addEvens(-9) must return 0

## Tasks

1. The class `AddEven` consists of one recursive method to calculate the sum of even numbers.

   ```java
   public long addEvens(int n)
   ```

    This method takes a positive integer `n` as input and finds the sum of all the even numbers up to the given number ‘n’ ​
    For example, if input is 9, the even numbers till 9 are summed up 2+4+6+8 = 20

2. In the `main` method, call the `addEvens` method and print the sum of even numbers
3. Execute all the test cases provided in the test folder
