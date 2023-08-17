package com.jap.array;

public class OccurrenceCount 
{

    //write the logic to count the occurrence of a given number from the sorted array
    public int countOccurrences(int numberArray[], int length, int number)
    {
        if(length <= 0)
        {
            return 0;
        }

        if(numberArray[length - 1] == number)
        {
            return 1 + countOccurrences(numberArray, length - 1, number);
        }
        else
        {
            return countOccurrences(numberArray, length - 1, number);
        }
    }

    public static void main(String args[])
    {
        int numberArray[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int length = numberArray.length;
        int number = 2;
        OccurrenceCount occurrenceCount = new OccurrenceCount();
        occurrenceCount.countOccurrences(numberArray, length,number);
    }
}
