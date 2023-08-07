package session;

import java.util.Scanner;

/*
 * Program to accept 5 elements in an array and print them in reverse order.
 */
public class PrintArrayReverse 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int length = 5;
        int[] array = new int[length];
        
        for(int i = 0; i < length; i++)
        {
            System.out.println("Enter array element " + i);
            array[i] = scanner.nextInt();
        }

        for(int i = length - 1; i >= 0; i--)
        {
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
