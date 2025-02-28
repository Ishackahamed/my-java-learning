package com.basiccodings.program;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		String[] str = { "greeting", "goodbye", "thanks", "about", "name", "help", "createaccount", "complaint" };
		System.out.println("Before Sorting:" + Arrays.toString(str));
		int j = 0;
		String temp = "";
		// char[] chars = str.toCharArray();
		for (int i = 0; i < str.length; i++) {
			for (j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("After Sorting:" + Arrays.toString(str));
//        for(String as : str){
//         System.out.println(as);
//      }
	}
}