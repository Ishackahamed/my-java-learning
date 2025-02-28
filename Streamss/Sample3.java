package com.basiccodings.Streamss;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample3 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(4);
		num.add(1);
		num.add(9);
		num.add(5);
		num.add(3);

		List<Integer> Ascend = num.stream().sorted().collect(Collectors.toList());
		System.out.println(Ascend);
	}
}
