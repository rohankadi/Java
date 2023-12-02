package com.kn.javaNumberPrograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number = ");
		int num1 = scan.nextInt();
		System.out.println("Enter a second number = ");
		int num2 = scan.nextInt();
		System.out.println("Enter a third number = ");
		int num3 = scan.nextInt();
		
		int result = largestNumber(num1, num2, num3);
		System.out.println("Largest number is : " + result);

		scan.close();
	}

	public static int largestNumber(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3) {
			return num1;
		}
		else if(num2 > num3 && num2 > num1) {
			return num2;
		}
		else {
			return num3;
		}
	}
}
