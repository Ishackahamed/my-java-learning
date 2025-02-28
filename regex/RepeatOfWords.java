package com.basiccodings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatOfWords {

	public static void main(String[] args) {

		String sentence = "Thupparku thuppaya thuppakki thupparku Thuppaya thoovum mazhai";
		String small = sentence.toLowerCase();
		Pattern p = Pattern.compile("thuppa");
		Matcher m = p.matcher(small);
		int count = 0;

		while (m.find()) {
			count++;
			System.out.println(m.group() + " Start at : " + m.start());
		}
		System.out.println(count);
	}

}
