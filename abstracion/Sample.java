package com.basiccodings.abstracion;

public class Sample implements Units {
	public int print(int num) {
		System.out.println("Hello");
		return num;
	}

	public String show(String word) {
		System.out.println("Hai");
		return word;
	}

	public static void main(String[] args) {
		Sample objx = new Sample();
		System.out.println(objx.print(10));
		System.out.println(objx.show("hh"));
	}
}
