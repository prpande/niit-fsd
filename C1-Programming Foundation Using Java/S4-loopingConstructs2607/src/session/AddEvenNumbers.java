package session;
import java.util.Scanner;
/*
 * Add the Even Numbers
 * Write a program to add the even numbers till the given input
 * number.
 * Use the scanner to take the input from the user.
 */
public class AddEvenNumbers 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int limit = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for(int i = 1; i <= limit; i++)
        {
            if(i % 2 == 0)
            {
                sum += i;
            }
        }

        System.out.format("Sum of even numbers till %d: %d\n", limit, sum);
        scanner.close();
    }
}
