package com.kn.multiDimensionalArray;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//Array Declaration
		int[][] arr;
		//Array Creation
		arr = new int [2][3];
         
		//Array Initialization
		arr[0][0] = 70;
		arr[0][1] = 85;
		arr[0][2] = 75;
		arr[1][0] = 35;
		arr[1][1] = 45;
		arr[1][2] = 25;
		
		//Array Traversing
		//Nested Loop
		for(int i=0; i<arr.length; i++) {
			System.out.println("Student " + (i+1) + " Data : ");
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Subject " + (j+1) + " marks = " + arr[i][j]);
			}
		}
	}

}
