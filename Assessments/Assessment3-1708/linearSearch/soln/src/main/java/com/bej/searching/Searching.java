package com.bej.searching;

public class Searching {
   public int search(int array[],int searchElement)
    {
        int foundIndex = -1;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == searchElement)
            {
                foundIndex = i;
                break;
            }
        }

        return foundIndex;
    }

}
