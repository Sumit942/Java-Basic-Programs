package com.demo.basicprograms;

import java.util.Scanner;

public class E1_AdamNum {
	/*
	 * lets num=12; now, square of 12=144 reverse of 12 = 21 square of 21= 441
	 * 144=rev(441)
	 * 
	 * So, the number 12 is a adam number
	 */

	private static int revNum(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

	private static int square(int n) {
		return n * n;
	}

	private static boolean checkAdam(int n) {
		int a = square(n);
		System.out.println("Number square: " + a);
		int b = square(revNum(n));
		System.out.println("Number reverse square: " + b);
		System.out.println("Rohan commit through sts");
		return (a == revNum(b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int nextInt = sc.nextInt();

		if(checkAdam(nextInt)) {
			System.out.println(nextInt);
		} else {
			System.out.println("Not a Adam Number");
		}
		sc.close();
	}

}
