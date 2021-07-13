package com.qa.calculatortask;

// NAME OF THE CLASS
public class Runner {

	String name = "VinESHHHHHHHH";
	static String hometime = "time to go home yet?";

	// Entry point - MAIN METHOD
	public static void main(String[] args) {

<<<<<<< HEAD

		System.out.println(addTwo(15.56d, 20.54d));
		System.out.println(subTwo(100, 50));
		System.out.println(mulTwo(13, 13));
		System.out.println(divTwo(5, 2));
		

		System.out.println(addTwo(10.5423456d, 150.46465d));
		System.out.println(subTwo(15.5, 10.4567));
		System.out.println(mulTwo(235.6, 56));
		System.out.println(divTwo(35, 4536));
		System.out.println(divTwo(4, 7));
		System.out.println(mulTwo(5, 57));
		System.out.println(divTwo(2, 10));
		
		
		
		

=======
>>>>>>> a0617549f7a7a89b329c3ec88dd4ab42558b5adb
//		System.out.println(addTwo(10.5423456d, 150.46465d));
//		System.out.println(subTwo(15.5, 10.4567));
//		System.out.println(mulTwo(235.6, 56));
//		System.out.println(divTwo(35, 4536));
//		System.out.println(divTwo(4, 7));
//		System.out.println(mulTwo(5, 57));

<<<<<<< HEAD
		System.out.println(sayHello("Vin"));;

=======
		Runner r = new Runner();
		System.out.println(r.sayHello("Vin"));
		System.out.println(r.name);
		System.out.println(hometime);
>>>>>>> a0617549f7a7a89b329c3ec88dd4ab42558b5adb

	}// END

	// methods - outside of the main method
	// double - is the return type that we want
	// addtwo - THE NAME HOW TO CALL IT
	// (they are the arugments )
	// when i call addTwo (the first number, the second number);
<<<<<<< HEAD
	public static double addTwo(double number1, double number2) {
		return number1+number2;
=======
	public double addTwo(double number1, double number2) {
		return number1 + number2;
>>>>>>> a0617549f7a7a89b329c3ec88dd4ab42558b5adb
	}

//	<visibility> <static> <return type> <Method name>(parameters/ Aruments){ 
//	
//		body of the method AKA THE LOGIC 
//	}
//	

	// i want a method that "returns" a string= hello plus my name= String
	public String sayHello(String name) {
		return "Hello " + name + " my name is " + name;
	}

	public static double subTwo(double number1, double number2) {

		return number1-number2;
	}

	public static double mulTwo(double number1, double number2) {
		return number1*number2;
	}

	public static double divTwo(double number1, double number2) {
		if (number1 < number2) {
			System.out.println("Division cannot be performed");
		} else {
			 System.out.println(number1/number2);	
		}
		return number1/number2;
	
			
		}

//		Edit the division method in the Calculator class, the sum should only 
//		execute if the first parameter is smaller than the second, otherwise 
//		it prints out a message saying that the division cannot be performed.
	}


// END
