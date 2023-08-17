//Taking input from user
package com.kn.multiDimensionalArray;

import java.util.Scanner;

public class MultiDimensionalArray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaration and creation
		System.out.print("Enter the number of Students = ");
		int size1 = scan.nextInt();
		System.out.print("Enter the number of subjects per student = ");
		int size2 = scan.nextInt();

		int[][] arr = new int[size1][size2];

		// Initialization
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		arr[1][0] = 40;
//		arr[1][1] = 50;
//		arr[1][2] = 60;
//		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Student " + (i + 1) + " Data : ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Subject " + (j + 1) + " marks = ");
				arr[i][j] = scan.nextInt();
			}
		}
		scan.close();

		print2DArray(arr);

	}

	// Print 2D Array
	public static void print2DArray(int[][] arr) {
		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("=================================");
			System.out.println("Student " + (i + 1) + " Data : ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Student from A" + (i + 1) + " Batch marks = " + arr[i][j]);
			}
		}
	}
}
