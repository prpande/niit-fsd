package org.example;

public class BankAccountImpl
{
    public static void main(String[] args)
    {
        SavingsAccount savingsAccount = new SavingsAccount(102030456789L,
                                                        "John Doe",
                                                        5000.0f,
                                                        "Active",
                                                        3.5f);

        CurrentAccount currentAccount = new CurrentAccount(202030456788L,
                                                            "Jill Doe",
                                                            5000.0f,
                                                            "Active",
                                                            1000f);
        System.out.println("Initial Status");
        System.out.println(savingsAccount.toString());
        System.out.println("");
        System.out.println(currentAccount.toString());
        System.out.println("");

        float debit = 2000f;
        System.out.println("Debit Rs." + debit + " Status");
        savingsAccount.debitCash(debit);
        System.out.println(savingsAccount.toString());
        System.out.println("");
        currentAccount.debitCash(debit);
        System.out.println(currentAccount.toString());
        System.out.println("");

        debit = 1000f;
        System.out.println("Debit Rs." + debit + " Status");
        savingsAccount.debitCash(debit);
        System.out.println(savingsAccount.toString());
        System.out.println("");
        currentAccount.debitCash(debit);
        System.out.println(currentAccount.toString());
        System.out.println("");

        debit = 2500f;
        System.out.println("Debit Rs." + debit + " Status");
        savingsAccount.debitCash(debit);
        System.out.println(savingsAccount.toString());
        System.out.println("");
        currentAccount.debitCash(debit);
        System.out.println(currentAccount.toString());
        System.out.println("");

        debit = 1000f;
        System.out.println("Debit Rs." + debit + " Status");
        savingsAccount.debitCash(debit);
        System.out.println(savingsAccount.toString());
        System.out.println("");
        currentAccount.debitCash(debit);
        System.out.println(currentAccount.toString());
        System.out.println("");

        float credit = 1000f;
        System.out.println("Credit Rs." + credit + " Status");
        savingsAccount.creditCash(credit);
        System.out.println(savingsAccount.toString());
        System.out.println("");
        currentAccount.creditCash(credit);
        System.out.println(currentAccount.toString());
        System.out.println("");
    }
}
