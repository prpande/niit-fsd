package com.bej.sorting;

public class Sorting 
{
    public int[] sort(int [] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            //Identify and fix the logical errors in the below code
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
