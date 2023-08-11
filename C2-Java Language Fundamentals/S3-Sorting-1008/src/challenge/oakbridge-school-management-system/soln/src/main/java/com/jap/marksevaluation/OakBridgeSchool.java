package com.jap.marksevaluation;
public class OakBridgeSchool {

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

   // Write the logic inside the method to calculate the grade based on the math mark of the student
    public char findGradeInMath(int math)
    {
        char mathGrade = findGradeInternal(math);
        return mathGrade;
    }

    // Write the logic inside the method to calculate the grade based on the science mark of the student
    public char findGradeInScience(int science)
    {
        char scienceGrade = findGradeInternal(science);
        return scienceGrade;
    }

    // Write the logic inside the method to calculate the grade based on the english mark of the student
    public char findGradeInEnglish(int english)
    {
        char englishGrade = findGradeInternal(english);
        return englishGrade;
    }

    public char findGradeInternal(int marks)
    {
        char grade = '\u0000';

        if(marks >= 90)
        {
            grade = 'A';
        }
        else if(marks >= 80)
        {
            grade = 'B';
        }
        else if(marks >= 70)
        {
            grade = 'C';
        }
        else if(marks >= 60)
        {
            grade = 'D';
        }
        else 
        {
            grade = 'F';
        }

        return grade;
    }

    // Write the logic to sort the total marks of the students of the class, use insertion-sort
    public int[] sortByTotalMarks(int[] totalMarks)
    {
        int noOfStudents = totalMarks.length;
        int[] sortedTotalMarks = new int[noOfStudents];
        for(int i = 0; i < noOfStudents; i++)
        {
            sortedTotalMarks[i] = totalMarks[i];
        }

        for(int i = 1; i < noOfStudents; i++)
        {
            int j = i - 1;
            int key = sortedTotalMarks[i];
            while(j >= 0 && sortedTotalMarks[j] > key)
            {
                sortedTotalMarks[j + 1] = sortedTotalMarks[j];
                j = j - 1;
            }

            sortedTotalMarks[j + 1] = key;
        }
        return sortedTotalMarks;

    }

    //Display the details of the student
    public void displayDetails(int totalMark, int averageMark, char mathGrade, char scienceGrade, char englishGrade,String studentName, int rollNo )
    {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Student Name\t\t\tRoll Number");
        System.out.println("-------------------------------------------------------------------");
        System.out.format("%s\t\t\t%d\n", studentName, rollNo);
        System.out.println("The total marks scored\t: " + totalMark);
        System.out.println("The average marks scored\t: " + averageMark);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Grade in Math\t\t: " + mathGrade);
        System.out.println("Grade in Science\t\t: " + scienceGrade);
        System.out.println("Grade in English\t\t: " + englishGrade);
        System.out.println("-------------------------------------------------------------------");
    }

    public void displaySortedMarks(int[] totalMarks)
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Report");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("The total marks of the class in sorted order");

        for(int i = 0; i < totalMarks.length; i++)
        {
            System.out.println(totalMarks[i]);
        }
    }

    public static void main(String[] args) 
    {

        // Declare and Initialize the object of OakBridgeSchool
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

        // Declare and Initialize values to the arrays to store marks of math, science, english
        int [] math = {15,64,77,9,57,83,49,41,62,88};
        int [] science = {92,20,9,14,12,90,86,4,58,60};
        int [] english = {60,40,99,81,52,16,44,85,9,51};
        int noOfSubjects = 3;


        // Declare and Initialize a string array for storing student names
        String[] studentNames = {"Shelby","Ethan","Noah","Ernie","Tom",
                                "James","Andrea","Otto","Amelia","Archie"};

        // Declare and Initialize an int array for storing roll numbers
        int [] rollNos = {26,23,34,56,79,40,89,64,7,19};

        // Call the appropriate methods and display the results
        int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math, science, english);
        int[] totalAverageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks, 3);

        int noOfStudents = studentNames.length;
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Grading And Evaluation");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for(int i = 0 ; i < noOfStudents; i++)
        {
            char mathGrade = oakBridgeSchool.findGradeInMath(math[i]);
            char scienceGrade = oakBridgeSchool.findGradeInScience(science[i]);
            char englishGrade = oakBridgeSchool.findGradeInEnglish(english[i]);
            oakBridgeSchool.displayDetails(totalMarks[i], totalAverageMarks[i], mathGrade, scienceGrade, englishGrade, studentNames[i], rollNos[i]);
        }

        int[] sortedTotalMarks = oakBridgeSchool.sortByTotalMarks(totalMarks);
        oakBridgeSchool.displaySortedMarks(sortedTotalMarks);
    }
}
