package com.jap;
public class MaxAge 
{
    // Write the logic to calculate the maximum age from the given array
    //inside the below method and return the calculated maximum age.
    public int getMaxAge(int [] age)
    {
        int maxAge = age[0];

        for(int i = 1; i < age.length; i++)
        {
            if(age[i] > maxAge)
            {
                maxAge = age[i];
            }
        }

        return maxAge;
    }

    public static void main(String[] args) 
    {
        //Declare and initialize values to the age array.
        int age[] = {23,34,33,24,25,26,31};

        //Create an object of the class MaxAge
        MaxAge obj = new MaxAge();

        //Call the method getMaxAge and pass the parameter
        int maxAge = obj.getMaxAge(age);
        System.out.println("Max Age - " + maxAge);
    }
}
