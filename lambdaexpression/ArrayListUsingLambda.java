package com.basiccodings.lambdaexpression;

import java.util.ArrayList;

public class ArrayListUsingLambda {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("orange");
		list.add("Banana");
		list.add("Mango");

		list.forEach((n) -> {
			System.out.println(n);
		});
	}

}
