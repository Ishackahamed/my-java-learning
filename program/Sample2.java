package com.basiccodings.program;

public class Sample2 {

	public static void main(String[] args) {

		int largest = 0;
		int secondlargest = 0;

		int[] list = { 40, 20, 60, 30, 50, 25 };

		for (int num : list) {
			if (num > largest) {
				secondlargest = largest;
				largest = num;
			} else if (num > secondlargest && num != largest) {
				secondlargest = num;
			}
		}

//		System.out.println("The Largest Number form the given list is : "+ largest);
//		System.out.println("The Second Largest Number form the given list is : "+secondlargest);

		int smallest = largest;
		int secondsmallest = secondlargest;

		for (int num : list) {
			if (num < smallest) {
				secondsmallest = smallest;
				smallest = num;
			} else if (num < secondsmallest && num != smallest) {
				secondsmallest = num;
			}
		}
		System.out.println("The Largest Number form the given list is : " + largest);
		System.out.println("The Second Largest Number form the given list is : " + secondlargest);

		System.out.println("The Smallest Number form the given list is : " + smallest);
		System.out.println("The Second Smallest Number form the given list is : " + secondsmallest);
	}
}