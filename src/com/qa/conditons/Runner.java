package com.qa.conditons;

public class Runner {
	public static void main(String[] args) {
		boolean payDay = true;
		System.out.println(payDay);

		if (!payDay) {
			System.out.println("Stay home - save money");
		} else {
			System.out.println("Go out");
		}

		if (payDay) {
			System.out.println("Go out");
		} else {
			System.out.println("Stay home - save money");
		}
	}

}
