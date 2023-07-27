import java.util.Scanner;
/*
 * Practice 2: Reverse Digits
 * Ron and Steve are playing a reverse number
 * game where one has to give an integer to the other.
 * The other person receiving the integer needs to reverse
 * the number and display the output.
 * If any one of them fails to reverse the number, the game ends.
 * Write a Java program to reverse the number, store the
 * reversed number in a variable, and print it.
 */
public class ReverseDigit 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number;

        number = scanner.nextInt();

        if(number < 0)
        {
            System.out.println("Input number cannot be negative.");
        }
        else if(number == 0)
        {
            System.out.println("Input number cannot be zero.");
        }
        else
        {
            int quotient = number;
            int reverseNumber = 0;
            while(quotient > 0)
            {
                int lastDigit = quotient % 10;
                reverseNumber = reverseNumber * 10 + lastDigit;
                quotient = quotient /10;
            }

            System.out.println("The reverse of the given number is: " + reverseNumber);
        }
        
        scanner.close();
    }
}
