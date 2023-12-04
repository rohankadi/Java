package com.kn.daily_Practices;

import java.util.Scanner;

public class Java_Loops_II {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a value = ");
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int j = 1; j <= n; j++) {
				a = a + b;
				System.out.print(a + " ");
				b = b * 2;
			}
			System.out.println();
		}
		in.close();
	}

}
