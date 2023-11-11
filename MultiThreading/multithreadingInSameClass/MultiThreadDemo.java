package com.rk.multithreadingInSameClass;

public class MultiThreadDemo {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		p1.setName("bank");
		p2.setName("add");
		p3.setName("print");
		
		
		p1.start();
		p2.start();
		p3.start();
		
		
	}
}
