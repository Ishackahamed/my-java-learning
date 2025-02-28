package com.basiccodings.random;

public class RandomGeneration {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int randomNum = (int) ((Math.random() + 1) * 11); // 0 to 100
			System.out.println(randomNum);
		}

	}

}
