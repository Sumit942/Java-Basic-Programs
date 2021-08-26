package com.demo.basicprograms;

/**
 * find the prime numbers quickly
 * 
 * @author SUMEET
 *
 */
public class E11_FastPrime {

	public static void main(String[] args) {
		int input = 25;
		no_of_Prime(input);
	}

	static void no_of_Prime(int num) {
		boolean[] prime = new boolean[num + 1];

		for (int i = 2; i <= num; i++) {
			prime[i] = true;	//Assume that all are prime
		}

		for (int divisor = 2; divisor * divisor <= num; divisor++) { // condition checks that multiple of p

			// if prime[p] is not change, then it is prime
			if (prime[divisor]) {

				// updating multiples of divisor
				for (int i = divisor * 2; i <= num; i += divisor) {
					prime[i] = false; // make all multiples of divisor false
				}
			}
		}

		for (int i = 2; i <= num; i++) {
			if (prime[i])
				System.out.print(" " + i);
		}
	}
}
