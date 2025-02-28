package com.basiccodings.numsmanipulation;

import java.util.Scanner;

public class Powers {

	public static int square(int x) {
		return x * x;
	}

	public static int cube(int y) {
		return y * y * y;
	}

	public static double root(int z) {
		return Math.sqrt(z);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		System.out.println("Square of the given number is: " + square(num));
		System.out.println("Cube of the given number is: " + cube(num));
		System.out.println("Square root of the given number is: " + root(num));
		scanner.close();
	}
}
