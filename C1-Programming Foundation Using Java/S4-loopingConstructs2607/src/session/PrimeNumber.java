package session;

import java.util.Scanner;
import java.lang.Math;
/*
 * Program to accept an number and show whether it is prime number or not.
 */
public class PrimeNumber 
{
    public static void main(String[] args)    
    {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number:");
        number = Integer.parseInt(scanner.nextLine());

        boolean isPrime = true;
        int sqrt = (int)Math.sqrt(number);
        for(int i = 2; i <= sqrt; i++)
        {
            if( number % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
        {
            System.out.format("%d is a prime number.\n", number);
        }
        else
        {
            System.out.format("%d is NOT a prime number.\n", number);
        }

        scanner.close();
    }
}
