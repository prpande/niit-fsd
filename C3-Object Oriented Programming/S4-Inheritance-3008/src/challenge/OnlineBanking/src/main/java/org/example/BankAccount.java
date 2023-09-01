package org.example;

public abstract class BankAccount
{
    // Tags defining account types
    // constants here but should be enums ideally
    static final String CURRENT_ACCOUNT_TYPE = "CurrentAccount";
    static final String SAVINGS_ACCOUNT_TYPE = "SavingsAccount";

    private long accountNumber;
    private String holdersName;
    protected float balance;
    private String status;
    private String accountType;

    public BankAccount(long accountNumber, String holdersName, float balance, String status, String accountType)
    {
        this.accountNumber = accountNumber;
        this.holdersName = holdersName;
        this.balance = balance;
        this.status = status;
        this.accountType = accountType;
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }

    public String getHoldersName()
    {
        return holdersName;
    }

    public float getBalance()
    {
        return balance;
    }

    protected void setBalance(float balance)
    {
        this.balance = balance;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getAccountType()
    {
        return accountType;
    }

    public void creditCash(float depositAmount)
    {
        setBalance(getBalance() + depositAmount);
    }

    @Override
    public String toString()
    {
        return String.format("A/C Number: %s\nHolders Name: %s\nA/C Balance: Rs.%.2f\nStatus: %s\nA/C Type: %s",
                                getAccountNumber(), getHoldersName(), getBalance(), getStatus(), getAccountType());
    }

    public abstract boolean debitCash(float withdrawalAmount);
}
