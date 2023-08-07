package session;

import java.util.Scanner;

/*
 * Program to accept 5 elements in an array and 
 * print them in reverse order using a function.
 */
public class PrintArrayReverse 
{
    public int[] getReverseArray(int[] inArray)
    {
        int length = inArray.length;
        int[] reverseArray = new int[length];

        for(int i = 0; i < length; i++)
        {
            reverseArray[i] = inArray[length - 1 -i];
        }

        return reverseArray;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        PrintArrayReverse obj = new PrintArrayReverse();

        int length = 5;
        int[] array = new int[length];
        
        for(int i = 0; i < length; i++)
        {
            System.out.println("Enter array element " + i);
            array[i] = scanner.nextInt();
        }

        int[] reverseArray = obj.getReverseArray(array);

        for(int i = length - 1; i >= 0; i--)
        {
            System.out.println(reverseArray[i]);
        }

        scanner.close();
    }
}
