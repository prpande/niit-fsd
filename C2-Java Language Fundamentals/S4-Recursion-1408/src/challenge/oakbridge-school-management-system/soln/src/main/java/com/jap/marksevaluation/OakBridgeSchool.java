package com.jap.marksevaluation;
public class OakBridgeSchool 
{
    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
        if(math == null || science == null || english == null ||
        math.length < 1 || science.length < 1 || english.length < 1)
        {
            return null;
        }
        
        int noOfStudents = math.length;
        int[] totalMarks = new int[noOfStudents];
        for(int i = 0; i < noOfStudents; i++)
        {
            totalMarks[i] = math[i] + science[i] + english[i];
        }

        return totalMarks;
    }

    // Write the logic to calculate the average marks using recursion
   public double calculateAverageScienceMarks (int[] science,int len)
    {
        return calculateAverageMarksInternal(science, len);
    }

    // Write the logic to calculate the average marks using recursion
    public double calculateAverageEnglishMarks (int[] english,int len)
    {
        return calculateAverageMarksInternal(english, len);
    }

    // Write the logic to calculate the average marks using recursion
    public double calculateAverageMathMarks (int[] math,int len)    
    { 
        return calculateAverageMarksInternal(math,len);  
    }

    public double calculateAverageMarksInternal (int[] marks, int len)
    {
        if(marks == null || marks.length < 1)
        {
            return 0.0;
        }
        else if(len == 1)
        {
            return marks[len - 1];
        }
        else
        {
            double internalAvg = calculateAverageMarksInternal(marks, len - 1);
            double average = (double)(marks[len - 1] + internalAvg * (len - 1)) / len;
            return average;
        }
    }

    //Write the logic to find the top score in the class using recursion
    public int findTopScore(int [] totalMarks,int len)
    {
        if(totalMarks == null || totalMarks.length < 1)
        {
            return -1;
        }
        else if(len == 1)
        {
            return totalMarks[0];
        }
        else
        {
            int lastScore = totalMarks[len - 1];
            int internalScoreMax = findTopScore(totalMarks, len - 1);

            if(lastScore > internalScoreMax)
            {
                return lastScore;
            }
            else
            {
                return internalScoreMax;
            }
        }
    }

    public static void main(String[] args) 
    {
        // Initialize the OakBridgeSchool class object
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

        // Declare and Initialize values to the arrays to store marks of math, science, english
        int [] math = {15,64,77,9,57,83,49,41,62,88};
        int [] science = {92,20,9,14,12,90,86,4,58,60};
        int [] english = {60,40,99,81,52,16,44,85,9,51};
        int noOfStudents = math.length;

        // Call the appropriate methods and display the output
        int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math, science, english);

        int topScore = oakBridgeSchool.findTopScore(totalMarks, noOfStudents);
        System.out.println("Top score is: " + topScore);
    }
}
