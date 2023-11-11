package com.rk.demonstrationOfBlockedState;

public class Warrior implements Runnable {

	String astra1 = "Sarpastra";
	String astra2 = "Bhrahmastra";
	String astra3 = "Pashupatastra";

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("karna")) {
			karnaAquireResource();
		}
		else {
			arjunaAquireResource();
		}
	}

	public void karnaAquireResource() {
		try {
			// Tapassu
			Thread.sleep(5000);

			// astra-1 locked
			synchronized (astra1) {
				// astra-1 unlocked
				System.out.println(Thread.currentThread().getName() + " Aquired " + astra1);
				Thread.sleep(5000);
				
				 // astra-2 locked
				synchronized (astra2) {
					// astra-2 unlocked
					System.out.println(Thread.currentThread().getName() + " Aquired " + astra2);
					Thread.sleep(5000);
				}
				
				 // astra-3 locked
				synchronized (astra3) {
					// astra-3 unlocked
					System.out.println(Thread.currentThread().getName() + " Aquired " + astra3);
					Thread.sleep(5000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void arjunaAquireResource() {
		try {
			Thread.sleep(5000);
			
			synchronized (astra1) {
				System.out.println(Thread.currentThread().getName() + " Aquired " + astra1);
				Thread.sleep(5000);
				
				synchronized (astra2) {
					System.out.println(Thread.currentThread().getName() + " Aquired " + astra2);
					Thread.sleep(5000);
				}
				
				synchronized (astra3) {
					System.out.println(Thread.currentThread().getName() + " Aquired " + astra3);
					Thread.sleep(5000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
