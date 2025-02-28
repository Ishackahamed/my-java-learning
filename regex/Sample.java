package com.basiccodings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("......");
		Matcher matcher = pattern.matcher("ahamed");
		boolean result = matcher.matches();
		System.out.println("Is User-Input & Regex Pattern for User-Input Are Matching..? : " + result);
	}
}