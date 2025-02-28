package com.basiccodings.task;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String[] data1 = { "Apple", "Mango", "Pineapple", "Orange", "Apple", "Mango", "Grapes" };
		int leng = data1.length;
		String[] data2 = new String[leng];

		for (int i = 0; i < leng; i++) {
			// int leng2 = data2.length;
			for (int j = 0; j <= i; j++) {
				if (data1[i].equals(data2[j])) {
					if (data1[i] != (data2[j + 1])) {

						data1[i] = data2[j + 1];
					}
				} else {
					continue;
				}

			}

		}
		for (String array : data2) {
			System.out.println(array);
		}
	}
}
