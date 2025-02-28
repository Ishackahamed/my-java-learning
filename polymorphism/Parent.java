package com.basiccodings.polymorphism;

public class Parent {

	int num = 10;

	void show() {
		System.out.println("Sample Access of parent");
	}
}

class child extends Parent {
	int num = 100;

	void show() {
		System.out.println(num);
		System.out.println(super.num);

		super.show();
		System.out.println("Sample Access of child");
	}

	int square(int num) {
		return num * num;
	}

}