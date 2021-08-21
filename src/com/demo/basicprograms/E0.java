package com.demo.basicprograms;

/**
 * This is internal logic of how content-type is converted to Content-Type in a
 * proper format
 * 
 * @author Sumit
 * 
 */
public class E0 {

	public static void main(String[] args) {
		String input = "CoNtExT-tyPe";

		boolean toUpprCase = true;
		for (char c : input.toCharArray()) {
			input = input.substring(input.indexOf(c) + 1);

			int ascii = c;
			if (toUpprCase) {
				c = ascii > 96 && ascii < 123 ? (char) (ascii - 32) : (char) c;
			} else {
				c = ascii < 91 && ascii > 64 ? (char) (ascii + 32) : (char) c;
			}

			toUpprCase = (int) c == 45;
			input += c;
		}

		System.out.println("\n" + input);
	}
}
