package com.basiccodings.lambdaexpression;

@FunctionalInterface
interface sample {
	void show();
}

public class Example {
	public static void main(String[] args) {
		sample obj = () -> {
			System.out.println("Hi");
		};
		obj.show();
	}
}
