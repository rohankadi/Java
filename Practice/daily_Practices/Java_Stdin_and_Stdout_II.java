package com.kn.daily_Practices;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer value = ");
		int i = scan.nextInt();
		System.out.println("Enter Double value = ");
		double d = scan.nextDouble();
		scan.nextLine();
		System.out.println("Enter String value = ");
		String s = scan.nextLine();
		scan.close();
		
		// Write your code here.
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
