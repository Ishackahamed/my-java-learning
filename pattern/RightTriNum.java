package com.basiccodings.pattern;

public class RightTriNum {

	public static void main(String[] args) {
		int row = 5;
		int number = 0;

		for (int i = 0; i <= row; i++) {
			number = 1;
			for (int j = 0; j < i; j++) {
				System.out.print(number + "  ");
				number++;
			}
			System.out.println();
		}
	}

}
