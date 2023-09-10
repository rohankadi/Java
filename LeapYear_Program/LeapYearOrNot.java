package com.kn.leapYear;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year = ");
		int year = scan.nextInt();
		
		boolean result = isLeap(year);
		if(result) {
			System.out.println(year + " is a  Leap Year");
		}
		else {
			System.out.println(year + " is not a  Leap Year");
		}
		scan.close();
	}

	public static boolean isLeap(int year) {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				}
			}
		}
		return false;
	}

}
