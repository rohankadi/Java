package com.rk.stackTrace;

import java.util.Scanner;

public class Demo1 {

	void division() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 02 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = a / b;
		System.out.println(c);
		
		System.out.println("Enter Array Size : ");
		int[] arr = new int[scan.nextInt()];
		System.out.println(arr.length);
		scan.close();
	}
}
