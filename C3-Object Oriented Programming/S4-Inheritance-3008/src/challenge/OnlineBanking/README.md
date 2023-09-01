# Challenge: Online Banking

Today, 'Life at your Doorstep' has become a way of life. Performing routine tasks has become quite simple as many companies have started providing services online. Banking services are also majorly online, but to open a bank account, one has to visit a bank in person.\
Many global banks have ventured into the new era of banking. They allow their customers to open a bank account from the comfort of their homes.\
Coast State bank is now providing the facility of opening an account onto its online platform. They provide this service to individuals who are more than 18 years of age. However, not all types of accounts can be opened online.\
Currently, the bank allows customers to only open a
Saving Account.\
Create objects and define constructors for the
Saving Account class.

## Challenge Statement

- The saving account must have some basic attributes like:
  - A 12 digit auto generated account number
  - The account holder's name
  - Account balance
  - Account status
- The customer must be able to perform a withdrawal of cash, check their balance, deposit cash.
- The savings account must be able to debit cash, credit cash, and check balance.

## Tasks

- Create the `BankAccount` class as an abstract class and define common attributes.
- Create child classes for `BankAccount` as `CurrentAccount` and `SavingsAccount`.
- In the `BankAccount` class create a parameterized constructor and assign values to the variables.
- Ensure that the constructors are inherited appropriately in the child classes.
- Write the logic to:
  - Retrieve account balance
  - Debit cash
  - Credit cash
- Create an implementation class `BankAccountImpl` class where the objects of `CurrentAccount` and `SavingsAccount` can be created
- Declare and initialize objects of the `SavingsAccount` class and `CurrentAccount` class in the main method of the `BankAccountImpl` class and call the methods to retrieve balance, debit and credit amount.
