package com.basiccodings.array;

import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value for Index : " + i);
			arr[i] = scan.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		scan.close();

	}

}
