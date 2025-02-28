package com.basiccodings.objectclass;

public class Example {

	class Car {
		String car1 = "audi0";
		String car2 = "audi1";
		String car3 = "audi2";
		String car4 = "audi3";
	}

	class Bike {
		String bike1 = "yamaha0";
		String bike2 = "yamaha1";
		String bike3 = "yamaha2";
		String bike4 = "yamaha3";
	}

	public static void main(String[] args) {
		// first create object for
		Example example = new Example();

		Bike obj = example.new Bike();
		System.out.println(obj.bike1);

		Car obj1 = example.new Car();
		System.out.println(obj1.car1);
	}
}
