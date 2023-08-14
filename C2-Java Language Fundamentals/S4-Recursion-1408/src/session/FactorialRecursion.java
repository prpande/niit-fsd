package session;

import java.util.Scanner;
/*
 * WAP to calculate factorial of a given number using recursion.
 */
public class FactorialRecursion 
{
    public int factorial(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        FactorialRecursion obj = new FactorialRecursion();

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        int nFactorial = obj.factorial(n);
        System.out.format("Factorial of %d is: %d\n", n, nFactorial);

        scanner.close();
    }    
}
