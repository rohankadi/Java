package com.kn.multiDimensionalArray;

import java.util.Scanner;

public class PrintFriendsNameUsingTwoJaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration and Creation
		System.out.println("Enter the size 1 of array = ");
		String[][] arr = new String[scan.nextInt()][];
		
//		arr[0] = new String[5];
//		arr[1] = new String[4];
//		arr[2] = new String[3];
//		arr[3] = new String[2];
		
		//Array Initialization
		arr[0][0] = "Rohan ";
		arr[0][1] = "Pruthvi ";
		arr[0][2] = "Suraj ";
		arr[0][3] = "Ganesh ";
		arr[0][4] = "Rehaman ";
		
		arr[1][0] = "Vikas ";
		arr[1][1] = "Nandan ";
		arr[1][2] = "Pramod ";
		arr[1][3] = "Mohan";
		
		arr[2][0] = "Surjit ";
		arr[2][1] = "Vilas ";
		arr[2][2] = "Gabbar ";
		
		arr[3][0] = "Tony ";
		arr[3][1] = "Moni ";
		
		
		//Array Traversing
		for(int i=0; i<arr.length; i++) {
			System.out.println("-----------------------------");
			System.out.println("Friends list From A"+ (i+1) + " class");
			for(int j=0; j<arr[i].length; j++) {
				System.out.println((j+1) +" Friend name is = "+ arr[i][j]);
			}
		}

	}

}
