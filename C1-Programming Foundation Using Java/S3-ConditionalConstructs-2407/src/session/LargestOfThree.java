package session;
import java.util.Scanner;
/*
 * Program to show largest of three numbers using ternary operator.
 */
public class LargestOfThree 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Enter 3 numbers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        int larger = num1 > num2 ? num1 : num2;
        int largest = num3 > larger ? num3 : larger;

        System.out.format("Largest of %d, %d and %d is %d\n", num1, num2, num3, largest);

        scanner.close();
    }
}
