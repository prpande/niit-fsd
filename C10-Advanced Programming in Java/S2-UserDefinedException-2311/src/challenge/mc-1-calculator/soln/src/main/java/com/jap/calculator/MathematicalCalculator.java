package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		//write the code and handle the ArithmeticException
		if (num2 == 0) {
			System.out.println("Division by zero not allowed.");
			return 0;
		}
		return num1 / num2;
	}

	public int modulo(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("Division by zero not allowed.");
			return 0;
		}

		return num1 % num2;
	}
}
