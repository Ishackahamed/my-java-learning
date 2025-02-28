package com.basiccodings.program;

public class Sample3 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 0; count <= 10; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
				count++;
				System.out.println(i);
			}
		}
		System.out.println(sum);
		// System.out.println(count);
	}

}
