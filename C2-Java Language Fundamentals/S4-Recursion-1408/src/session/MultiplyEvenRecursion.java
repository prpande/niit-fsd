package session;

import java.util.Scanner;
/*
 * Multiply Evens
 * Write a program with a recursive method called multiplyEvens
 * that returns the product of the given first "n" even integers. For example,
 * multiplyEvens (1) must return 1
 * multiplyEvens (9) must return 384
 */
public class MultiplyEvenRecursion 
{
    public int multiplyEvens(int n)
    {
        if(n <= 1)
        {
            return 1;
        }

        if(n % 2 == 0)
        {
            return n * multiplyEvens(n - 1);
        }
        else
        {
            return multiplyEvens(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        MultiplyEvenRecursion obj = new MultiplyEvenRecursion();

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        int evenProduct = obj.multiplyEvens(n);
        System.out.format("Product of Even numbers till %d is: %d\n", n, evenProduct);

        scanner.close();
    }
    
}
