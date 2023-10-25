package com.kn.arraymatrix;

import java.util.Scanner;

public class MultiplicationOf02Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 1st Matrix = ");
		
		int[][] arr = new int[3][3];
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
		
		int[][] crr = new int[3][3];
		System.out.print("Multiplication of 02matrix is = ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				crr[i][j] = 0;
				
				for(int k=0; k<arr.length; k++) 
				{
				//crr[i][j] += arr[i][k] * brr[k][j];
				crr[i][j] = crr[i][j] + arr[i][k] * brr[k][j];
				}
				System.out.println(crr[i][j] + " ");	
			}
			System.out.println();
		}

		scan.close();
	}

}
