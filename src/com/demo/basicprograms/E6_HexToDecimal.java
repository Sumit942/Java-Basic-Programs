package com.demo.basicprograms;

public class E6_HexToDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 241;
		
		String hexaDecimal = dec2Hex(input);
		String hexDigits = "0123456789ABCDEF";
		int dec = 0;
		
		for (int i = 0; i < hexaDecimal.length(); i++) {
			char hex = hexaDecimal.charAt(i);
			int d = hexDigits.indexOf(hex);
			dec = dec*16 + d;
		}
		System.out.println("Decimal: "+dec);
	}

	public static String dec2Hex(int dec) {
		int input = dec,remainder;
		String hexDigits = "0123456789ABCDEF";
		
		String hexaDec = "";
		while (input > 0) {
			remainder = input % 16;
			hexaDec = hexDigits.charAt(remainder) + hexaDec;
			input /= 16;
		}
		System.out.println("Hex Value: "+hexaDec);
		return hexaDec;
	}

}
