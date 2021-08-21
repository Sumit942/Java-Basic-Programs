package com.demo.basicprograms;

public class E7_LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 2021;
		if ((input % 400 == 0) || ((input % 4 == 0) && (input % 100 != 0))) {
			System.out.println("Leap Year!");
		} else {
			System.out.println("Non-Leap Year!");
		}
	}

}
