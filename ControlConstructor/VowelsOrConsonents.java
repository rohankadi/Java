//Write a program given char is Vowel or Consonant
package ControlConstructor;

import java.util.Scanner;

public class VowelsOrConsonents {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c = scan.next().toLowerCase().charAt(0);
		scan.close();

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Entered Char is VOWEL");
		} else {
			System.out.println("Entered Char is CONSONANT");
		}

		// OR
		// if(c == 'a' || c == 'A') {
		// System.out.println("Entered Char is VOWEL");
		// }else if(c == 'e' || c == 'E') {
		// System.out.println("Entered Char is VOWEL");
		// }
		// else if(c == 'i' || c == 'I') {
		// System.out.println("Entered Char is VOWEL");
		// }
		// else if(c == 'o' || c == 'O') {
		// System.out.println("Entered Char is VOWEL");
		// }
		// else if(c == 'u' || c == 'U') {
		// System.out.println("Entered Char is VOWEL");
		// }else {
		// System.out.println("Consonant");
		// }

	}
}
