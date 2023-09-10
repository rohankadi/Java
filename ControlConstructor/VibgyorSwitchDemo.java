package ControlConstructor;

import java.util.Scanner;

public class VibgyorSwitchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Alphabet : ");
		char clr = scan.next().charAt(0);
		//char c = scan.next().toLowerCase().charAt(0);

		switch (clr) {
		case 'v':
		case 'V' :
			System.out.println("Violet Color");
			break;

		case 'i':
		case 'I':
			System.out.println("Indigo Color");
			break;

		case 'b':
		case 'B':
			System.out.println("Blue Color");
			break;

		case 'g':
		case 'G':
			System.out.println("Green Color");
			break;

		case 'y':
		case 'Y':
			System.out.println("Yellow Color");
			break;

		case 'o':
		case 'O':
			System.out.println("Orange Color");
			break;

		case 'r':
		case 'R':
			System.out.println("Red Color");
			break;

		default:
			System.out.println("Invalid Input");
		}

		System.out.println("----> The End <----");
		scan.close();
	}

}
