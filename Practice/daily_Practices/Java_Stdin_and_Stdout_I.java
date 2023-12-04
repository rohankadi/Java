package com.kn.daily_Practices;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_I {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 03 values : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		scan.close();;
	}
}
