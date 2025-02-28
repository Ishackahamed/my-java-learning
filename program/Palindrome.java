package com.basiccodings.program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the word ");
		String org = scan.nextLine();
		String rev = "";

		int length = org.length();

		for (int i = (length - 1); i >= 0; i--) {
			rev = rev + org.charAt(i);
		}

		if (org.toUpperCase().equals(rev.toUpperCase())) {
			System.out.println("The " + org + " is palindrome");
		} else {
			System.out.println("The " + org + "is not palindrome");
		}

		scan.close();

	}

}
