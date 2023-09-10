package ControlConstructor;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Fahrenheit Temp = ");
		double F = scan.nextDouble();

		double celcius = toCelcius(F);
		System.out.println("The Temperature in Celcius is " + celcius);

		scan.close();
	}

	public static double toCelcius(double F) {
		return ((F - 32) * 5) / 9;
	}
}