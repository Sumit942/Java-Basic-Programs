package com.demo.basicprograms;

public class E4_DecimalToBinary {

	/** This illustrates convertion of Decimal to Binary
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 100;
		String binary = toBinary(input);
		System.out.println(binary);
	}

	public static String toBinary(int input) {
		if(input == 0) {
			return "0";
		}
		int remainder;
		String binary = "";
		
		while (input > 0) {
			remainder = input % 2;
			binary = remainder + binary;
			input /= 2;
		}
		
		return binary;
	}

}
