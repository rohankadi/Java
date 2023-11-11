package com.rk.OneResourceMultipleThreads;

public class Bathroom2 implements Runnable{
	//applying lock to resource until it completes execution => synchronized
	@Override
	synchronized public void run(){
		try {
		System.out.println(Thread.currentThread().getName() + " IS ENTERED BATHROOM");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " IS USING BATHROOM");
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " IS LEAVING BATHROOM");
		Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
