package com.basiccodings.pattern;

public class RigTriAlphSeries {

	public static void main(String[] args) {
		int row = 4;
		char alph = 'A';

		for (int i = 0; i <= row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(alph + "  ");
				alph++;
			}
			System.out.println();
		}
	}

}
