package org.example;

public class CurrentAccount extends BankAccount
{
    private float overdrawLimit;
    private float overdrawUsed;
    public CurrentAccount(long accountNumber, String holdersName, float balance, String status,
                          float overdrawLimit)
    {
        super(accountNumber, holdersName, balance, status, BankAccount.CURRENT_ACCOUNT_TYPE);
        this.overdrawLimit = overdrawLimit;
        this.overdrawUsed = 0;
    }

    public float getOverdrawLimit()
    {
        return overdrawLimit;
    }

    public void setOverdrawLimit(float overdrawLimit)
    {
        this.overdrawLimit = overdrawLimit;
    }

    public float getOverdrawUsed()
    {
        return overdrawUsed;
    }

    @Override
    public boolean debitCash(float withdrawalAmount)
    {
        boolean result = false;

        if(withdrawalAmount <= getBalance())
        {
            setBalance(getBalance() - withdrawalAmount);
            result = true;
        }
        else if (withdrawalAmount <= (getBalance() + (getOverdrawLimit() - getOverdrawUsed())))
        {
            overdrawUsed = withdrawalAmount - getBalance();
            setBalance(0f);
            System.out.println("Overdraw quota used. Withdrawal successful!");
            result = true;
        }
        else
        {
            System.out.println("Insufficient funds. Withdrawal unsuccessful!");
        }

        return result;
    }

    @Override
    public void creditCash(float depositAmount)
    {
        overdrawUsed = overdrawUsed - depositAmount;
        if(overdrawUsed < 0)
        {
            float balanceCredit = -overdrawUsed;
            overdrawUsed = 0f;
            super.creditCash(balanceCredit);
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s\nOverdraw Used: Rs.%.2f\nOverdraw Limit: Rs.%.2f",
                                super.toString(), getOverdrawUsed(), getOverdrawLimit());
    }
}
