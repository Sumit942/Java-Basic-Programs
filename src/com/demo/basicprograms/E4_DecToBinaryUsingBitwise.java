package com.demo.basicprograms;
/**
 * This illustrates the example of converting Decimal to Binary using Bitwise operator
 * @author Sumit
 *
 */
public class E4_DecToBinaryUsingBitwise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 1001;
		printBinaryForm(input);
	}
	
	public static void printBinaryForm(int num) {
		int remainder;
		
		if (num <= 1) {
			System.out.print(num);
			return; //kick out of the recursion
		}
		
		remainder = num % 2;
		printBinaryForm(num >> 1);
		System.out.print(remainder);
	}
}
