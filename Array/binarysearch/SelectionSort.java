package com.kn.binarysearch;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       int[] arr = { 48, 32, 16, 29, 72, 44, 63 };
		
		

		System.out.println("Before Sorting : ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) 
		{
			int min = arr[i];
			int index = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}

			// Swaping min element
//			arr[index] = arr[i];
//			arr[i] = min;

			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
		System.out.println();
		System.out.println("Sorted array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
