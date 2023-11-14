package com.rk.multithreading.implementsRunnable;

import java.util.Scanner;
//02nd approach => Runnable Interface
public class Banking implements Runnable{

	@Override
	public void run() {
		System.out.println("Banking activity started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String name = scan.next();
		System.out.println("Enter Password : ");
		String pwd = scan.next();
		System.out.println("Collect your money");
		System.out.println("Banking activity ended");
	}

	
}
