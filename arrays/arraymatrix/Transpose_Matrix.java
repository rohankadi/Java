package com.kn.arraymatrix;

public class Transpose_Matrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] brr = new  int[arr.length][arr.length];

		//code transpose matrix
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				brr[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Printing Matrix Before Transpose:");  
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Printing Matrix After Transpose:");  
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
