package com.rk.multithreading.extendingThreadApproach;

public class Addition extends Thread{
	@Override
	public void run(){
		try {
		System.out.println("Addition activity started");
		int a = 1234;
		int b = 9876;
		//temporarily stops execution
		Thread.sleep(5000);
		
		int c = a+b;
		System.out.println("Addition result is "+ c);
		System.out.println("Addition activity ended");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
