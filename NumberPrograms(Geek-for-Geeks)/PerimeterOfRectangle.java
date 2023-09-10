package com.kn.javaNumberPrograms;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a length of a rectangle = ");
		int a = scan.nextInt();
		System.out.println("Enter a Width of a rectangle = ");
		int b = scan.nextInt();
		
		System.out.println("Perimeter of rectangle is = " + perimeterOfRectangle(a, b));
		scan.close();
	}

	public static int perimeterOfRectangle(int a, int b) {
		int perimeter = 2*(a+b);
		return perimeter;
	}

}
