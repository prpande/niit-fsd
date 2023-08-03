package session;
/*
 * Even Numbers
 * Write a program that displays all even numbers between 1 and 50.
 */
public class EvenNumbers 
{
    public static void main(String[] args)
    {
        int limit = 50;
        for(int i = 1; i <= limit; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
