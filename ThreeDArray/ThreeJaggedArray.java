package com.kn.ThreeDArray;

import java.util.Scanner;

public class ThreeJaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration and Creation
		int[][][] arr = new int[2][][];
		arr[0] = new int[1][];
		arr[1] = new int[2][];
 
		arr[0][0] = new int[2];
		arr[1][0] = new int[3];
		arr[1][1] = new int[2];
		

		// Array Initialization
		System.out.println("Enter the Data for Array Elements : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		
		//Array Traversing
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}

	}

}
