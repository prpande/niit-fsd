package session;
import java.util.Scanner;
/*
 * Program to accept month number and display the season as per the table below:
 * 	Month               Season
 * 	11 or 12 or 1		Winter
 * 	2 or 3 or 4			Spring
 * 	5 or 6 or 7			Summer
 * 	8 or 9 or 10		Autumn
 *  Implement using if-else-if ladder and switch
 */
public class Season 
{
    public static void seasonWithIfElseIf()
    {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        System.out.println("Enter the month number:");
        monthNumber = scanner.nextInt();
        
        if(monthNumber == 11 || monthNumber == 12 || monthNumber == 1)
        {
            System.out.format("The season for month number %d is Winter\n", monthNumber);
        }
        else if(monthNumber >= 2 && monthNumber <= 4)
        {
            System.out.format("The season for month number %d is Spring\n", monthNumber);
        }
        else if(monthNumber >= 5 && monthNumber <= 7)
        {
            System.out.format("The season for month number %d is Summer\n", monthNumber);
        }
        else if(monthNumber >= 8 && monthNumber <= 10)
        {
            System.out.format("The season for month number %d is Autumn\n", monthNumber);
        }
        else
        {
            System.out.format("Invalid month number %d\n", monthNumber);
        }

        //scanner.close(); 
        // Commenting out the close as it leads to the stream being closed 
        // and causing error in the nextInt called in the next function.
        // https://stackoverflow.com/questions/65503259/should-a-scanner-only-be-instantiated-only-once-if-thats-the-case-why-so
    }

    public static void seasonWithSwitch()
    {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        System.out.println("Enter the month number:");
        monthNumber = scanner.nextInt();

        switch(monthNumber)
        {
            case 1:
            case 11:
            case 12:
                System.out.format("The season for month number %d is Winter\n", monthNumber);
                break;
            case 2:
            case 3:
            case 4:
                System.out.format("The season for month number %d is Spring\n", monthNumber);
                break;
            case 5:
            case 6:
            case 7:
                System.out.format("The season for month number %d is Summer\n", monthNumber);
                break;
            case 8:
            case 9:
            case 10:
                System.out.format("The season for month number %d is Autumn\n", monthNumber);
                break;
            default:
                System.out.format("Invalid month number %d\n", monthNumber);
        }

        scanner.close();
    }

    public static void main(String[] args)
    {
        seasonWithIfElseIf();
        seasonWithSwitch();
    }
    
}
