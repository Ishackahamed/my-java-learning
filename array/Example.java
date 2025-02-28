package com.basiccodings.array;

public class Example {
	public static void main(String[] args) {

		String data1 = "from nandhi@gmail.com";

		char[] array = data1.toCharArray();
		int length = array.length;
		char result[] = new char[length];

		for (int i = 5; i < length; i++) {
			if (array[i] == '@') {
				break;
			} else {
				result[i] = array[i];
			}
			System.out.print(result[i]);
		}

	}

}
