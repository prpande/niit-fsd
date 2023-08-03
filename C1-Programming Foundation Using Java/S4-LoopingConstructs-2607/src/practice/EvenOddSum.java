import java.util.Scanner;
/*
 * Practice 3: Sum of Even and Odd
 * Jenny is a teacher She gives an eight-digit number to
 * Bob and wants him to determine whether each digit is
 * even or odd
 * He should display the sum of even and odd digits in 
 * the number.
 */
public class EvenOddSum 
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
            int evenSum = 0;
            int oddSum = 0;
            while(quotient > 0)
            {
                int lastDigit = quotient % 10;
                quotient = quotient /10;

                if(lastDigit % 2 == 0)
                {
                    evenSum += lastDigit;
                }
                else
                {
                    oddSum += lastDigit;
                }
            }

            System.out.println("Sum of even numbers " + evenSum);
            System.out.println("Sum of odd numbers " + oddSum);
        }

        scanner.close();
    }
}
