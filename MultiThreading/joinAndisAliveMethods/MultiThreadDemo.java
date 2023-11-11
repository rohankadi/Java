package com.rk.joinAndisAliveMethods;

public class MultiThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main activity starteed and resources are allocated");
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		p1.setName("bank");
		p2.setName("add");
		p3.setName("print");
		
		
		p1.start();
		p2.start();
		p3.start();
		
		//isAlive() method of Thread class type is used to check 
		//whether the thread is running or has completed it's and dead
		System.out.println(p1.isAlive()); //true
		System.out.println(p2.isAlive()); //true
		System.out.println(p3.isAlive()); //true
		
		//join() methods is used to make a thread wait for another thread
		//until it completes and joins the currently execution thread
		p1.join();
		System.out.println("P1 ALIVE ?" + p1.isAlive());
		p2.join();
		System.out.println("P2 ALIVE ?" + p2.isAlive());
		p3.join();
		System.out.println("P3 ALIVE ?" + p3.isAlive());
				
		System.out.println("Main activity ended and resources are deallocated");

	}
}
