package com.qa.calculatortask;

public class Runner {

	// Entry point - MAIN METHOD
	public static void main(String[] args) {
		System.out.println(addTwo(15.56d, 20.54d));
		System.out.println(subTwo(100, 50));
		System.out.println(mulTwo(13, 13));
		System.out.println(divTwo(5, 2));
		

	}// END

	// methods - outside of the main method
	public static double addTwo(double number1, double number2) {
		return number1+number2;
	}

	public static double subTwo(double number1, double number2) {
		return number1-number2;
	}

	public static double mulTwo(double number1, double number2) {
		return number1*number2;
	}

	public static double divTwo(double number1, double number2) {
		return number1/number2;
	}

}// END
