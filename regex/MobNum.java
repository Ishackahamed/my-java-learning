package com.basiccodings.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobNum {

	static boolean isValid(String regex, String userInput) {
		return Pattern.compile(regex).matcher(userInput).matches();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String MobNumPattern = "^[0-9]{10}$";

		System.out.println("ENTER MOBILE NUMBER");
		String MobNum = scan.next();

		System.out.println(isValid(MobNumPattern, MobNum));

		scan.close();
	}

}
