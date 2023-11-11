package com.rk.multithreadingInSameClass;

import java.util.Scanner;

public class Product extends Thread{

	@Override
	public void run() {
		
		if(Thread.currentThread().getName().equals("bank")) {
			banking();
		}
		else if(Thread.currentThread().getName().equals("add")) {
		     addition();
		}
		else {
			printing();
		}
		
	}
	
	//01
	public void banking() {
		System.out.println("Banking activity started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String name = scan.next();
		System.out.println("Enter Password : ");
		String pwd = scan.next();
		System.out.println("Collect your money");
		System.out.println("Banking activity ended");
	}
	
	//02
	public void addition(){
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
	
	//03
	public void printing() {
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
