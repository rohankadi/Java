package com.kn.daily_Practices;

import java.util.Scanner;

public class Java_Output_Formatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter String value = ");
			String s1 = sc.next();
			System.out.println("Enter an Integer value = ");
			int x = sc.nextInt();
			
			// Complete this line
			System.out.printf("%-15s%03d\n", s1, x);
		}
		System.out.println("================================");
		sc.close();
	}

}
