package com.basiccodings.string;

public class Replace {

	public static void main(String[] args) {
		String data1 = "python is general purpose programming langauage";
		char[] data3 = data1.toCharArray();
		int leng = data1.length();
		char[] data2 = new char[leng];

		for (int i = 0; i < leng; i++) {
			if (data3[i] != ' ') {
				data2[i] = data3[i];
			} else {
				data2[i] = '-';
			}
		}
		System.out.println(data2);
	}

}
