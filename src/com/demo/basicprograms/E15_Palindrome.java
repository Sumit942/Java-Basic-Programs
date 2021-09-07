package com.demo.basicprograms;

public class E15_Palindrome {

	/**
	 * Learning some new tricks
	 * for doing simple programs
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "1001";
		
		System.out.print(input+ " is ");
		if (!isPalindrome(input))
			System.out.print("Not ");
		
		System.out.print("Palindrome");

	}

	private static boolean isPalindrome(String input) {
		String rev = "";
		for (int i = input.length()-1; i >= 0; i--) {
			rev += input.charAt(i);
		}
		
		return rev.equalsIgnoreCase(input);
	}

}
