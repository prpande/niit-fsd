package com.bej.searching;

public class Searching {
   public int search(int array[],int searchElement)
    {
        for(int i = 0;i<=array.length;i++)
        {
            if(array[i] == searchElement)
                return i;
        }
        return 0;
    }

}
