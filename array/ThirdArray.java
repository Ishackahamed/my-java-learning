package com.basiccodings.array;

public class ThirdArray {
	public void oddStore(int orgArray[], int oddArray[]) {
		for (int i = 0; i < orgArray.length; i++) {
			if (orgArray[i] % 2 != 0) {
				oddArray[i] = orgArray[i];
				System.out.println(oddArray[i]);
			}
		}
	}

	public void evenStore(int orgArray[], int evenArray[]) {
		for (int i = 0; i < orgArray.length; i++) {
			if (orgArray[i] % 2 == 0) {
				evenArray[i] = orgArray[i];
				System.out.println(evenArray[i]);
			}
		}

	}

	public static void main(String[] args) {
		ThirdArray obj = new ThirdArray();
		int orgArray[] = { 10, 20, 30, 21, 12, 6, 8, 9, 31, 13, 11 };
		int oddArray[] = new int[20];
		int evenArray[] = new int[10];

		System.out.println("Even Element in Even Array Are : ");
		obj.evenStore(orgArray, evenArray);

		System.out.println("-------------------------------------");

		System.out.println("Even Element in Odd Array Are : ");
		obj.oddStore(orgArray, oddArray);

	}

}
