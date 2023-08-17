package com.kn.arrays;

import java.util.Scanner;

public class PresentInArrayOrNot {

	public static void main(String[] args) {
		// declaration, creation and initialization
		int[] arr = { 34, 98, 77, 49, 52 };

		// method calling
		numIsPresentOrNot(arr);

	}

	public static void numIsPresentOrNot(int[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int num = scan.nextInt();
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == num) {
				System.out.println("The Num "+ num +" is Present in Array");
			}
			else {
				System.out.println("Not Present in Array");
			}
		}
		scan.close();
	}

}
