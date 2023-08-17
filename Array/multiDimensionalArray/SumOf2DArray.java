package com.kn.multiDimensionalArray;

import java.util.Scanner;

public class SumOf2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration and Creation
		System.out.println("Enter the data for size-1= ");
		int size1 = scan.nextInt();
		System.out.println("Enter the data for size-2= ");
		int size2 = scan.nextInt();
		int[][] arr = new int[size1][size2];
		int[][] brr = new int[size1][size2];

		// Initialization
		System.out.println("Enter the elements = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				brr[i][j] = scan.nextInt();
			}
		}

		additionOfBothArays(arr, brr);
		
	}

	public static void additionOfBothArays(int[][] arr, int[][] brr) {
		Scanner scan = new Scanner(System.in);
		int[][] crr = new int[arr.length][arr[0].length];
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0;j < crr[i].length; j++) {
				System.out.println("Addition of Both the arrays = "+ (crr[i][j] = (arr[i][j] + brr[i][j])));
			}
		}
		scan.close();
	}
}
