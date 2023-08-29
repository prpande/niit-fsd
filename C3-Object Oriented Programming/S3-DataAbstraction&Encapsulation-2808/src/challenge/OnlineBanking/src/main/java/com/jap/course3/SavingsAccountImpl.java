package com.jap.course3;

public class SavingsAccountImpl
{
    public static void main(String[] args)
    {
        SavingsAccount account1 = new SavingsAccount();

        account1.setAccountNumber(102030456789L);
        account1.setAccountHolderName("John Doe");
        account1.setAccountOpeningDate("28/8/2023");
        account1.setAccountStatus("Active");
        account1.setAvailableBalance(1000.0f);
        account1.setTotalBalance(2000.0f);
        account1.setInternetBankingEnabled(true);
        account1.setInterestRate(3.5f);
        account1.setModeOfOperation("Single");

        account1.displayDetails();
        System.out.println("");

        account1.debit(200.0f);
        account1.displayDetails();
        System.out.println("");

        account1.debit(2100.0f);
        account1.displayDetails();
        System.out.println("");

        account1.credit(500.0f);
        account1.displayDetails();
        System.out.println("");
    }
}
