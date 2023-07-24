package session;
import java.util.Scanner;

/*
 * Eligible to Donate Blood
 * Write a program creating two variables: one with age and the other with weight.
 * If age is 18 years or then Check the weight.
 * If the weight is between 50 to 70 then print 
 * "You are eligible to donate blood."
 * If any of the criteria are false, then display the message saying, 
 * "You are not eligible to donate blood."
 */
public class DonateBlood 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int age, weight;

        System.out.println("Enter age:");
        age = obj.nextInt();
        System.out.println("Enter weight:");
        weight = obj.nextInt();

        if( age >= 18 && (weight <=70 && weight >=50))
        {
            System.out.println("ou are eligible to donate blood.");
        }
        else
        {
            System.out.println("ou are NOT eligible to donate blood.");
        }

        obj.close();
     }
}
