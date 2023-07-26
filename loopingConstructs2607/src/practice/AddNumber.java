/*
 * Practice 1: Add Number
 * John has to add all the numbers from I to 100. 
 * Help John complete the task using a loop.
 */
public class AddNumber 
{
    public static void main(String[] args)
    {
        int limit = 100;
        int sum = 0;

        for(int i = 1; i <= limit; i++)
        {
            sum += i;
        }

        System.out.format("Sum if numbers till %d is %d\n", limit, sum);
    }
}
