package com.demo;

public class Practice {

	public static void main(String[] args) {

		// perfect practice
		int a = 10;

		int divisorsSum = 0;
		for (int i = 1; i < a; i++) {

			if (a % i == 0) {
				divisorsSum += i;
			}
		}
		System.out.print(a+" is");
		if (a != divisorsSum)
			System.out.print(" not");
		System.out.println(" a perfect number.");
	}
}
