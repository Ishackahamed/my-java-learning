package com.basiccodings.program;

import java.util.Scanner;

public class Prime {

	static boolean isPrime(int a) {
		if (a <= 1) {
			return false;
		}
		if (a == 2) {
			return true;
		}

		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();

		if (isPrime(a)) {
			System.out.println(a + " is a prime number.");
		} else {
			System.out.println(a + " is not a prime number.");
		}

		scan.close();
	}
}
