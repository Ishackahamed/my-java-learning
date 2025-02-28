package com.basiccodings.abstracion;

public class Xclass implements useme {

	public void Printed() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		Xclass obj = new Xclass();

		obj.Printed();
	}

}
