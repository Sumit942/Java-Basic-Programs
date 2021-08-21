package com.demo.basicprograms;

public class E10_conTrick {
	/**
	 * shortcuts to convert decimal to binary, hex and octal
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 162;

		System.out.println("Decimal to Binary: \t" + Integer.toBinaryString(input));
		System.out.println("Decimal to Hexadecimal: " + Integer.toHexString(input).toUpperCase());
		System.out.println("Decimal to octal: \t" + Integer.toOctalString(input));
	}

}
