//Replace a character at a specific index in a String in Java
package com.kn.replaceString_char;

import java.util.Scanner;

public class String_Character_Replace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Messsage : ");
		String msg = scan.nextLine();

		System.out.print("Enter a replacing character index : ");
		int index = scan.nextInt();

		char c = replace_String(msg, index);
		System.out.println(c);
		
		scan.close();

	}

	public static char replace_String(String msg, int index) {
		char repl = 'g';
	     msg.charAt(index);
		return repl;
	}
}
