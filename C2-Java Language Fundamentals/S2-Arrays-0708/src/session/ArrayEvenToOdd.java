package session;

import java.util.Scanner;
/*
 * Even to Odd
 * Write a program that converts all even numbers present in the array
 * to the odd numbers and stores it in another array.
 */
public class ArrayEvenToOdd 
{
    public int[] convertEvenToOdd(int[] array)
    {
        int length = array.length;
        int[] oddArray = new int[length];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
            {
                oddArray[i] = array[i] + 1;
            }
            else
            {
                oddArray[i] = array[i];
            }
        }

        return oddArray;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayEvenToOdd obj = new ArrayEvenToOdd();
        int length = 7;
        int[] array = new int[length];
        
        for(int i = 0; i < length; i++)
        {
            System.out.println("Enter array element " + i + ":");
            array[i] = scanner.nextInt();
        }

        int[] oddArray = obj.convertEvenToOdd(array);
        for(int i = 0; i < length; i++)
        {
            System.out.println(oddArray[i]);
        }
        
        scanner.close();
    }
}
