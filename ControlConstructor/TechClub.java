//WAP to welcome the students who's marks are above 90 to the TechClub.
package ControlConstructor;

import java.util.Scanner;

public class TechClub {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Marks = ");
		int marks = scan.nextInt();
		
		if (marks >= 90) {
			System.out.println("You are Welcome to TechClub ");
		}
		//imp to close scan
		scan.close();
	}
}
