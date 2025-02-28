package com.basiccodings.threads;

class CakeCounterLogic {
	int cakecount = 0;

	public synchronized void increment() {
		cakecount++;
	}
}

class Team implements Runnable {
	CakeCounterLogic counter;

	Team(CakeCounterLogic counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increment();
		}
	}
}

public class CakeCounter {
	public static void main(String[] args) {
		CakeCounterLogic counter = new CakeCounterLogic();
		Thread team1 = new Thread(new Team(counter), "Team-1");
		Thread team2 = new Thread(new Team(counter), "Team-2");

		team1.start();
		team2.start();

		try {
			team1.join();
			team2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final cake count: " + counter.cakecount);
	}
}
