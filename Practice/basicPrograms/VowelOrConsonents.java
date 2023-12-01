package com.kn.basicPrograms;

import java.util.Scanner;

public class VowelOrConsonents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character = ");
		char c = scan.next().charAt(0);
		
		switch(c) {
		case 'a' :
		case 'A' :
			System.out.println("'"+ c + "' is a Vowel");
			break;
		case 'e' :
		case 'E' :
			System.out.println("'"+ c + "' is a Vowel");
			break;
		case 'i' :
		case 'I' :
			System.out.println("'"+ c + "' is a Vowel");
			break;
		case 'o' :
		case 'O' :
			System.out.println("'"+ c + "' is a Vowel");
			break;
		case 'u' :
		case 'U' :
			System.out.println("'"+ c + "' is a Vowel");
			break;
		default : 
			System.out.println("'"+ c + "' is a Consonent");
		}
	scan.close();
	}
	

}
