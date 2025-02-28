package com.basiccodings.threads;

public class CakeInterfacess implements Runnable {

	public void run() {
		System.out.println("Mixing ingredient for cake " + Thread.currentThread().getId());
		System.out.println("Baking cake " + Thread.currentThread().getId());
		System.out.println("Decorating cake " + Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			CakeInterfacess obj = new CakeInterfacess();
			Thread thread = new Thread();
			thread.start();
		}
	}

}
