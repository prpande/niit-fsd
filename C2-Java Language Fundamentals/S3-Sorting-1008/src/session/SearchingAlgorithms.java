package session;

import java.util.Scanner;
/*
 * Write a program to accept 5 elements in an array and accept any number
 * Search if the number is present in the array. 
 * Display the index of if its found else display not found.
 */
public class SearchingAlgorithms 
{
    public void linearSearch(int[] array, int numToSearch)
    {
        boolean found = false;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == numToSearch)
            {
                found = true;
                System.out.format("%d found at index: %d\n", numToSearch, i);
                break;
            }
        }

        if(!found)
        {
            System.out.format("%d NOT found in the given array.\n", numToSearch);
        }
    }

    public void binarySearch(int[] array, int numToSearch)
    {
        int upperBound = array.length - 1;
        int lowerBound = 0;

        boolean found = false;
        int index = -1;
        
        while(lowerBound <= upperBound && !found)
        {
            int mid = (lowerBound + upperBound) / 2;
            if(numToSearch == array[mid])
            {
                found = true;
                index = mid;
            }
            else if(numToSearch < array[mid])
            {
                upperBound = mid - 1;
            }
            else
            {
                lowerBound = mid + 1;
            }
        }

        if(found)
        {
            System.out.format("%d found at index: %d\n", numToSearch, index);
        }
        else
        {
            System.out.format("%d NOT found in the given array.\n", numToSearch);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        SearchingAlgorithms searchingAlgorithms = new SearchingAlgorithms();

        int[] inputArray = new int[5];
        int numToSearch;

        for(int i = 0; i < inputArray.length; i++)
        {
            System.out.format("Enter array element at index %d: ", i);
            inputArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the value to search:");
        numToSearch = scanner.nextInt();

        //searchingAlgorithms.linearSearch(inputArray, numToSearch);

        searchingAlgorithms.binarySearch(inputArray, numToSearch);

        scanner.close();
    }
}
