## Challenge - Enable Testing for a Given JavaScript Code

### Context

Creative IT Solutions have developed an application for MovieZone cinemas that allows the customers to book tickets and snacks online.​

The application code contains JavaScript functions that calculate the total amount that the customers will have to pay, based on the number and type of tickets booked as well as the number of snacks combo ordered.​

The development team now wants to enable automated unit testing to test the functions defined in the solution to ensure that the code meets the stated requirements and is bug free.​

In addition to the test cases created as per the stated requirements, the team also needs to identify a few more test cases to ensure that the functions process only the valid inputs and return error messages for the invalid inputs.​

The developer team will have to refactor the code for these additional test cases, and provide error handling solutions that satisfy the test criteria.

### About the Given Code

The table given below provides details of functions defined in the given code:

|Function Name|Objective|Valid Inputs|
|-------------|---------|----------|
|getPerTicketPriceBySeatType|Accepts 1 string value as seat type and returns ticket price for one seat based on the seat type value|"Silver" / "Gold" / "Platinum"
|getPerComboPrice|Accepts 1 string value as combo type and returns price for one combo based on the combo type value|"Combo-1" / "Combo-2" / "Combo-3"
|calculateTotalTicketAmount|Accepts 1 string value as seat type and 1 number value as ticket count and returns total ticket amount|Seat Type should be "Silver" / "Gold" / "Platinum", Ticket Count should be Greater Than Zero
|calculateTotalComboAmount|Accepts 1 string value as combo type and 1 number value as combo count and returns total combo amount|Combo Type should be "Combo-1" / "Combo-2" / "Combo-3", Combo Count should be Greater Than Zero
|calculateTotalBillAmount|Accepts 1 string value as seat type, 1 number value as ticket count, 1 string value as combo type and 1 number value as combo count and returns total bill amount|Seat Type should be "Silver" / "Gold" / "Platinum", Ticket Count should be Greater Than Zero, Combo Type should be "Combo-1" / "Combo-2" / "Combo-3", Combo Count should be Greater Than Zero

### Price Details

- The table given below provides price details of different seat types at MovieZone cinemas:​

|Seat Type|Per Ticket Price (USD)|
|-------------|---------
|Silver|5.00|
|Gold|6.00|
|Platinum|8.00|​

- The table given below provides price details of different combos offered by MovieZone cinemas:

|Combo Type|Per Combo Price (USD)|
|-------------|---------
|Combo-1|2.50|
|Combo-2|4.50|
|Combo-3|8.50|​

### Problem Statement

Write unit test cases to test the functions in the given code for calculating total bill amount.

The test cases should test whether 
- the desired functions exist
- the functions return expected value for the valid inputs provided
- the functions return expected error message for the invalid inputs provided    

Refactor the code to ensure that the test cases written to test functions for invalid inputs pass.

#### Task 1 - Write Test Code for the Existing Code

The table given below lists down the test specifications for testing functions in the solution code:

|Function to Test|Test Criteria|
|----------------|-------------|
|getPerTicketPriceBySeatType()|Function should exist|
|getPerComboPrice()|Function should exist|
|calculateTotalTicketAmount()|Function should exist|
|calculateTotalComboAmount()|Function should exist|
|calculateTotalBillAmount()|Function should exist|
|getPerTicketPriceBySeatType()|Function should return price for Combo-1
|getPerComboPrice()|Function should return  per ticket price for Gold seat
|calculateTotalTicketAmount()|should return total ticket amount for 2 Silver seats
|calculateTotalComboAmount()|should return total amount for 3 Combo-2
|calculateTotalBillAmount()|should return total booking amount for 2 Platinum seats and 1 Combo-3

#### Task 2 – Write Test Code and Refactor Code to Handle Errors

The table given below lists down the specifications for testing these functions to ensure they return appropriate error messages when they are provided with invalid inputs:

|Function to Test|Test Criteria|
|----------------|-------------|
|getPerTicketPriceBySeatType()|Function should return error message `Invalid Seat Type` for invalid seat type value|
|getPerComboPrice()|Function should return error message `Invalid Combo Type` for invalid combo type value|
|calculateTotalTicketAmount()|Function should return error message if ticket count is zero|
|calculateTotalTicketAmount()|Function should return error message if seat type is invalid|
|calculateTotalComboAmount()|Function should return error message if combo count is zero|
|calculateTotalComboAmount()|Function should return error message if combo type is invalid|
|calculateTotalBillAmount()|Function should return error message if ticket count is negative|
|calculateTotalBillAmount()|Function should return error message if combo count is negative|

Refactor the solution code to ensure the above listed test cases pass.

### Submission Instructions

1. This challenge would be manually evaluated.​
2. Push the code to git and share the link with mentor for manual evaluation.