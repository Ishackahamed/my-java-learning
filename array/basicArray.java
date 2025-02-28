package com.basiccodings.array;

import java.util.Scanner;

public class basicArray {
	public void odd(int ogarr[], int oddarr[]) {
		int index = 0;
		for (int i = 0; i < ogarr.length; i++) {

			if (ogarr[i] % 2 != 0) {
				oddarr[index] = ogarr[i];
				System.out.println(oddarr[index]);
				index++;
			}

		}

	}

	public void even(int ogarr[], int evenarr[]) {

		int index = 0;
		for (int i = 0; i < ogarr.length; i++) {

			if (ogarr[i] % 2 == 0) {
				evenarr[index] = ogarr[i];
				System.out.println(evenarr[index]);
				index++;
			}

		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the length of array : ");
		int leng = scan.nextInt();

		int ogarr[] = new int[leng];
		for (int i = 0; i < leng; i++) {
			System.out.println("Enter the value for index " + i + " is : ");
			ogarr[i] = scan.nextInt();
		}

		int oddarr[] = new int[ogarr.length];
		int evenarr[] = new int[ogarr.length];

		basicArray obj = new basicArray();

		System.out.println("\nODD number in Array");
		obj.odd(ogarr, oddarr);

		System.out.println("\nEVEN number in Array");
		obj.even(ogarr, evenarr);

		scan.close();
	}
}