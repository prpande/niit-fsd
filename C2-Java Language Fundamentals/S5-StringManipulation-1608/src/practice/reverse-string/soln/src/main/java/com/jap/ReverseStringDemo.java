package com.jap;

public class ReverseStringDemo 
{
    public static void main(String[] args) 
    {
        //Create a String object.
        String str = "Hello World!";

        //Create an object of the class ReverseStringDemo
        ReverseStringDemo obj = new ReverseStringDemo();

        //Call the method getReverseString() and pass the parameter
        String reverseString = obj.getReverseString(str);
        System.out.println(reverseString);
    }

    //Write the logic to reverse the String  inside the below method and return the reverse String.
    public String getReverseString(String string)
    {
        String reverseStr = "";
        int length = string.length();
        for(int i = length - 1; i >=0 ; i--)
        {
            reverseStr = reverseStr + string.charAt(i);
        }

        return reverseStr;
    }
}
