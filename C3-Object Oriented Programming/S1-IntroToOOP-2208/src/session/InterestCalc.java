package session;
/*
 * Write a program to create a class InterestCalc with three attributes principalAmount,rate and time.
 * Create a method accept() and get details from user.
 * Create a method SimpleInterest() to calculate interest and display total amount.
 */
public class InterestCalc 
{
    float principalAmount;
    float rate;
    float time;

    public void accept(float principal, float interestRate, float durationOfLoan)
    {
        principalAmount = principal;
        rate = interestRate;
        time = durationOfLoan;
    }

    public void simpleInterest()
    {
        float interest = (principalAmount * rate * time) / 100f;
        float totalAmount = principalAmount + interest;

        System.out.println("Simple Interest: " + interest);
        System.out.println("Total amount: " + totalAmount);
    }
    
}
