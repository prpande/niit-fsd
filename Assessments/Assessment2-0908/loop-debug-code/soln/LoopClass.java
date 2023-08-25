public class LoopClass 
{
    public static void main(String[] args) 
    {
        //1. Use for loop to print numbers from 0 to 10
        System.out.println("FOR loop print");
        int printForLimit = 10;
        for(int i = 0; i <= printForLimit; i++)
        {
            System.out.println(i);
        }

        //2. Use while loop to print even numbers from 0 to 10
        System.out.println("WHILE loop print");
        int printWhileLimit = 10;
        int whilePrintCtr = 0;
        while(whilePrintCtr <= printWhileLimit)
        {
            if( whilePrintCtr % 2 == 0)
            {
                System.out.println(whilePrintCtr);
            }
            whilePrintCtr++;
        }

        System.out.println("Even Sum");
        int sum = 0;
        int lowerLimit = 5;
        int upperLimit = 50;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            //3. Write the conditions to check for even number and add them
            if( i % 2 == 0)
            {
                sum += i;
            }
        }
        System.out.println("Sum is " + sum);


        //4. Fix the code to get factorial of 10 also write what is the error with the code
        System.out.println("Factorial");
        int n = 10;
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial of 10 is " + factorial);



        //5.Write the code to print squares of all the odd numbers upto 'n' where n is 10.
        System.out.println("Squares of Odd numbers");
        int oddSquareLimit = 10;
        for(int i = 1; i <= oddSquareLimit; i++)
        {
            if( i % 2 == 1)
            {
                System.out.println(i * i);
            }
        }

        //6.Use while loop to calculate the sum of odd numbers from 1 to 'n' where n is 100
        System.out.println("Odd sum");
        int oddSumLimit = 100;
        int oddSumCtr = 1;
        int oddSum = 0;
        while(oddSumCtr <= oddSumLimit)
        {
            if(oddSumCtr % 2 == 1)
            {
                oddSum += oddSumCtr;
            }

            oddSumCtr++;
        }

        System.out.println("Odd Sum is " + oddSum);
    }
}
