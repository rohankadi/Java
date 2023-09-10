package ControlConstructor;

import java.util.Scanner;

public class MethodOperation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a First Number: ");
		double a = scan.nextDouble();
		System.out.println("Enter a Second Number: ");
		double b = scan.nextDouble();
		double ans = 0;

		System.out.println("Choose an Operation (+, -, *, /)");
		char c = scan.next().charAt(0);

		double result = operation(a, b, c, ans);
		System.out.println("The Result is " + result);
		scan.close();
	}

	static double operation(double a, double b, char c, double ans) {
		if (c == '+') {
			ans = (a + b);
			// System.out.println(a+b);
		} else if (c == '-') {
			ans = (a - b);
		} else if (c == '*') {
			ans = (a * b);
		} else if (c == '/') {
			ans = (a / b);
		} else {
			System.out.println("Invalid");
		}
		return ans;
	}
}
