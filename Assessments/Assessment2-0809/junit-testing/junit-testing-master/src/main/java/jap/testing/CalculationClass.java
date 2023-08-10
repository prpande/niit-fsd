package jap.testing;

public class CalculationClass {

    //Write code to check given number is even or odd
    //if it is even return true else return false
    //there should be only one return statement
    public boolean isNumberEven(int number) {

        return true;

    }

    public int addNumber(int number1, int number2) {
        return number1 + number2;
    }

    //Revers the given number and return the number
    public long reverseNumber(long number) {
        return 0;
    }

    public long greatestOfThreeNumber(long number1, long number2, long number3){

        long number4 = 0;
        if(number1>=number2 && number1>=number3) {
            number4 = number1;
        }
        else if (number2>=number1 && number2>=number3)
        {
            number4 = number2;
        }
        else
        {
            number4 = number3;
        }
        return number4;

    }
}
