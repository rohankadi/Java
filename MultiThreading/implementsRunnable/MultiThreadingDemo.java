package com.rk.multithreading.implementsRunnable;

public class MultiThreadingDemo {
	//02nd approach => Runnable Interface
	public static void main(String[] args) {

		Banking bank = new Banking();
		Addition add = new Addition();
		Printing print = new Printing();

		Thread t1 = new Thread(bank);
		Thread t2 = new Thread(add);
		Thread t3 = new Thread(print);

		t1.start();
		t2.start();
		t3.start();

	}
}
