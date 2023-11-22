package com.jap;

public class NumberFormatExceptionDemo {


    public static void convertStringToInteger(){
        String string = "Java";
        try {
            int data = Integer.parseInt(string);
        }catch (NumberFormatException exception){
            System.out.println("Exception is " + exception);
        }
    }
    

    public static void main(String[] args) {
        NumberFormatExceptionDemo.convertStringToInteger();
    }
}
