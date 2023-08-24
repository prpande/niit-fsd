package org.example;

public class SavingsAccountImpl
{
    public static void main(String[] args)
    {
        SavingsAccount savingsAccount = new SavingsAccount(10203040506789L,
                                                            "John Doe",
                                                            1500.0f,
                                                            "Active");

        float balance = savingsAccount.getBalance();
        System.out.printf("Initial Balance: %.2f\n", balance);
        boolean check = savingsAccount.debitCash(500.0f);
        balance = savingsAccount.getBalance();
        System.out.printf("Balance: %.2f\n", balance);
        check = savingsAccount.debitCash(1500.0f);
        balance = savingsAccount.getBalance();
        System.out.printf("Balance: %.2f\n", balance);
        savingsAccount.creditCash(500.0f);
        balance = savingsAccount.getBalance();
        System.out.printf("Balance: %.2f\n", balance);
    }
}