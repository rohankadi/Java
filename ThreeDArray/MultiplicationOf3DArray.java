package com.kn.ThreeDArray;

import java.util.Scanner;

public class MultiplicationOf3DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Declaration and Creation
		System.out.println("Enter the Size of Element 1 = ");
		int size1 = scan.nextInt();
		System.out.println("Enter the Size of Element 2 = ");
		int size2 = scan.nextInt();
		System.out.println("Enter the Size of Element 3 = ");
		int size3 = scan.nextInt();

		int arr[][][] = new int[size1][size2][size3];
		int brr[][][] = new int[size1][size2][size3];
		int crr[][][] = new int[size1][size2][size3];

		// Initialization
		System.out.println("Enter a Data = ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}

		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				for (int k = 0; k < brr[i][j].length; k++) {
					brr[i][j][k] = scan.nextInt();
				}
			}
		}

		multiPlicationOfArray(arr, brr, crr);
	}

	public static void multiPlicationOfArray(int[][][] arr, int[][][] brr, int[][][] crr) {
		System.out.print("Multiplication is : ");
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				for (int k = 0; k < brr[i][j].length; k++) {
					System.out.print(arr[i][j][k] * brr[i][j][k] + " ");
				}
			}
		}
	}
}
