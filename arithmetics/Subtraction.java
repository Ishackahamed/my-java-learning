package com.basiccodings.arithmetics;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int a = scan.nextInt();

		System.out.println("Enter the Second number : ");
		int b = scan.nextInt();

		int Sub = a - b;
		System.out.println("The Sum of numbers : " + Sub);

		scan.close();

	}

}
