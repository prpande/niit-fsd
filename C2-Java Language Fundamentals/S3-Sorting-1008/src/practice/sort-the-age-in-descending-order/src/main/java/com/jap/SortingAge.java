package com.jap;

public class SortingAge 
{
    //Write the logic to sort the array containing the age in descending order
    // inside the below method and return the sorted array
    public int[] getSortedAge(int [] ageArray)
    {
        int length = ageArray.length;
        int[] sortedArray = new int[length];

        for(int i = 0; i < length; i++)
        {
            sortedArray[i] = ageArray[i];
        }

        for(int i = 0; i < length - 1; i++)
        {
            for(int j = 0; j < length - 1 - i; j++)
            {
                if(sortedArray[j] < sortedArray[j+1])
                {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                }
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) 
    {
        //Declare and initialize an integer array containing age.
        int ageArray[] = {22, 34, 33, 32, 36, 27, 28};

        //Create an object of the class SortingAge
        SortingAge sortingAge = new SortingAge();

        //Call the method getSortedAge and pass the parameter
        int[] sortedArray = sortingAge.getSortedAge(ageArray);

        System.out.println("Array after sorting");
        for(int i = 0; i < sortedArray.length; i++)
        {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println("");
    }
}
