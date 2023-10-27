package com.kn.encapsulation;

import java.util.Scanner;

public class KGclassDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		double a = scan.nextDouble();

		KGclass c1 = new KGclass();

		System.out.println(c1.getA());
		c1.setA(a);

		scan.close();

	}

}
