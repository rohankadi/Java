package com.kn.daily_Practices;

import java.util.Scanner;

public class Java_If_Else {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num = ");
		int N = scan.nextInt();
		
		if (N % 2 == 0) {
			if (N >= 2 && N <= 5) { // Inclusive condition
				System.out.println("Not Weird");
			} else if (N >= 6 && N <= 20) {
				System.out.println("Weird");
			} else if (N > 20) {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Weird");
		}

		scan.close();
	}

}
