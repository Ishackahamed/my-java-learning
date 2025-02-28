package com.basiccodings.function;

import java.util.Scanner;

public class Function {
	public static int sum(int a, int b) {

		return a + b;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = scan.nextInt();

		System.out.println("Enter the number : ");
		int b = scan.nextInt();

		System.out.println(sum(a, b));
		scan.close();
	}

}
