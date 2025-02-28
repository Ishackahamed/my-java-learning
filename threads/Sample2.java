package com.basiccodings.threads;

public class Sample2 extends Thread {
	public void run() {
		System.out.println("This code is running in a thread");
	}

	public static void main(String[] args) {
		Sample2 thread = new Sample2();
		thread.start();
		System.out.println("This code is outside of the thread");
	}

}
