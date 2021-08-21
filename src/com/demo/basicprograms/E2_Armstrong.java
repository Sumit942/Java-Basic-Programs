package com.demo.basicprograms;

import java.util.Scanner;

public class E2_Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		int sum = 0, res, temp = n;
		while (n > 0) {
			res = n % 10;
			sum = sum + (res * res * res);
			n /= 10;
		}
		if(sum==temp)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		sc.close();
	}

}
