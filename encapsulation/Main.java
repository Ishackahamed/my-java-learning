package com.basiccodings.encapsulation;

class Area {
	int length;
	int breadth;

	void setarea(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;

	}

	void getarea() {
		int area = length * breadth;
		System.out.println("Area = " + area);
	}

}

class Main {
	public static void main(String[] args) {
		Area obj = new Area();
		obj.setarea(10, 20);
		obj.getarea();
	}
}
