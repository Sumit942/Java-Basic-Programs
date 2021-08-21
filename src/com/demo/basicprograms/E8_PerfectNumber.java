package com.demo.basicprograms;

public class E8_PerfectNumber {

	public static void main(String[] args) {
		int input = 6;
		if (isPerfect(input)) {
			System.out.println(input + " is a Perfect Number");
		} else {
			System.out.println(input + " is Not a Perfect Number");
		}
		
	}

	private static boolean isPerfect(int input) {
		int divisorsSum = 0;
		
		for (int i = 1; i < input; i++) {
			if (input % i == 0) {
				divisorsSum += i;
			}
		}
		return input == divisorsSum;
	}

}
