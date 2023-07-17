# Algorithm and Pseudocode Practice

## Practice 1: Calculate Discount on Total Bill Amount

### Algorithm

- **Step1**: Start
- **Step2**: Accept totalBill
- **Step3**: Check if totalBill is greater than or equal to $500 then calculate discount as 5% of totalBill
- **Step4**: Display calculated discount
- **Step5**: End

### Pseudocode

    BEGIN
        GET totalBill
        SET discount = 0
        IF totalBill >= 500
        BEGIN
            SET discount = 0.05*totalBill                          
        ENDIF
        PRINT discount
    END

## Practice 2: Algorithm to Display Bank Account Balance
  
### Algorithm

- **Step1**: Start
- **Step2**: Accept accountBalance and withdrawlAmount
- **Step3**: Check if accountBalance - withdrawlAmount is less than $100 then tell user that the account is frozen
- **Step5**: End

### Pseudocode

    BEGIN
        GET accountBalance, withdrawlAmount
        IF accountBalance - withdrawlAmount < 100
        BEGIN
            PRINT "Account Balance less than $100. Account frozen!"
        ENDIF
    END
