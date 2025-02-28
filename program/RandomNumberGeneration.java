package com.basiccodings.program;

import java.util.*;

public class RandomNumberGeneration {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 1; i <= 200; i++) {
			int randNumbers = random.nextInt(20) + 1;
			System.out.println("\n Random Numbers Are Listed Below : " + randNumbers);
		}
	}
}
