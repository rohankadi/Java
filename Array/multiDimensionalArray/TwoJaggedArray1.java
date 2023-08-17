package com.kn.multiDimensionalArray;

import java.util.Scanner;

public class TwoJaggedArray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the Size of an Array = ");
		int size1 = scan.nextInt();
		int[][] arr = new int[size1][];

		for(int i=0; i<size1; i++) {
			System.out.print("Enter the element " + (i+1) + " size = ");
			arr[i] = new int[scan.nextInt()];
		}


		// Array Initialization
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		arr[0][3] = 40;
//		arr[1][0] = 50;
//		arr[1][1] = 60;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter the Integer Data for element " + (i + 1) + " : ");
				arr[i][j] = scan.nextInt();
			}
		}

		scan.close();
		System.out.println("**********************");
		// Array Traversing
//				System.out.println(arr[0][0]);
//				System.out.println(arr[0][1]);
//				System.out.println(arr[0][2]);
//				System.out.println(arr[0][3]);
//				System.out.println(arr[1][0]);
//				System.out.println(arr[1][1]);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

}
