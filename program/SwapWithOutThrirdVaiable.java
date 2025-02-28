package com.basiccodings.program;

public class SwapWithOutThrirdVaiable {

	static void swap(int[] values) {

		values[0] = values[0] - values[1];

		values[1] = values[0] + values[1];

		values[0] = values[1] - values[0];

	}

	public static void main(String[] args) {

		int[] values = { 9, 5 };

		swap(values);

		System.out.println(" value of m " + values[0] + "  value of n " + values[1]);
	}

}
