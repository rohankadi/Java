//GIven Number is +VE or Not
package ControlConstructor;

import java.util.Scanner;

public class NumberPosOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = scan.nextInt();

		if (num > 0) {
			System.out.println("Entered Number is Positive");
		} else if (num == 0) {
			System.out.println("Entered number is Zero");
		}

		else {
			System.out.println("Entered number is Not-Positive");
		}
		scan.close();
	}
}
