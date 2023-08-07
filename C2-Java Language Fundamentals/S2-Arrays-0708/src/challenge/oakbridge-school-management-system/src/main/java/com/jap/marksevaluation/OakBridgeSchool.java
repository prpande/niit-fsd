package com.jap.marksevaluation;
public class OakBridgeSchool 
{
    public int[] calculateTotalMarks(int[] math,int[] science,int[] english)
    {
        if(math == null || science == null || english == null ||
            math.length < 1 || science.length < 1 || english.length < 1)
        {
            return null;
        }

        int numOfStudents = math.length;
        int[] totalMarks = new int[numOfStudents];

        for(int i = 0; i < numOfStudents; i++)
        {
            totalMarks[i] = math[i] + science[i] + english[i];
        }
        return totalMarks;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects)
    {
        if(totalMarks == null || totalMarks.length < 1 || noOfSubjects < 1)
        {
            return null;
        }
        
        int numOfStudents = totalMarks.length;
        int[] avgMarks = new int[numOfStudents];

        for(int i = 0; i < numOfStudents; i++)
        {
            avgMarks[i] = totalMarks[i] / noOfSubjects;
        }

        return avgMarks;
    }

    public int calculateAverageScienceMarks (int[] science)
    {
        if(science == null || science.length < 1)
        {
            return -1;
        }

        int numOfStudents = science.length;
        int scienceSum = 0;

        for(int i = 0; i < numOfStudents; i++)
        {
            scienceSum += science[i];
        }

        return (scienceSum / numOfStudents);
    }
    public int calculateAverageEnglishMarks (int[] english)
    {
        if(english == null || english.length < 1)
        {
            return -1;
        }

        int numOfStudents = english.length;
        int englishSum = 0;

        for(int i = 0; i < numOfStudents; i++)
        {
            englishSum += english[i];
        }

        return (englishSum / numOfStudents);
    }
    public int calculateAverageMathMarks (int[] math) 
    {
        if(math == null || math.length < 1)
        {
            return -1;
        }

        int numOfStudents = math.length;
        if(numOfStudents < 1)
        {
            return 0;
        }

        int mathSum = 0;

        for(int i = 0; i < numOfStudents; i++)
        {
            mathSum += math[i];
        }

        return (mathSum / numOfStudents);
    }

    public static void main(String[] args) 
    {
        //Object of OakBridgeSchool class is created
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

        // Initialize the arrays with 10 values of marks for each subject
        int [] math = {15,64,77,9,57,83,49,41,62,88};
        int [] science = {92,20,9,14,12,90,86,4,58,60};
        int [] english = {60,40,99,81,52,16,44,85,9,51};

        // The total number of subjects
        int noOfSubjects = 3;

        // Initialize names of 10 Students
        String[] studentNames = {"Shelby Holland","Ethan Coleman","Nabil Burch","Elinor Hartley","Tatiana Joyce",
                                "Bibi Rivers","Yunus Singleton","Otto Cherry","Amelia Jimenez","Archie Moon"};
        // Initialize roll numbers of 10 Students
        int [] rollNos = {26,23,34,56,79,40,89,64,7,19};

        // Call the methods to calculate total marks and average marks
        int [] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        int [] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks,noOfSubjects);
        
        // Display the marks and average marks of each student
        System.out.println("Roll No.\tName\t\t\tScience\tMaths\tEnglish\tAverage Marks");
        for(int i = 0; i < studentNames.length; i++)
        {
            System.out.format("%d\t\t%s\t\t%d\t%d\t%d\t%d\n", rollNos[i], studentNames[i],
                                science[i], math[i], english[i],
                                averageMarks[i]);
        }

        System.out.println("\n");

        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english);

        // Display the average marks scored by the class in subjects
        System.out.println("Average Science Marks: " + averageScienceMarks);
        System.out.println("Average Maths Marks: " + averageMathMarks);
        System.out.println("Average English Marks: " + averageEnglishMarks);
    }
}
