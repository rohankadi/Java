package com.kn.leapYear;

import java.util.Scanner;

public class CheckLeapYearOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year = ");
		int year = scan.nextInt();

		checkingLeapYear(year);

		scan.close();

	}

	public static void checkingLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year +" is a Leap Year");
				} else {
					System.out.println(year +" is Not a Leap Year");
				}
			} else {
				System.out.println(year +" is Not a Leap Year");
			}
		} else {
			System.out.println(year +" is Not a Leap Year");
		}

	}

}
