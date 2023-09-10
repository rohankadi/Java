package ControlConstructor;

import java.util.Scanner;

public class SocialNetworkingSite {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your First Name : ");
		String firstName = scan.nextLine();

		System.out.println("Enter your Middle Name : ");
		String middleName = scan.nextLine();

		System.out.println("Enter your Last Name : ");
		String lastName = scan.nextLine();

		String fullName = joinStrings("Your FullName is " + " '" + firstName, middleName, lastName + "' ");
		System.out.println(fullName);
		scan.close();
	}

	static String joinStrings(String firstName, String middleName, String lastName) {
		String concat = firstName + " " + middleName + " " + lastName;
		return concat;
	}
}
