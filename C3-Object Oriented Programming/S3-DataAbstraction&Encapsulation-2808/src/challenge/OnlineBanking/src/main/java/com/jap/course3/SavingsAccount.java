package com.jap.course3;

public class SavingsAccount
{
    private String accountHolderName;
    private long accountNumber;
    private String accountOpeningDate;
    private String accountStatus;
    private float availableBalance;
    private float totalBalance;
    private boolean internetBankingEnabled;
    private float interestRate;
    private String modeOfOperation;

    public String getAccountHolderName()
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate()
    {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate)
    {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getAccountStatus()
    {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus)
    {
        this.accountStatus = accountStatus;
    }

    public float getAvailableBalance()
    {
        return availableBalance;
    }

    public void setAvailableBalance(float availableBalance)
    {
        this.availableBalance = availableBalance;
    }

    public float getTotalBalance()
    {
        return totalBalance;
    }

    public void setTotalBalance(float totalBalance)
    {
        this.totalBalance = totalBalance;
    }

    public boolean isInternetBankingEnabled()
    {
        return internetBankingEnabled;
    }

    public void setInternetBankingEnabled(boolean internetBankingEnabled)
    {
        this.internetBankingEnabled = internetBankingEnabled;
    }

    public float getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(float interestRate)
    {
        this.interestRate = interestRate;
    }

    public String getModeOfOperation()
    {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation)
    {
        this.modeOfOperation = modeOfOperation;
    }

    public void credit(float creditAmount)
    {
        setAvailableBalance(getAvailableBalance() + creditAmount);
        setTotalBalance(getTotalBalance() + creditAmount);
    }

    public boolean debit(float withdrawalAmount)
    {
        boolean result = false;

        if(withdrawalAmount <= getAvailableBalance() && withdrawalAmount <= getTotalBalance())
        {
            setAvailableBalance(getAvailableBalance() - withdrawalAmount);
            setTotalBalance(getTotalBalance() - withdrawalAmount);

            result = true;
        }
        else
        {
            System.out.println("Insufficient funds. Withdrawal unsuccessful!");
        }

        return result;
    }

    public void displayDetails()
    {
        System.out.printf("A/C No.\t\t\t\t:\t%d\nHolders Name\t\t:\t%s\nOpened On\t\t\t:\t%s\nStatus\t\t\t\t:\t%s\nAvailable Balance\t:\t%.2f\nTotal Balance\t\t:\t%.2f\nInternet Banking\t:\t%s\nInterest Rate\t\t:\t%.2f\nMode of Operation\t:\t%s\n",
                            getAccountNumber(), getAccountHolderName(), getAccountOpeningDate(), getAccountStatus(), getAvailableBalance(), getTotalBalance(), isInternetBankingEnabled(), getInterestRate(), getModeOfOperation());
    }
}
