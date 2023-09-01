package org.example;

public class SavingsAccount extends BankAccount
{
    final static int DAILY_TRANSACTION_LIMIT = 10;
    private float rateOfInterest;
    private int dailyTransactionCount;

    public SavingsAccount(long accountNumber, String holdersName, float balance, String status,
                          float rateOfInterest)
    {
        super(accountNumber, holdersName, balance, status, BankAccount.SAVINGS_ACCOUNT_TYPE);
        this.rateOfInterest = rateOfInterest;
        this.dailyTransactionCount = 0;
    }

    public float getRateOfInterest()
    {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest)
    {
        this.rateOfInterest = rateOfInterest;
    }

    public int getDailyTransactionCount()
    {
        return dailyTransactionCount;
    }

    @Override
    public boolean debitCash(float withdrawalAmount)
    {
        boolean result = false;

        if(withdrawalAmount <= getBalance())
        {
            if(dailyTransactionCount <= DAILY_TRANSACTION_LIMIT)
            {
                setBalance(getBalance() - withdrawalAmount);
                dailyTransactionCount++;
                result = true;
            }
            else
            {
                System.out.println("Daily transaction limit reached. Withdrawal unsuccessful!");
            }
        }
        else
        {
            System.out.println("Insufficient funds. Withdrawal unsuccessful!");
        }

        return result;
    }

    public void resetDailyTransactionCount()
    {
        dailyTransactionCount = 0;
    }

    @Override
    public String toString()
    {
        return String.format("%s\nRate of Interest: %.2f%%\nDaily Transaction Count: %d",
                                super.toString(), getRateOfInterest(), getDailyTransactionCount());
    }
}
