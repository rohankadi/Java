package com.rk.Exception_Propogation;

import java.util.Scanner;

public class Alpha {

	public void division() {
		System.out.println("Connection Established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 02 numbers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a / b;
		
		System.out.println(c);
		scan.close();
		System.out.println("Connection Terminated");
	}
}
