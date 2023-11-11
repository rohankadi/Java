package com.rk.OneResourceMultipleThreads;

public class Bathroom implements Runnable{

	@Override
	public void run(){
		try {
		System.out.println(Thread.currentThread().getName() + " IS ENTERED BATHROOM");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + " IS USING BATHROOM");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName() + " IS LEAVING BATHROOM");
		Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
