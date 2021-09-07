package com.demo.basicprograms;

public class E16_Array {

	public static void main(String[] args) {
		int[][][] arr3d = new int[3][4][5];

		int i, j, k;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				for (k = 0; k < 5; k++) {
					arr3d[i][j][k] = i * j * k;
					System.out.print(" " + arr3d[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
