package com.basiccodings.lambdaexpression;

public class FI1 {

	public static void main(String[] args) {
		FI2 obj;
		obj = () -> {
			return 3.14;
		};
		System.out.println("the value of PI " + obj.value());
	}
}
