package com.basiccodings.Streamss;

import java.util.ArrayList;

public class Sample4 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);

		long oddCount = nums.stream().filter(n -> n % 2 == 1).count();
		System.out.println(oddCount);
	}
}
