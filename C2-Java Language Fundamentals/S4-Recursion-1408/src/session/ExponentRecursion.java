package session;
import java.util.Scanner;
/*
 * Write a program to implement Math.pow function using recursion.
 */
public class ExponentRecursion 
{
    public long myPow(int base, int exp)
    {
        if(exp < 0)
        {
            return -1;
        }
        
        if(exp == 0)
        {
            return 1;
        }

        return base * myPow(base, exp - 1);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ExponentRecursion obj = new ExponentRecursion();

        System.out.println("Enter the base: ");        
        int base = scanner.nextInt();
        System.out.println("Enter the exponent: ");
        int exp = scanner.nextInt();

        long pow = obj.myPow(base, exp);
        System.out.format("%d ^ %d = %d\n", base, exp, pow);

        scanner.close();
    }
    
}
