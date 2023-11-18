package com.kn.patterns;

import java.util.Scanner;

public class Solid_Pattern_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Here, we have taken the value from the user.
		System.out.println("Enter number of rows & columns to be created : ");
		int n = scan.nextInt();

		printSquare(n);
		scan.close();
	}

	public static void printSquare(int n) {
		// This is the outer loop which will loop for the rows.
		for (int i = 1; i <= n; i++) {
			// This is the inner loop which loops for the columns
			// no. of columns = row number for each line here.
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			// As soon as stars for each iteration are printed, we move to the
			// next row and give a line break otherwise all stars
			// would get printed in 1 line.
			System.out.println();

		}
	}
}
