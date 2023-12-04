package com.kn.daily_Practice;

import java.util.Scanner;

public class Java_Static_Initializer_Block {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Width = ");
		int B = sc.nextInt();
		System.out.println("Height = ");
		int H = sc.nextInt();
		
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			System.out.println("Area = " +  B * H);
		}
		sc.close();
	}

}
