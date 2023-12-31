package session;

import java.util.Scanner;
public class SortingAlgorithms 
{
    public void linearSort(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void bubbleSort(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - 1 - i; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public void insertionSort(int[] array)
    {
        int n = array.length;
        for (int i = 1; i < n; i++)
        {
            int key = array[i] ;
            int j = i - 1;
            while (j >= 0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        System.out.format("Enter array length: ");
        int arrLength = scanner.nextInt();
        int[] inputArray = new int[arrLength];

        for(int i = 0; i < inputArray.length; i++)
        {
            System.out.format("Enter array element at index %d: ", i);
            inputArray[i] = scanner.nextInt();
        }

        // Uncomment below to run a particular sorting algorithm.
        
        //sortingAlgorithms.linearSort(inputArray);
        //sortingAlgorithms.bubbleSort(inputArray);
        sortingAlgorithms.insertionSort(inputArray);
        
        System.out.println("Array after sorting");
        sortingAlgorithms.printArray(inputArray);

        scanner.close();
    }

    public void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
