package com.basiccodings.program;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int org_numbers = scan.nextInt();
		int numbers = org_numbers;

		int remainder, result = 0;
		int numdigits = (int) Math.log10(org_numbers) + 1;
		while (numbers > 0) {
			remainder = numbers % 10;
			result += Math.pow(remainder, numdigits);
			numbers /= 10;
		}
		if (org_numbers == result) {
			System.out.println("The given number is armstrong");
		} else {
			System.out.println("The given number is not a armstrong");
		}
		scan.close();
	}

}
