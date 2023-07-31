package session;

/*
 * Program to take 2 numbers, add and multiply them using a function.
 */
public class Calculation 
{
    public int add(int num1, int num2)
    {
        int total = num1 + num2;
        return total;
    }

    public void multiply(int num1, int num2)
    {
        int product = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + product);
    }
    
    public static void main(String[] args)
    {
        int num1 = 10, num2 = 20;
        
        Calculation obj = new Calculation();
        int sum = obj.add(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + sum);

        obj.multiply(num1, num2);
    }
}
