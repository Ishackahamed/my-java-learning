package com.basiccodings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameExtract {

	public static void main(String[] args) {
		String data1 = "From ishackahamed3@gmail.com Sat Jan 21 11:24:32.008173";
		String data2 = "From ishackahamed@gmail.com Sat Jan 21 11:24:32.008173";

		String name1 = extractname(data1);
		String name2 = extractname(data2);

		System.out.println("Name is : " + name1);
		System.out.println("Name is : " + name2);
	}

	public static String extractname(String sample) {
		String pattern = "From\\s([A-za-z]+)";
		Matcher match = Pattern.compile(pattern).matcher(sample);

		if (match.find()) {
			return match.group(1);
		} else {
			return null;
		}
	}
}