//Marks of a Student
package ControlConstructor;

import java.util.Scanner;

public class MarksOfStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Marks: ");
		int marks = scan.nextInt();

		if (marks > 90) {
			System.out.println("A Grade");
		} else if (marks >= 75 && marks < 90) {
			System.out.println("B Grade");
		} else if (marks >= 50 && marks < 75) {
			System.out.println("C Grade");
		} else if (marks >= 35 && marks < 50) {
			System.out.println("D Grade");
		} else {
			System.out.println("One More Attempt");
		}
	}
}
