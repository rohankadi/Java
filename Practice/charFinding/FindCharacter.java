//Java Program to get a character from a String
package com.kn.charFinding;

import java.util.Scanner;

public class FindCharacter {

	public static void main(String[] args) {
		/*
		 * String msg = "Welcome to Java Programming";
		 * 
		 * char a = msg.charAt(4); System.out.println(a);
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a character index : ");
		int index = scan.nextInt();
		System.out.println("Enter a Messsage : ");
		char msg = scan.next().charAt(index);

		System.out.println(msg);
		scan.close();
	}

}
