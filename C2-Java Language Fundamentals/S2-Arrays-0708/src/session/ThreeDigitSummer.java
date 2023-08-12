package session;

import java.util.Scanner;
/*
 * Write a program to show sum of three digit number present in an array
 */
public class ThreeDigitSummer 
{
    public int calculateSum(int[] array)
    {
        int sum = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > 99 && array[i] <1000)
            {
                sum += array[i];
            }
        }

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ThreeDigitSummer threeDigitSummer = new ThreeDigitSummer();

        System.out.format("Enter array length: ");
        int arrLength = scanner.nextInt();
        int[] inputArray = new int[arrLength];

        for(int i = 0; i < inputArray.length; i++)
        {
            System.out.format("Enter array element at index %d: ", i);
            inputArray[i] = scanner.nextInt();
        }

        int sum = threeDigitSummer.calculateSum(inputArray);
        System.out.println("Three digit numbers sum: " + sum);
        
        scanner.close();
    }
}
