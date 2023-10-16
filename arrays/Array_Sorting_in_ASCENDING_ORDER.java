package com.kn.array;

public class Array_Sorting_in_ASCENDING_ORDER {

	public static void main(String[] args) {
		// Declaration Creation and Initialization
		int[] arr = new int[] { 70, 10, 5, -50, 90, 80 };

		System.out.println("Array after sorting in Ascending order : ");
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				int temp = 0;
				if (arr[i] > arr[j]) { //If I make (arr[i] < arr[j]) then the array sort in DESCENDING MANNER
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	}
}
