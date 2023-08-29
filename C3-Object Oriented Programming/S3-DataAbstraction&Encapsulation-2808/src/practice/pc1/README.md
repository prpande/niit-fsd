# Practice 1: Voter Eligibility

An election is a formal group decision-making process by which a population chooses an individual or multiple individuals to hold public office. People vote for eligible
candidates during the election process. The eligible age to vote is 18 and above.\
Write a program that verifies whether an individual is eligible to vote or not.

## Tasks I

- Create a class called `Voter` inside the package
- Declare the `private` attributes `name` and `age` with the appropriate data type in the `Voter` class.
- Declare a static and final variable `VOTER ELIGIBLE AGE` of type `int` with a value `18` .
- Define a no-argument constructor in the `Voter` class.
- Create `public` getter and setter methods for the instance variables `name` and `age`.
- Define a `getAgeCriteria()` method that will return a String according to the conditions provided below:
  - The method must return "`Name + Is Eligible to Vote `" if age >=18.
  - The method must return "`Name + Is Not Eligible to Vote `" if age is between 0 and 18.
  - The method must return "`Age Can't Be Negative or Zero `" if age < 0.
  - Call the getter methods and final static variable to write the logic in the method.

## Tasks II

- Create the implementation class `VoterImpl` inside the package
- Declare and initialize objects of the `Voter` class in the main method of the `VoterImpl` class.
- Call the setter methods to set values to the instance variables.
- Call the `getAgeCriteria()` method to validate if the user is eligible to vote.
- Display the value returned from the `getAgeCriteria()` method inside the main method.

```text
Sample Input: age = 10 and name = "John"
Sample Output: John Is Not Eligible to Vote .
```
