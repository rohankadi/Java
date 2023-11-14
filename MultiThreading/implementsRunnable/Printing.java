package com.rk.multithreading.implementsRunnable;

public class Printing implements Runnable{

	@Override
	public void run() {
		System.out.println("Printing activity started");
		for(int i=0; i<=4; i++) {
			System.out.println("KODNEST");
			try {
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing activity ended");	
		
	}

}
