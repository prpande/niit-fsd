# Assessment Quiz (Part II) Course 1 -  Sprint 3 - Implement Conditional Constructs

## Question 1

Write the expression in the comment statement that will give following output.

```text
    Smallest number is 100
```

```java
    public class Demo 
    { 
 
 
        public static void main(String[] args) 
        { 
            int number1 = 100; 
            int number2 = 200; 
            int result =0; 

            //code goes here for ternary operator 
            System.out.println("Smallest number is " + result); 
        } 
    } 
```

## Question 2

Write Switch –case code for the following if conditions.

```java
    class IfElseDemo 
    { 
        public static void main(String s[]) 
        { 
            int number = 10; 
            
            if(number == 5) 
            { 
                System.out.println("Number is five"); 
            } 
            if(number == 10) 
            { 
                System.out.println("Number is Ten"); 
            } 
            if(number == 15) 
            { 
                System.out.println("Number is fifteen"); 
            } 
        } 
    }
```

## Question 3

Rewrite the following program code using suitable ‘if-else’ condition

```java
    switch(number1)
    { 
        case 0: 
            number2=number2+2; 
            System.out.println(“number2=” + number2); 
            break; 
        case 1: 
            number2=number2+4; 
            System.out.println(“number2=” + number2); 
            break; 
        case 2: 
            number2=number2+6; 
            System.out.println(“number2=” + number2); 
            break; 
    } 
```

## Question 4

Modify the below program to get the output as shown below.

```java
    public class IncomeCalculator 
    { 
        public void main(String[] args) 
        { 
            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the Income of Employee per day: "); 
            // fill in the missing code here        
            System.out.println("Enter the Fine Amount for days absent: "); 
            // fill in the missing code here 
            int salary = 25 * incomeOfEmployee; 
            int fine = 5 * fineAmnt; 
            System.out.println("The Salary of the Employee after paying the fine: "); 
        } 
    } 
```

Output

```text
    Enter the Income of Employee per day:  
    350 
    Enter the Fine Amount for days absent:  
    30 
    The Salary of the Employee after paying the fine: 8600 
```

## Question 5

Write the expression in the if statement that will print "100 is even number"

```java
    public class Demo 
    { 
        public static void main(String[] args) 
        { 
            int number = 100;  
            if(/*code goes here*/)
            { 
                System.out.println("100 is even number"); 
            } 
            System.out.println("100 is odd number"); 
        } 
    }
```

## Question 6

Identify the error in the program and modify the code.

```java
    public class TeamScore 
    { 
        public static void main(String[] args) 
        { 
            // Give appropriate declarations 
            int score1; 
            int score2; 
            int score3; 

            String winner = score1 > score2 ? (score1 > score3 ? "Team 1 is the winner" : "Team 2 is the winner") 
                    : (score2 > score3 ? "Team 2 is the winner" : "Team 3 is the winner");  

            System.out.println(winner);   

        } 
    } 
```
  
## Question 7

Identify and rectify the error in the below code snippet.

```java
    public static void main(String[] args) 
    {
        int num1 = 30;
        int num2 = 20;

        boolean result=(num1>num2) ? (num1+num2):(num1-num2);

        System.out.println(result);
    }
```

## Question 8

Predict the output of the below program.

```java
    public class Vowels 
    {
        public static void main(String[] args) 
        {
            char ch = 'x';
            switch(ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'I':
                case 'O':
                case 'E':
                case 'U':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        }
    }
```

## Question 9

Are the below comparisons valid? Give reasons why they are valid or invalid.

```java
    public static void main(String[] args) 
    {
        // Initializing variables
        int number1 = 23;
        int number2 = 33;
        float number3 = 33.0f;
        // Compare the values using relational operators
        System.out.println("number3 == number1 "
        + (number3 == number1));
        System.out.println("number2== number1 "
        + (number2 == number1));
        System.out.println("number2 == number3 "
        + (number2 == number3));
        System.out.println("number3 == number2 "
        + (number3 == number2));
    }
```

## Question  10

Modify the errors in the given code below and write valid declarations.

```java
    public class Declaration 
    { 
        public static void main(String[] args) 
        { 
            int intNum = 23; 
            int longNum = 25888L; 
            short shNum = 4555s; 
            float flNum = 65.66; 
            double dlNum = 8999595.78D;              
        } 
    }
```

## Question  11

Write appropriate declarations for the below.

```text
    Declare a long variable with value 100000
    Declare a double variable with value 3435343.78
    Declare a short variable with value 11
    Declare a floating point variable with value 673.56
```

## Question 12

Find the errors in the below program and rectify them

```java
    class Name 
    {
        public void main(String args) 
        {
            System.out.println("Welcome to Programming in Java");
            Scanner sc = new Scanner(System.out);
            System.out.println("Enter You Name :: ")
            String name = sc.nextInt();
        }
    }
```

## Question 13

Write code as per the comments given, store the value in variable result and print the its value.  

```java
    public class App  
    { 
        public static void main(String[] args) 
        { 
            int number1 = 100; 
            float number2 = 200.98f; 
            int number3=300; 
    
            if(number1<number2)
            { 
                if(number2<number3)
                { 
                    //add number1 and number2 and store it in result. 
                } 
                else if(number2>number3)
                { 
                    //add number2 and number3 and store it in result. 
                } 
            } 
        } 
    } 
```

## Question 14

For the comments provided, create the following if-else condition expression.

```text
    If statements should determine if number1 is less than number2 and number2 is less than number3.
    One if statement should contain the entire condition.
    And the final output will be "Increasing order"
```

```java
    public class Example 
    { 
        public static void main(String[] args) 
        { 
            int number1 = 100, number2 = 200, number3 = 300; 
            // enter if condition here 
            { 
                System.out.println("Increasing order"); 
            } 
            // enter if condition here 
            { 
                System.out.println("Decreasing order"); 
            } 
            else 
            { 
                System.out.println("Neither increasing or decreasing order"); 
            } 
        } 
    } 
```

## Question 15

The following code snippet contains compile time errors, rectify them.

```java
    public class Demo  
    { 
        public static void main (String [] args)   
        { 
            float name = "John"; 
            String data = 10001; 
            int price = 1234.56f;
        } 
    } 
```
