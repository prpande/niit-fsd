package session;

import java.util.Scanner;
/*
 * Program to accept 5 elements in an array and calculate their sum.
 */
public class ArraySum 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int length = 5, sum = 0;
        int[] array = new int[length];
        
        for(int i = 0; i < length; i++)
        {
            System.out.println("Enter array element " + i);
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println("Sum of array :" + sum);
        scanner.close();
    }
}
