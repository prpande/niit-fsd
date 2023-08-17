package com.jap.array;

public class OccurrenceCount {

    //write the logic to count the occurrence of a given number from the sorted array
    public int countOccurrences(int numberArray[], int length, int number)
    {
       return 0;
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
