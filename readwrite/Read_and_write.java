package com.basiccodings.readwrite;

import java.util.Scanner;

public class Read_and_write {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int a = scan.nextInt();
		scan.nextLine();

		System.out.println("Enter a string:");
		String b = scan.nextLine();

		System.out.println("Enter a float:");
		float c = scan.nextFloat();

		System.out.println("Enter a boolean:");
		Boolean d = scan.nextBoolean();

		System.out.println("Enter a byte:");
		Byte e = scan.nextByte();

		System.out.println("Example of Int: " + a);
		System.out.println("Example of String: " + b);
		System.out.println("Example of Float: " + c);
		System.out.println("Example of Boolean: " + d);
		System.out.println("Example of Byte: " + e);

		scan.close();
	}
}
