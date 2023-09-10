package ControlConstructor;

import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a First Num: ");
		int a = scan.nextInt();
		System.out.println("Enter a Second Num: ");
		int b = scan.nextInt();
		
		System.out.println("Choose an Operation (+, -, *, /)");
		char c = scan.next().charAt(0);
		
		if (c == '+') {
			System.out.println("Addition " + a + "+" + b + " = " + (a+b));
		}else if(c == '-') {
			System.out.println("Subtraction " + a + "-" + b + " = " + (a-b));
		}else if(c == '*') {
			System.out.println("Multiplication "+ a + "*" + b + " = " + + (a*b));
		}else if(c == '/') {
			System.out.println("Division " + a + "/" + b + " = " + (a/b));
		}else {
			System.out.println("Invalid Number");
		}
		scan.close();
		
	}
}
