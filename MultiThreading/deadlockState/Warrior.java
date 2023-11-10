package com.rk.deadlockState;

public class Warrior implements Runnable {

	/*
	 DEAD STATE => Program will never ends
	   It is a situation in multithreading, where 02 or more threads are in blocked state
	 */
	
	
	String astra1 = "Sarpastra";
	String astra2 = "Bhrahmastra";
	String astra3 = "Pashupatastra";

	@Override
	public void run() {

		if(Thread.currentThread().getName().equals("karna")) {
			karnaAcquireResource();
		}
		else {
			arjunAcquireResource();
		}
	}

	public void karnaAcquireResource() {
		try {
			Thread.sleep(2000);

			synchronized (astra1) {
				System.out.println(Thread.currentThread().getName() + " Acquires " + astra1);
				Thread.sleep(2000);
				
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName() + " Acquires " + astra2);
					Thread.sleep(2000);
					
					synchronized (astra3) {
						System.out.println(Thread.currentThread().getName() + " Acquires " + astra3);
						Thread.sleep(2000);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void arjunAcquireResource() {
		try {
			Thread.sleep(2000);

			synchronized (astra3) {
				System.out.println(Thread.currentThread().getName() + " Acquires " + astra3);
				Thread.sleep(2000);
				
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName() + " Acquires " + astra2);
					Thread.sleep(2000);
					
					synchronized (astra1) {
						System.out.println(Thread.currentThread().getName() + " Acquires " + astra1);
						Thread.sleep(2000);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}