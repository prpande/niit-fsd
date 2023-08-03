package com.jap;

import java.util.Scanner;

public class ReverseDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to reverse it : ");
        int number = scanner.nextInt();
        ReverseDigit reverseDigit = new ReverseDigit();
       int reverse= reverseDigit.getReverse(number);
        System.out.println(reverse);

    }
    public int getReverse(int number) {
        int reverse = 0;
        while (number != 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }
        return reverse;
    }

}
