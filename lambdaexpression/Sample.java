package com.basiccodings.lambdaexpression;

interface Display {
	public void dis();
}

public class Sample {
	public static void main(String[] args) {
		Display obj = () -> {
			System.out.println("Hello");
		};
		obj.dis();

		SampleDemo obj1 = () -> {
			System.out.println("Ahamed");
		};
		obj1.show();

		SampleTest obj2 = () -> {
			System.out.println("How are You");
		};
		obj2.dis();
	}
}