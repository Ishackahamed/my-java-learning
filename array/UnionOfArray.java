package com.basiccodings.array;

//import java.util.Arrays;

public class UnionOfArray {
	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 7, 8, 9, 10 };
		int arrunion[] = new int[arr1.length + arr2.length];

		int position = 0;

		for (int value : arr1) {
			arrunion[position] = value;
			position++;
		}
		for (int value : arr2) {
			arrunion[position] = value;
			position++;
		}

		for (int i = 0; i < arrunion.length; i++) {
			System.out.println(arrunion[i]);
		}

	}

}