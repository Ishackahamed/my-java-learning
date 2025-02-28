package com.basiccodings.exceptionhandling;

import java.io.*;

public class Sample4 {
	void first() throws IOException, ArithmeticException {
		throw new IOException("Error");
	}

	void second() throws IOException, ArithmeticException {
		first();
	}

	void third() {
		try {
			second();
		} catch (Exception e) {
			System.out.println("Work is Done");
		}
	}

	public static void main(String[] args) {
		Sample4 obj = new Sample4();
		obj.third();
		System.out.println("all in control");
	}

}
