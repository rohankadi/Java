//Currency will be given as I/p in INR. To tell the Equivilant form of US Dollar and Pound.
package ControlConstructor;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Currency in INR ");
		int currency = scan.nextInt();

		System.out.println("The INR value in USD is = " + inrToUsd(currency));
		System.out.println("The INR value in Pound is = " + inrToPound(currency));

	}

	static double inrToUsd(int currency) {
		return currency * 0.012;
	}

	static double inrToPound(int currency) {
		return currency * 0.0095;
	}

}
