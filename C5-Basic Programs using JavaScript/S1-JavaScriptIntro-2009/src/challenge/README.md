# Challenge

This sprint has 3 Challenges

### Problem Statements

#### Challenge 1 - Check Eligibility

To participate in the contest for beauty pageant of a particular country, an individual has to satisfy the following criteria:

- Should be citizen of that country
- Should be female
- Should be between 18 to 28 years of age
- Should be a winner of state pageant

Write JavaScript program to check the eligibility of the contestant.

Note: Display the messages "Eligible" or "Not Eligible" as per the selection criteria.

The solution for this challenge should be written in `c1-submission.js` file.

The file is located inside the folder `c1-eligibility-check`.

Check your logic using the data given below:

    | Age | Gender | Is Not a Citizen | State Pageant |
    | --- | ------ | ---------------- | ------------- |
    | 23  | Female | True             | New York      |
    | 29  | Female | True             | New Jersey    |
    | 18  | Female | False            | Maryland      |
    | 25  | Male   | True             | Virginia      |
    | 20  | Female | True             |               |

--- 
#### Challenge  2 - Validate Values

Write JavaScript program that performs validations on the given data as per the stated requirements.

Note: Appropriate messages should be displayed for the invalid values identified.

For example: If age is not between 18 and 60, then the message should be "Age should be between 18 and 60".

The solution for this challenge should be written in `c2-submission.js` file.

The file is located inside the folder `c2-validators`.

Refer to the table below to perform validations on the values as stated and to generate output messages for invalid values:

    |    Field                          | Validation Criteria                      | Output for Invalid Values                   
    |---------------------------------- | ---------------------------------------- | --------------------------------------------
    | First Name                        | Value must be defined                    | First Name value must not be undefined 
    | First Name                        | Type should be String                    | First Name value must be of type String 
    | Last Name                         | Type should be String                    | Last Name value must be of type String value
    | Age                               | Value must be defined                    | Age value must not be undefined             
    | Age                               | Type should be Number                    | Age value must be of type Number        
    | Age                               | Value should be between 18 and 60        | Age value should be between 18 and 60   
    | IsMarried                         | Type should be Boolean                   | IsMarried value must be of type Boolean     
    | City                              | Type should be String                    | City value must be of type String           
    | State                             | Type should be California                | State value must be of type String          
    | Postal Code                       | Value must be defined                    | Postal Code value must not be undefined     
    | Postal Code                       | Type should be String                    | Postal Code value must be of type String

Check your logic using the data given below:

    | First Name | Last Name | Age | IsMarried | City     | State      | Postal Code |
    | ---------- | --------- | --- | --------- | -------- | ---------- | ----------- |
    | James      | Smith     | 34  | True      | San Jose | California | CA          |
    | James      | 25        | 34  | True      | San Jose | California | CA          |
    |            | Smith     | 34  | True      | San Jose | California | CA          |
    | James      | Smith     |     | True      | San Jose | California | CA          |
    | James      | Smith     | IO  | True      | San Jose | California | CA          |
    | James      | Smith     | 10  | True      | San Jose | California | CA          |
    | James      | Smith     | 61  | True      | San Jose | California | CA          |
    | James      | Smith     | 34  | Yes       | San Jose | California | CA          |
    | James      | Smith     | 34  | False     | 123      | California | CA          |
    | James      | Smith     | 34  | True      | San Jose | 234        | CA          |
    | James      | Smith     | 34  | Yes       | San Jose | California |             |
    | James      | Smith     | 34  | Yes       | San Jose | California | 21          |
---

### Challenge 3 - Know Your Lucky Number

#### Problem Statement

As per a numerology logic, a person's lucky number is the single digit sum calculated from their birthdate.​

For example, if the birthdate is 05312022, the lucky Number is: ​

    05312022 --> 0 + 5 + 3 + 1 + 2 + 0 + 2 + 2 = 15

    15 --> 1 + 5 = 6​

    the lucky number is **6**.​

Write a JavaScript program that calculates ​the single digit sum for the given date ​value.​

The solution for this challenge should be written in `c3-submission.js` file.

The file is located inside the folder `c3-lucky-number`.

##### Tasks

- Using appropriate JavaScript loop constructs and calculate single digit sum for the date 31st May 2022​
- The date should be stored as string in `mmddyyyy` format.​
- The program should generate following output:

    ```
    Your lucky number is 6​
    ```

### Submission Instructions

This challenge would be manually evaluated.​

Push the code to git and share the link with mentor for manual evaluation.​