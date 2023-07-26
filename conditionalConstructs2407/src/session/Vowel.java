package session;
import java.util.Scanner;
/*
 * Program to accept an alphabet and show whether it is vowel or not.
 */
public class Vowel 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char inputChar;

        System.out.println("Enter a character:");
        // To take a character input, pick the first character in the string in the input stream
        inputChar = scanner.next().charAt(0); 
        
        switch(inputChar)
        {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.format("Character %c is a vowel.", inputChar);
                break;
            default:
                System.out.format("Character %c is not a vowel.", inputChar);
        }

        scanner.close();
    }
}
