package com.basiccodings.program;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int leng = scan.nextInt();

		int first = 0;
		int second = 1;

		for (int i = 1; i <= leng; i++) {
			int next = first + second;
			System.out.print(first + ",");
			first = second;
			second = next;
		}

		scan.close();
	}

}
