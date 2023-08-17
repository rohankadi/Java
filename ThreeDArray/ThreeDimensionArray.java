package com.kn.ThreeDArray;

import java.util.Scanner;

public class ThreeDimensionArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration
		int[][][] arr;
		// Array Creation
		arr = new int[2][2][2];
		
		// Array initialization
		System.out.println("Enter data : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		// Array Traversing
		System.out.println("Array Elements are as follows : ");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			
			{
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
			}
		}
		scan.close();

	}

}
