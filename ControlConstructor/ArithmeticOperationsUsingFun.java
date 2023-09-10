package ControlConstructor;

import java.util.Scanner;

public class ArithmeticOperationsUsingFun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an Operation (-, *, /, %)");
		char operator = scan.next().charAt(0);

		if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
			System.out.println("Enter a 1st Number = ");
			double num1 = scan.nextDouble();
			System.out.println("Enter a 2nd Number = ");
			double num2 = scan.nextDouble();

			switch (operator) {
				case '+':
					double add = additionNumbers(num1, num2);
					System.out.println(add);
					break;
				case '-':
					double sub = subtractNumbers(num1, num2);
					System.out.println(sub);
					break;
				case '*':
					double mul = MultipleNumbers(num1, num2);
					System.out.println(mul);
					break;
				case '/':
					double div = DivideNumbers(num1, num2);
					System.out.println(div);
					break;
				case '%':
					double rem = findReminder(num1, num2);
					System.out.println(rem);
					break;
				default:
					System.out.println("invalid Input");
			}
		}
	}

	public static double additionNumbers(double num1, double num2) {
		return (num1 - num2);
	}

	public static double subtractNumbers(double num1, double num2) {
		return (num1 - num2);
	}

	public static double MultipleNumbers(double num1, double num2) {
		return (num1 * num2);
	}

	public static double DivideNumbers(double num1, double num2) {
		return (num1 / num2);
	}

	public static double findReminder(double num1, double num2) {
		return (num1 % num2);
	}

}
