package com.basiccodings.pattern;

public class InvertRigTri {
	public static void main(String[] args) {
		int rows = 5;

		for (int i = rows; i >= 0; i--) {

			for (int j = i - 1; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
