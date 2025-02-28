package com.basiccodings.objectclass;

public class Methods {

	// non Static function need to create object for class
	public void cars() {
		System.out.println("Run with object");

		// Static function no need to create object for class
	}

	static void bike() {
		System.out.println("Run without object");
	}

	public static void main(String[] args) {
		bike();

		Methods obj = new Methods();
		obj.cars();
	}

}
