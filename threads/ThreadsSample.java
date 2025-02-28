package com.basiccodings.threads;

public class ThreadsSample extends Thread {
	public void run() {
		int a = 10;
		int b = 12;
		int result = a + b;
		System.out.println("Thread started running..");
		System.out.println("Sum of two numbers is: " + result);
	}

	public static void main(String args[]) {
		ThreadsSample t1 = new ThreadsSample();
		t1.start();
	}
}
