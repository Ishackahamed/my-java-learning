package com.basiccodings.threads;

public class Sample3 extends Thread {
	public static int amount = 0;

	public static void main(String[] args) {
		Sample3 thread = new Sample3();
		thread.start();
		System.out.println(amount);
		amount++;
		System.out.println(amount);
	}

	public void run() {
		amount++;
	}
}
