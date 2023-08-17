//WAP to accept an array from the user and find maximum and minimum number.
package com.kn.binarysearch;

import java.util.Scanner;

public class MaxMinElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Decalaration, creation and Initialization
		// int[] arr = { 15, 16, 6, 8, 5 };

		// Decalaration and Creation
		System.out.print("Enter the Size of an array = ");
		int size = scan.nextInt();
		int[] arr = new int[size];

		// Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the data for element " + (i + 1) + " : ");
			arr[i] = scan.nextInt();
		}

		System.out.println("===========================================");

		// Printing elements Before sorting
		System.out.println("Before Sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		// bubble sorting
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++)
			// for(int j=0; j<arr.length-1-i; j++)
			// i--> is used to ignore the multiple iterations of a sorting elements.
			{
				int temp = 0;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}
		
		System.out.println();
		
		// Array Traversing
		System.out.println("After sorting : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		// Array Traversing
		int minimum = arr[0];
		int maximum = arr[arr.length - 1];
		System.out.println("Minimum Value = " + minimum + " ");
		System.out.print("Maximum Value = " + maximum);
	}
}
