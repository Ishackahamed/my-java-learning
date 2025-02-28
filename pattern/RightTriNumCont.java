package com.basiccodings.pattern;

public class RightTriNumCont {

	public static void main(String[] args) {
		int row = 4;
		int number = 1;

		for (int i = 0; i <= row; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(number + "  ");
				number++;
			}
			System.out.println();
		}
	}

}
