//W A P to check eligibility for voting.
package ControlConstructor;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age = ");
		int Age = scan.nextInt();
		

		if (Age >= 18) {
			System.out.println("You are Eligible for Voting");
		}

		else {
			System.out.println("You are Not Eligible for Voting");
		}
		
		//imp to close scan
		scan.close();

	}
}