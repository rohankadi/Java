package com.kn.arraymatrix;

import java.util.Scanner;

public class ArrayRotation_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] brr = { 11, 12, 13, 14, 15 };
		int[] crr = new int[arr.length + brr.length];
		
		int[] drr = merging(arr, brr, crr);
		for(int i=0; i<drr.length; i++) {
			System.out.print(drr[i] + " ");
		}

		scan.close();
	}

	private static int[] merging(int[] arr, int[] brr, int[] crr) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < crr.length; i++) {
			if(i % 2 == 0) {
				crr[i] = arr[a];
				a++;
			}
			else {
				crr[i] = brr[b];
				b++;
			}
		}
		return crr;
	}


	}
