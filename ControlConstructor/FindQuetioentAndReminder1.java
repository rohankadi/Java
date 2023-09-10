package ControlConstructor;

import java.util.Scanner;

public class FindQuetioentAndReminder1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Dividend Number = ");
		double num1 = scan.nextDouble();
		System.out.print("Enter the Divisor Number = ");
		double num2 = scan.nextDouble();

		System.out.println(
				"The Quetieont of " + num1 + " after divisible by " + num2 + " is = " + queOfGivenNum(num1, num2));
		System.out.println(
				"The Reminder of " + num1 + " after divisible by " + num2 + " is = " + remOfGivenNum(num1, num2));
		scan.close();
	}

	static double queOfGivenNum(double num1, double num2) {
		return num1 / num2;
	}

	private static double remOfGivenNum(double num1, double num2) {
		return num1 % num2;
	}
}
