package com.basiccodings.program;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the year");
		int year = scan.nextInt();

		if (year % 4 == 0) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not a leap year");

			scan.close();
		}
	}

}
