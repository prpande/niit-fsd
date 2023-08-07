package session;

import java.util.Scanner;
/*
 * Even Numbers
 * 
 * Write a program that creates an array of numbers.
 * Iterate through the array and find all the even numbers and sum them using a method.
 * Print the sum value.
 */
public class ArrayEvenNumbersSum 
{
    public int sumOfEvenElements(int[] array)
    {
        int evenSum = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                evenSum += array[i];
            }
        }

        return evenSum;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayEvenNumbersSum obj = new ArrayEvenNumbersSum();
        int length = 7;
        int[] array = new int[length];
        
        for(int i = 0; i < length; i++)
        {
            System.out.println("Enter array element " + i + ":");
            array[i] = scanner.nextInt();
        }

        int evenSum = obj.sumOfEvenElements(array);
        System.out.println("Sum of even elements in array : " + evenSum);
        
        scanner.close();
    }
}
