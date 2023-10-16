package com.kn.array;

import java.util.Scanner;

public class Largest_ElementInAnArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaration and creation
		System.out.print("Enter the Size of an Array = ");
		int[] arr = new int[scan.nextInt()];

		// Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the integer data for the element " + (i + 1) + " : ");
			arr[i] = scan.nextInt();
		}
		
		// Initialize maximum element
		int max = arr[0];

		// Method calling
		int result = PresentInArrayOrNot(max, arr);
		System.out.println("Largest Element in a given array is '" + result + "'");

		scan.close();
	}

	public static int PresentInArrayOrNot(int max, int[] arr) {
	// Traverse array elements from second and compare every element with current max
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

}
