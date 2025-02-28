package com.basiccodings.program;

import java.util.Scanner;

public class Odd_or_even {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = scan.nextInt();

		if (num % 2 == 1) {
			System.out.println(num + "  is odd");
		} else {
			System.out.println(num + "  is even");

			scan.close();

		}
	}
}
