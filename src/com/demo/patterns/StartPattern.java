package com.demo.patterns;

public class StartPattern {

	public static void Utriangle(int size) {

		for (int i = 0; i <= size; i++) {

			for (int j = i; j <= size; j++)
				System.out.print(" * ");

			System.out.println();
		}
	}

	public static void Ltriangle(int size) {

		for (int i = 0; i <= size; i++) {

			for (int j = 0; j <= i; j++)
				System.out.print(" * ");

			System.out.println();
		}
	}

	public static void main(String[] args) {

	}
}
