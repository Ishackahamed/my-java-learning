package com.basiccodings.arithmetics;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		int a = scan.nextInt();

		System.out.println("Enter the Second number : ");
		int b = scan.nextInt();

		int Divde = a / b;
		System.out.println("The divde of numbers : " + Divde);

		scan.close();

	}

}
