package com.kn.arraymatrix;

import java.util.Scanner;

public class SubtractionOfMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 1st Matrix = ");
		//creation
		//taking 2D Array
		int[][] arr = new int[3][3];
		//Initialization
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Enter a 2nd Matrix = ");
		int[][] brr = new int[3][3];
		for(int i=0; i<brr.length; i++) {
			for(int j=0; j<brr[i].length; j++) {
				brr[i][j] = scan.nextInt();
			}
			System.out.println();
		}
		
		//reprinting of Matrix-1
		System.out.println("Matrix-01 is : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix-02 is : ");
		for(int i=0; i<brr.length; i++) {
			for(int j=0; j<brr[i].length; j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
		
		//declaration
		int[][] crr = new int[3][3];
		System.out.println("Matrix Sub is = ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//subtraction of 2matrix
				crr[i][j] = arr[i][j] - brr[i][j];
				//System.out.print(arr[i][j] + " + " + brr[i][j] + " = "+ crr[i][j]);
				System.out.print(crr[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();

	}

}