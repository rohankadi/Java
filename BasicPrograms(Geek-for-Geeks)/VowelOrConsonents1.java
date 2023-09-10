package com.kn.basicPrograms;

import java.util.Scanner;

public class VowelOrConsonents1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character = ");
		char c = scan.next().charAt(0);
	
		//or 
		//char c = scan.next().toLowerCase().charAt(0);
		
		if(c == 'a' || c == 'A' || c == 'e'|| c == 'E' || c == 'i' || c == 'I' 
				||c == 'o' || c == 'O' || c == 'u' || c == 'U')
		{
			System.out.println(c + " is a Vowel");
		}
		else
		{
			System.out.println(c+ " is consonent");
		}
	scan.close();
	}
}
