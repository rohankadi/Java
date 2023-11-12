/*
 * Thread has 02 approaches.
 * 1. extending Thread
 * 2. implementing Runnability
 */

//1. extending thread
package com.rk.multithreading.extendingThreadApproach;

import java.util.Scanner;

public class Banking extends Thread {

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
		scan.close();
	}
}
