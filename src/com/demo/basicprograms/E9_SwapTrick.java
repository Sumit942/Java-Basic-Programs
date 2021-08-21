package com.demo.basicprograms;

public class E9_SwapTrick {

	/**
	 * Old school Trick for swapping numbers
	 * 
	 * @param args
	 */
	public static void main1(String[] args) {
		int a = 8, b = 10;
		System.out.println("Before Swap: a = " + a + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After  Swap: a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {
		int a = 1, b = 2;
		System.out.println("Before Swap: a = " + a + ", b = " + b);

		a = a + b - (b = a);

		System.out.println("After  Swap: a = " + a + ", b = " + b);
	}
}
