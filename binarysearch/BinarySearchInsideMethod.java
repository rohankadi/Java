package com.kn.binarysearch;

import java.util.Scanner;

public class BinarySearchInsideMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaration , Creation and Initialization
		// int[] arr = {10, 20, 25, 30, 45, 50, 60, 70, 75, 80, 90};

		// Declaration and creation
		System.out.print("Enter the Size of an Array = ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		// Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the data for element " + (i + 1) + " : ");
			arr[i] = scan.nextInt();
		}

		// Taking element to be found
		System.out.print("Enter the element is to be found = ");
		int element = scan.nextInt();

		elementPresence(arr, element);
	}

	private static void elementPresence(int[] arr, int element) {
		int position = -1; //there is no position for -1
		int low = 0;
		int high = arr.length - 1;
		boolean isElementFound = false;

		// Condition to check the presence of an element.
		while (low <= high) {
			int mid = (low + high) / 2;
			if (element == arr[mid]) {
				isElementFound = true;
				position = mid + 1;
				break;
			}

			else if (element > arr[mid]) {
				low = mid + 1;
				high = high;
			}

			else {
				high = mid - 1;
				low = low;
			}
		}

		System.out.println("--------------------------------------");
		if (isElementFound == false) {
			System.out.println("The Element is not found");
		} else {
			System.out.println("The element " + element + " is found at Position : " + position);
		}
	}
}
