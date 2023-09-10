//RainBow Colors
package ControlConstructor;

import java.util.Scanner;

public class RainbowColors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Char: ");
		char c = scan.next().toLowerCase().charAt(0);
		
		if(c == 'v') {
			System.out.println("VIOLET");
		}else if(c == 'i') {
			System.out.println("INDIGO");
		}else if(c == 'b') {
			System.out.println("BLUE");
		}else if(c == 'g') {
			System.out.println("GREEN");
		}else if(c == 'y') {
			System.out.println("YELLOW");
		}else if(c == 'o') {
			System.out.println("ORANGE");
		}else if(c == 'r') {
			System.out.println("RED");
		}else {
			System.out.println("Not Entered V I B G Y O R char");
		}
		scan.close();
	}
}
