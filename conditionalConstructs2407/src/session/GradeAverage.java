package session;
import java.util.Scanner;
/*
 * Program to accept marks in subjects of english, hindi and maths. 
 * Calculate average marks and grade based on it as follows.
 * Average		    Grade
 * >=85		        A
 * >=60 and <85	    B
 * >=45 and <60 	C
 * <45		        D
 */
public class GradeAverage 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int englishScore, hindiScore, mathsScore;

        System.out.println("Enter score in English, Hindi and Maths:");
        englishScore =  scanner.nextInt();
        hindiScore = scanner.nextInt();
        mathsScore = scanner.nextInt();

        float average = (englishScore + hindiScore + mathsScore) / 3.0f;
        System.out.format("Average score is %.2f\n", average);
        if(average >= 85)
        {
            System.out.println("Grade A");
        }
        else if(average >= 60)
        {
            System.out.println("Grade B");
        }
        else if(average >= 45)
        {
            System.out.println("Grade C");            
        }
        else
        {
            System.out.println("Grade D");
        }

        scanner.close();
    }
    
}
