package com.demo.basicprograms;

public class E5_DecimalToHex {

	public static void main1(String[] args) {
		int input = 17,remainder;
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		String hexaDec = "";
		while (input > 0) {
			remainder = input % 16;
			hexaDec = hex[remainder] + hexaDec;
			input /= 16;
		}
		System.out.println("Decimal To Hexadecimal: "+hexaDec);
	}
	
	public static void main(String[] args) {
		int input = 17,remainder;
		String hexDigits = "0123456789ABCDEF";
		
		String hexaDec = "";
		while (input > 0) {
			remainder = input % 16;
			hexaDec = hexDigits.charAt(remainder) + hexaDec;
			input /= 16;
		}
		System.out.println("Decimal to Hexadecimal: "+hexaDec);
	}
}
