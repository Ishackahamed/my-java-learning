package com.basiccodings.program;

public class CalculateVowel {

	public static void main(String[] args) {
		String word = "matheatic";
		String letterword = word.toUpperCase();
		char[] letter = letterword.toCharArray();
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int j = 0; j < letter.length; j++) {
			switch (letter[j]) {
			case 'A':
				a++;
				break;
			case 'E':
				e++;
				break;
			case 'I':
				i++;
				break;
			case 'O':
				o++;
				break;
			case 'U':
				u++;
				break;
			}
		}
		System.out.println("Vowel in the given word is:  ");
		System.out.println("a = " + a);
		System.out.println("e = " + e);
		System.out.println("i = " + i);
		System.out.println("o = " + o);
		System.out.println("u = " + u);
	}
}
