# Implement Recursion - 1408

- Function calls itself to solve a smaller version of the same problem until it reaches the base case
- Expressing n<sup>th</sup> iteration as function of (n - 1)<sup>th</sup> iteration. Eg sum of n numbers, `Sum(n) = n + Sum(n-1)`
- Functions like a looping/nesting construct
- Behavior like a stack, where operations are pushed and evaluated in LIFO manner.
- Bit like Russian dolls, also known as Matryoshka dolls, that come in different sizes and fit inside each other, but with instructions in programming.
  1. Base Case: Think of the smallest doll in the set - the one that doesn't have any more dolls inside it. In programming, this is called the "base case." It's the point at which the process stops and starts going back out.

  2. Divide the Problem: Now, let's say you want to do something with each doll in the set. You start with the outermost doll, and then you open it to find a slightly smaller doll inside. You repeat this process until you reach the smallest doll.

  3. Solving as You Go Back: Once you've reached the smallest doll (the base case), you start solving the problem for that doll. Then, as you move back out to the larger dolls, you use the solution of the smaller doll to help you solve the problem for the larger doll.

  4. Combining Solutions: As you continue moving out, you're combining the solutions from the smaller dolls to solve the problem for the larger dolls. This process keeps happening until you've solved the problem for the outermost doll, which is the whole set.

## Example :  Sum of `n` natural numbers

```java
public class RecursionExample {

    // Recursive function to calculate the sum of natural numbers
    public static int sumOfNaturalNumbers(int n) 
    {
        // Base case: sum of first natural number is 1
        if (n == 1) 
        {
            return 1;
        }
        // Recursive case: sum(n) = n + sum(n-1)
        return n + sumOfNaturalNumbers(n - 1);
    }

    public static void main(String[] args) 
    {
        int number = 5;
        int result = sumOfNaturalNumbers(number);
        System.out.println("Sum of first " + number + " natural numbers is " + result);
    }
}
```

1. When you call `sumOfNaturalNumbers(5)`, it's not the base case, so the function enters the recursive case.
2. Inside the recursive case, it calculates `5 + sumOfNaturalNumbers(4)`.
3. To calculate `sumOfNaturalNumbers(4)`, the function again enters the recursive case and calculates `4 + sumOfNaturalNumbers(3)`.
4. This process continues until it reaches the base case of `sumOfNaturalNumbers(1)`, which returns 1.
5. Now, the function starts combining the results: `sumOfNaturalNumbers(1)` is 1, then `sumOfNaturalNumbers(2)` is 2 + 1 = 3, `sumOfNaturalNumbers(3)` is 3 + 3 = 6, and so on.
6. Finally, the result for `sumOfNaturalNumbers(5)` is 5 + 4 + 3 + 2 + 1 = 15.

## Steps to implement Recursion

1. Identify a base condition (stopping/termination condition)
2. Function should call itself
3. Update the value being calculated while calling itself

WAP to implement power function using recursion