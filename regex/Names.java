package com.basiccodings.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Names {
	static boolean isValid(String regex, String userinput) {
		return Pattern.compile(regex).matcher(userinput).matches();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String namePattern = "^[A-Z]{1}[.][A-Z]{1}[a-z]{1,20}";

		System.out.println("Enter the name : ");
		String name = scan.next();

		System.out.println(isValid(namePattern, name));

		scan.close();

	}

}
