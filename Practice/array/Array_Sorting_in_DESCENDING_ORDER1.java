package com.kn.array;

import java.util.Arrays;

public class Array_Sorting_in_DESCENDING_ORDER1 {

	public static void main(String[] args) {

		int[] arr = new int[] { 70, 50, 10, 5, 90, 80, 60 };

		// Array Sorting in Ascending order
		Arrays.sort(arr);

		System.out.println("Array after sorting in Descending order : ");
		// Reverse that Sorted array while traversing
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
