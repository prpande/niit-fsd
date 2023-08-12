package com.jap;

public class ReverseArrayDemo 
{

    public static void main(String[] args) 
    {
        //Declare and initialize values of an array.
        int[] array = {23,34,43,56,67,78,43,35};

        //Create an object of the class ReverseArrayDemo.
        ReverseArrayDemo obj = new ReverseArrayDemo();

        //Call the method getReverseArray and pass the array as parameter
        int[] revArray = obj.getReverseArray(array);

        for(int i = 0; i < revArray.length; i++)
        {
            System.out.println(revArray[i]);
        }
    }

    //Write the logic to reverse the given array inside the below
    // method and return the reverse array.
    public int[] getReverseArray(int [] array)
    {
        int length = array.length;
        int[] reverseArray = new int[length];

        for(int i = 0; i < length; i++)
        {
            reverseArray[i] = array[length - 1 -i];
        }

        return reverseArray;
    }
}
