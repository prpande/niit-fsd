package session;
import java.util.Scanner;
/*
 * Program to accept any number and show whether it is one digit or 2 digit or three digit number else above than that
 */
public class NumberDigits 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a number:");
        number = scanner.nextInt();

        if (number > 999)
        {
            System.out.format("Number %d is 4 digit or more.", number);
        }
        else if (number > 99)
        {
            System.out.format("Number %d has 3 digits.", number);
        }
        else if (number > 9)
        {
            System.out.format("Number %d has 2 digits.", number);
        }
        else if (number > 0)
        {
            System.out.format("Number %d has 1 digit.", number);
        }
        else
        {
            System.out.format("Number %d is negative.", number);
        }

        scanner.close();
    }    
}
