package session;

import java.util.Scanner;
/*
 * Write a program to show the count of occurrence of every digit in an array.
 */
public class OccurrenceCount 
{
    int noOfDigits = 10;
    public int[] countOccurrences(int[] array)
    {
        int[] digitCount = new int[noOfDigits];

        for(int i = 0; i < array.length; i++)
        {
            int quotient = array[i];
            while(quotient > 0)
            {
                int digit = quotient % 10;
                digitCount[digit]++;
                quotient = quotient / 10;
            }
        }

        return digitCount;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        OccurrenceCount occurrenceCount = new OccurrenceCount();

        System.out.format("Enter array length: ");
        int arrLength = scanner.nextInt();
        int[] inputArray = new int[arrLength];

        for(int i = 0; i < inputArray.length; i++)
        {
            System.out.format("Enter array element at index %d: ", i);
            inputArray[i] = scanner.nextInt();
        }

        int[] digitCount = occurrenceCount.countOccurrences(inputArray);

        System.out.println("Occurrence counts:");
        for(int i = 0; i < occurrenceCount.noOfDigits; i++)
        {
            if(digitCount[i] != 0)
            {
                System.out.format("%d : %d\n", i, digitCount[i]);
            }
        }
        
        scanner.close();
    }
}
