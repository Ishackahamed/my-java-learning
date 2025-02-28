package com.basiccodings.task;

public class ReverseNUM {

	public static void main(String[] args) {

		int inp = 54913;
		int result = 0;

		while (inp != 0) {
			int rem = inp % 10;
			result = result * 10 + rem;
			inp = inp / 10;
		}
		System.out.println(result);
	}

}
