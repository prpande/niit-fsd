package session;

import java.util.Scanner;
/*
 * Even Numbers
 * 
 * Write a program that creates an array of numbers.
 * Iterate through the array and find all the even numbers and sum them.
 * Print the sum value.
 */
public class ArrayEvenNumbersSum 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int length = 5, evenSum = 0;
        int[] array = new int[length];
        
        for(int i = 0; i < length; i++)
        {
            System.out.println("Enter array element " + i + ":");
            array[i] = scanner.nextInt();

            if(array[i] % 2 == 0)
            {
                evenSum += array[i];
            }
        }

        System.out.println("Sum of even elements in array : " + evenSum);
        scanner.close();
    }
}
