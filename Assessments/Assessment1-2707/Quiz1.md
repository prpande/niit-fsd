# Assessment Quiz (Part I) : Course 1 -  Sprint 3 - Implement Conditional Constructs

## Question 1

```java
    public class Test
    {
        public static void main(String[] args)
        {
            int number1 = 23, number2 = 30;

            if(number1> 20 && number2 > 25)
                System.out.println("1");
            if(number1 > 30 && number2 < 35)
                System.out.println("2");
            else
                System.out.println("3");
        }
    }
```

- 1
- 2
- 3
- [x] 1, 3

## Question 2

```java
    public class Test 
    {
        public static void main(String[] args) 
        {
            boolean flag = false;
            if (flag)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
```

- true
- [x] false
- compilation error

## Question 3

```java
    public class Test 
    {
        public static void main(String[] args) 
        {
            int intNumber = 1;
            switch (intNumber) 
            {
                case 1:
                    System.out.print(" 1 matched");
                case 2:
                    System.out.print(" 2 matched");
                    break;
                default:
                    System.out.println(" There is no match");
            }
        }
    }
```

- 1 matched
- 2 matched
- [x] 1 matched 2 matched
- There is no match

## Question 4

How do you run a file called HelloWorld.class that contains a main() method?

- javac HelloWorld.class
- [x] java HelloWorld
- java HelloWorld.class
- javac HelloWorld

## Question 5

```java
    public class test 
    {
        public static void main(String[] args)
        {
            int number = 49;
            if(number > 50)
                System.out.println("Number is greater than 50");
            else
                System.out.println("Number is less than 50");
            System.out.println("Done");
        }
    }
```

- Compile time error
- Number is greater then 50
- Number is less than 50
- [x] Number is less than 50 , Done

## Question 6

Which one of the following operators increases the value of an operand by 1 before the evaluation of an expression?

- [x] ++x
- x++
- x+=1
- x--

## Question 7

Which one of the following options denotes the correct output of the expression?

```java
    (40+10)-3*20+25/5
```

- [x] -5
- -10
- 30
- 40

## Question 8

Predict the output  

```java
    public class AddNumber
    { 
         public static void main(String []args) 
        { 
            byte num1=10; // Line 1 
            byte num2=12; // Line 2 
            short result=num1+num2; // Line 3 
            System.out.println("The result of adding two numbers are: " + result); 
        }   
    }
```

- Compile time Error on Line 1
- Compile time Error on Line 2
- [x] Compile time Error on Line 3
- The result of adding two numbers are: 22

## Question 9

Predict the output  

```java
    public class Weather 
    {
        public static void main(String [] args)
        { 
            int temperature = 20;
            if (temperature > 40) 
            { 
                System.out.println("It is a hot weather, wear summer clothes"); 
            } 
            else 
            { 
                System.out.println("It is a mild weather, wear comfortable clothes"); 
            } 
        } 
    }  
```

- [x] It is a mild weather, wear comfortable clothes
- it is a hot weather, wear summer clothes , It is a mild weather, wear comfortable clothes
- Compile time error
- Runtime error

## Question 10

```java
    public class Weekdays
    {
        public static void main(String[] args)
        { 
            int day; 
            day=2; 
            String weekDay;  
            switch(day)  
            {  
                case 1:
                    weekDay = "First day of the week is Monday";
                    break;
                case 2:
                    weekDay = " Second day of the week is Tuesday";  
                case 3:  
                    weekDay = " Third day of the week is Wednesday";  
                    break;  
                case 4:  
                    weekDay = " Fourth day of the week is Thursday";  
                    break;  
                case 5:  
                    weekDay = " Fifth day of the week is Friday";  
                case 6:  
                    weekDay = " Sixth day of the week is Saturday";  
                    break;  
                case 7:  
                    weekDay = " Seventh day of the week is Sunday";  
                    break;  
                default:  
                    weekDay = "Invalid day";  
                    break;  
            }  
            System.out.println(weekDay);  
        }  
    }  
```

- Invalid day
- Second day of the week is Tuesday
- [x] Third day of the week is Wednesday
- Fifth day of the week is Friday

## Question 11

Predict the output

```java
    public class SwitchCaseConstants 
    { 
        public static void main(String[] args) 
        { 
            int num1=2;
            int num2=2; 
            int flag=4; 

            switch(flag) 
            { 
                case num1+num2:  
                    System.out.println("The result is:" + (num1+num2)); 
                    break; 
                case num1+num2+2: 
                    System.out.println("The result is:" + (num1+num2+2)); 
                    break;     
            } 
        } 
    }  

```

- The result is: 4
- The result is: 6
- The result is: 2
- [x] Compilation error

## Question 12

What values do a and b hold after the following expressions?

```java
    int a = 5; int b = 10; b = a++; 
```

- a = 5 and b = 5;
- a = 5 and b = 6
- [x] a = 6 and b = 5
- a = 6 and b = 6

## Question 13

What value does b hold after the following expressions?

```java
    int b = 5; b = b % 2;? 
```

- compiler error
- 0
- [x] 1
- 2

## Question 14

What value does b hold after the following expressions?

```java
    int b = 7; b = 22 / b; 
```

- compiler error
- 3.33
- 1
- [x] 3

## Question 15

What value does b hold after the following expressions?

```java
    byte a = 1;byte b = ++a; 
```

- compiler error
- 0
- 1
- [x] 2
