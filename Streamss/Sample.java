package com.basiccodings.Streamss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);

		List<Integer> square = num.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(square);
	}
}
