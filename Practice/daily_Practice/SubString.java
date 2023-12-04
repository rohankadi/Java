package com.kn.daily_Practice;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a Message : ");
		String s = scan.nextLine();
		System.out.println("Enter Starting inclusive index : ");
		int start = scan.nextInt();
		System.out.println("Enter Ending exclusive index : ");
		int end = scan.nextInt();

		System.out.println(s.substring(start, end));
		
		
		scan.close();
	}
}
