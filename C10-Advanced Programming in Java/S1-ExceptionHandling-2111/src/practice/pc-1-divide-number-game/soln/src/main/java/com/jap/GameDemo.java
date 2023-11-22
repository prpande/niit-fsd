package com.jap;

public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber) {
        //create local variable
        int finalNumber = 0;
        try {
            //write logic
            finalNumber = firstNumber / secondNumber;
            //Handle specific exception
        } catch (ArithmeticException exception) {
            return exception.toString();
        }
        return String.valueOf(finalNumber);
    }
}
