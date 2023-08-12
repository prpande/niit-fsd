package session;

import java.util.Scanner;
/*
 * Write a program to accept an array and find the smallest element value in it.
 */
public class SmallestValueFinder 
{
    public int find(int[] array)
    {
        int smallest = array[0];

        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < smallest)
            {
                smallest = array[i];
            }
        }

        return smallest;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        SmallestValueFinder smallestValueFinder = new SmallestValueFinder();

        System.out.format("Enter array length: ");
        int arrLength = scanner.nextInt();
        int[] inputArray = new int[arrLength];

        for(int i = 0; i < inputArray.length; i++)
        {
            System.out.format("Enter array element at index %d: ", i);
            inputArray[i] = scanner.nextInt();
        }

        int smallest = smallestValueFinder.find(inputArray);
        System.out.println("Smallest element in the array: " + smallest);
        
        scanner.close();
    }
}
