package com.basiccodings.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckFirstLetter {

	public static void main(String[] args) {

		String sentence = "Tamil is a oldest language";

		Pattern p = Pattern.compile("language$"); // for checking the word in String
		Pattern s = Pattern.compile("T|a");// check a character in String

		Matcher m = p.matcher(sentence);
		Matcher n = s.matcher(sentence);

		while (m.find()) {
			System.out.println(" Start at " + m.start() + " end at " + m.end());
		}

		while (n.find()) {
			System.out.println(" Start at " + n.start() + " end at " + n.end());
		}
	}

}
