package com.rk.threading;

import java.util.Scanner;

public class SingleThreading {

	public static void main(String[] args) throws InterruptedException {
		//SUBTASK-1
		System.out.println("Banking activity started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String name = scan.next();
		System.out.println("Enter Password : ");
		String pwd = scan.next();
		System.out.println("Collect your money");
		System.out.println("Banking activity ended");
		
		
		//SUBTASK-2
		System.out.println("Addition activity started");
		int a = 1234;
		int b = 9876;
		//temporarily stops execution
		Thread.sleep(5000);
		
		int c = a+b;
		System.out.println("Addition result is "+ c);
		System.out.println("Addition activity ended");
		
		//SUBTASK-3
		System.out.println("Printing activity started");
		for(int i=0; i<=4; i++) {
			System.out.println("KODNEST");
			Thread.sleep(5000);
		}
		System.out.println("Printing activity ended");	
	}
}
