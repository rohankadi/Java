package com.rk.multithreadingInSameClassWithInterface;

public class MultiThreadDemo {
	public static void main(String[] args) {
		
	Product p = new Product();
	
	
	Thread t1 = new Thread(p);
	Thread t2 = new Thread(p);
	Thread t3 = new Thread(p);
	
	t1.setName("bank");
	t2.setName("add");
	t3.setName("print");
	
	t1.start();
	t2.start();
	t3.start();
	
	}
}
