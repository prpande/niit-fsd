package session;

import java.util.Scanner;
/*
 * Write a program to show the sum of positive numbers. Loop till the user is entering positive number. 
 * If a negative number is entered show the sum and exit the loop.
 */
public class PositiveNumberSum 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, numInput = 0;

        do
        {
            System.out.println("Enter a number:");
            numInput = scanner.nextInt();
            if(numInput > 0)
            {
                sum += numInput;
            }

        }while(numInput >= 0);

        System.out.println("Sum of numbers entered : " + sum);
        
        scanner.close();
    }    
}
