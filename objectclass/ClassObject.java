package com.basiccodings.objectclass;

public class ClassObject {
	public static int addition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 15;

		int c = addition(a, b);

		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		System.out.println("Sum (c = a + b): " + c);
	}
}
