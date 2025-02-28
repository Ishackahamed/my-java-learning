package com.basiccodings.program;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		char letter = scan.next().charAt(0);
		char letterOrg = Character.toLowerCase(letter);
		if (Character.isLetter(letterOrg)) {
			switch (letterOrg) {
			case 'a':
				System.out.println("Given letter " + letter + " is Vowel");
				break;
			case 'e':
				System.out.println("Given letter " + letter + " is Vowel");
				break;
			case 'i':
				System.out.println("Given letter " + letter + " is Vowel");
				break;
			case 'o':
				System.out.println("Given letter " + letter + " is Vowel");
				break;
			case 'u':
				System.out.println("Given letter " + letter + " is Vowel");
				break;
			default:
				System.out.println("Given letter " + letter + " is Consonant");
				break;
			}
		} else {
			System.out.println("OOPS..!!The Given Input in Invalid Character...!!");

		}
		scan.close();

	}

}
