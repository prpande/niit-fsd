package com.marks;

public class StudentImpl
{
    public static void main(String[] args)
    {
        StudentMarks studentMarks = new StudentMarks();

        int totalMedicalMarks = studentMarks.calculateMarks(65, 70, 75, 85);
        int totalNonMedicalMarks = studentMarks.calculateMarks(75, 85, 80);
        int totalBusinessMarks = studentMarks.calculateMarks(70,80);

        System.out.println("Total Medical Marks: " + totalMedicalMarks);
        System.out.println("Total Non-Medical Marks: " + totalNonMedicalMarks);
        System.out.println("Total Business Marks: " + totalBusinessMarks);
    }
}
