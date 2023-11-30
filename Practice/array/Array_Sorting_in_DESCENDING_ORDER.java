package com.kn.array;

import java.util.Scanner;

public class Array_Sorting_in_DESCENDING_ORDER {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Declaration and Creation
		System.out.print("Enter the Size of an Array = ");
		int[] arr = new int[scan.nextInt()];

		// Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a Element " + (i + 1) + " of an array = ");
			arr[i] = scan.nextInt();
		}

		// Array Traversing
		System.out.println("Array after sorting in Descending order : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				int temp = 0;

				if (arr[i] < arr[j]) {
				//if (arr[i] != arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	scan.close();
	}

}
