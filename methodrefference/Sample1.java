package com.basiccodings.methodrefference;

import java.util.ArrayList;

public class Sample1 {

	public static void main(String[] args) {

		ArrayList<Integer> age = new ArrayList<Integer>();

		age.add(10);
		age.add(20);
		age.add(30);

		// age.forEach(value -> System.out.println(value));

		age.forEach(System.out::println);
	}

}
