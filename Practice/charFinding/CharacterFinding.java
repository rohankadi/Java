package com.kn.charFinding;

import java.util.Scanner;

public class CharacterFinding {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Messsage : ");
		String msg = scan.nextLine();
		
		System.out.print("Enter a character index : ");
		int index = scan.nextInt();
		
		char c = indexCharFinding(msg, index);
		System.out.println(c);

		scan.close();
	}
	
	 // Function to get the specific character
	public static char indexCharFinding(String msg, int index) {
		//return msg.toCharArray()[index];
		return msg.charAt(index);
	}

}
