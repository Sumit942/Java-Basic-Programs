package com.demo.basicprograms;

public class E12_Fibonacci {

	public static void main(String[] args) {

		int input = 15;
		/*for (int i = 0; i < input; i++) {
			System.out.print(fib1(i)+" ");
		}*/
		fib(input);
	}

	/**
	 * with my way
	 * 
	 * @param n
	 * @author SUMEET
	 */
	public static void fib(int n) {

		int temp = 0;
		int minus1 = 0;
		int minus2 = 1;
		for (int i = 0; i <= n; i++) {
			if (i <= 1) {
				temp = i;
				System.out.print(" " + temp);
				continue;
			}
			temp = minus2 + minus1;
			System.out.print(" " + temp);
			minus1 = minus2;
			minus2 = temp;
		}
	}

	/**
	 * using recursion
	 */
	public static int fib1(int n) {
		if (n < 2)
			return n;
		else
			return (fib1(n - 2) + fib1(n - 1));

	}
}
