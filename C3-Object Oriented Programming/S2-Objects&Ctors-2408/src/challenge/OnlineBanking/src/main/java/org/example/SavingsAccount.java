package org.example;

public class SavingsAccount
{
    long accountNumber;
    String holderName;
    float balance;
    String status;

    public SavingsAccount(long accountNumber,
                          String holderName,
                          float balance,
                          String status)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.status = status;
    }

    public float getBalance()
    {
        return balance;
    }

    public void creditCash(float depositAmount)
    {
        balance = balance + depositAmount;
    }

    public boolean debitCash(float withdrawalAmount)
    {
        if( balance >= withdrawalAmount)
        {
            balance = balance - withdrawalAmount;
            return true;
        }
        else
        {
            System.out.println("Insufficient balance! Withdrawal unsuccessful.");
            return false;
        }
    }
}
