package ControlConstructor;

import java.util.Scanner;

public class FindQuetioentAndReminder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Dividend Number = ");
		int num1= scan.nextInt();
		System.out.println("Enter the Divisor Number = ");
		int num2 = scan.nextInt();
		
    	double que = num1/num2;
    	System.out.println("The Quetieont of " + num1 + " after divisible by " + num2 + " is = " + que);
    	double rem = num1%num2;
    	System.out.println("The Reminder of " + num1 + " after divisible by " + num2+ " is = " + rem);
    	scan.close();
	}
}
