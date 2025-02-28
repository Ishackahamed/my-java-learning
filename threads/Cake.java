package com.basiccodings.threads;

public class Cake extends Thread {

	public void run() {
		System.out.println("Mixing ingredient for cake " + Cake.currentThread().getId());
		System.out.println("Baking cake " + Cake.currentThread().getId());
		System.out.println("Decorating cake " + Cake.currentThread().getId());
	}

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			Cake obj = new Cake();
			// obj.run();
			obj.start();
		}
	}

}
