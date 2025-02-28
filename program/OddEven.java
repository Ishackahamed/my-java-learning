package com.basiccodings.program;

public class OddEven {
	public void even(int z) {
		if (z % 2 == 0) {
			System.out.println("Given number is EVEN");
		} else {
			System.out.println("Given number is ODD");
		}

	}

	public static void main(String[] args) {
		OddEven obj = new OddEven();
		int num = 3;
		obj.even(num);

	}

}
