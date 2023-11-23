package com.kn.string;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int mark1 = scanner.nextInt();
		int mark2 = scanner.nextInt();
		int mark3 = scanner.nextInt();
		
		avg(mark1,mark2,mark3);
		
		scanner.close();
	}

	private static void avg(int mark1, int mark2, int mark3) {
		int avg = (mark1 + mark2 + mark3) /3;
		System.out.println(avg);
		
	}

}
