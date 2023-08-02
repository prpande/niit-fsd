package practice;

import java.util.Scanner;
/*
 * Practice 2: Weighted Average
 * The placement team of an engineering college needs to
 * select eligible candidates for campus placement. To do so
 * they require individual, weighted average scores of the
 * students.
 * Write a program to calculate the weighted average for
 * individual students.
 */
public class WeightedAverage 
{
    public void calculateWeightedAverage()
    {
        Scanner scanner = new Scanner(System.in);

        int assignmentWeight = scanner.nextInt();
        int projectWeight = scanner.nextInt();
        int  quizWeight = scanner.nextInt();
        int midTermWeight = scanner.nextInt();
        int finalExamWeight = scanner.nextInt();

        int assignmentScore = scanner.nextInt();
        int projectScore = scanner.nextInt();
        int quizScore = scanner.nextInt();
        int midTermScore = scanner.nextInt();
        int finalExamScore = scanner.nextInt();

        float assignmentPercentageScore = (assignmentWeight/100.0f) * assignmentScore;
        float projectPercentageScore = (projectWeight/100.0f) * projectScore;
        float quizPercentageScore = (quizWeight/100.0f) * quizScore;
        float midTermPercentageScore = (midTermWeight/100.0f) * midTermScore;
        float finalExamPercentageScore = (finalExamWeight/100.0f) * finalExamScore;

        float overallPercentage = assignmentPercentageScore + projectPercentageScore + quizPercentageScore + midTermPercentageScore + finalExamPercentageScore;

        System.out.println("Weights % Value of score");
        System.out.println("Assignments " + assignmentPercentageScore);
        System.out.println("Projects " + projectPercentageScore);
        System.out.println("Quizzes " + quizPercentageScore);
        System.out.println("Mid term " + midTermPercentageScore);
        System.out.println("Final Exam " + finalExamPercentageScore);
        System.out.println("The weighted average score is " + overallPercentage +"%");

        scanner.close();
    }

    public static void main(String[] args)
    {
        WeightedAverage weightedAverage = new WeightedAverage();
        weightedAverage.calculateWeightedAverage();
    }

}
