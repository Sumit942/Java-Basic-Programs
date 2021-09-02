package com.demo.basicprograms;

public class E14_NumConTrick {
	public static void main(String[] argv) {

		int x = 15;

		System.out.printf("%d dec == %s bin\n", x, dec2m(x, 2));
		System.out.printf("%d dec == %s oct\n", x, dec2m(x, 8));
		System.out.printf("%d dec == %s hex\n", x, dec2m(x, 16));
	}

	static String dec2m(int N, int m) {
		String str = "";
		for (int n = N; n > 0; n /= m) {
			int rem = n % m;
			str = rem > 10 ? (char) ('A' - 10 + rem) + str : rem + str;
		}

		return str;
	}

}
