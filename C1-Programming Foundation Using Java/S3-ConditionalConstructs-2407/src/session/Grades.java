package session;
import java.util.Scanner;

/*
 * Digit Number
 * Write a program that assigns a grade based on the value of a test score.
 * Grade A for scoring 90 or above.
 * Grade B for scoring 80 or above.
 * Grade C for scoring 70 or above.
 * Take the input of the score from the user using the Scanner.
 */

public class Grades 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int score;
        
        System.out.println("Enter test score:");
        score = sc.nextInt();

        if(score >= 90)
        {
            System.out.println("Grade A");
        }
        else if(score >= 80)
        {
            System.out.println("Grade B");
        }
        else if(score >= 70)
        {
            System.out.println("Grade c");
        }
        else
        {
            System.out.println("Score less than 70!");
        }

        sc.close();
    }
}
