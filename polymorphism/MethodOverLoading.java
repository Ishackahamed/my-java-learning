package com.basiccodings.polymorphism;

public class MethodOverLoading {
	void show(int num1) {
		System.out.println("number1 is : " + num1);
	}

	void show(int num1, double num2) {
		System.out.println("number1 is : " + num1);
		System.out.println("number2 is : " + num2);

	}

	void show(int num1, double num2, float num3) {

		System.out.println("number1 is : " + num1);
		System.out.println("number2 is : " + num2);
		System.out.println("number3 is : " + num3);

	}

	void show(int num1, double num2, float num3, String name) {

		System.out.println("number1 is : " + num1);
		System.out.println("number2 is : " + num2);
		System.out.println("number3 is : " + num3);
		System.out.println("name is : " + name);
	}

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.show(10);
		System.out.println();
		obj.show(1, 2.00d);
		System.out.println();
		obj.show(1, 2.00d, 3.333333333333f);
		System.out.println();
		obj.show(1, 2.00d, 3.33333333f, "AHAMED");

	}

}
