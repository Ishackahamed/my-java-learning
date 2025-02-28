package com.basiccodings.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			CustomException me = new CustomException("This is a custom exception message.");
			throw me;

		} catch (CustomException e) {
			System.out.println("Caught the exception: " + e.getMessage());
		}
	}
}