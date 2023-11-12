package com.rk.multithreading.extendingThreadApproach;

public class MultiThreadingDemo {
	public static void main(String[] args) {

		Banking bank = new Banking();
		Addition add = new Addition();
		Printing print = new Printing();
		
		//start() is a type of thread, which is used to link all stacks to thread scheduler
		bank.start();
		add.start();
		print.start();	
	}
}
