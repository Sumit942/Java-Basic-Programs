package com.demo.basicprograms;

public class E21_SumOfDigits {

	public static void main(String[] args) {
		int input = 505;
		System.out.println(sumOfDigit(input));
	}

	public static int sumOfDigit(int n) {
		
		if (n < 10)
			return n;
		
		int sum = 0, rem;
		while (n > 0) {
			rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}

}
