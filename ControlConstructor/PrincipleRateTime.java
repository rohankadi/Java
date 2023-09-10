package ControlConstructor;

import java.util.Scanner;

public class PrincipleRateTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Principle Amount = ");
		int p = scan.nextInt();
		System.out.println("Enter a Rate of Interest = ");
		int r = scan.nextInt();
		System.out.println("Enter a Time = ");
		int t = scan.nextInt();

		System.out.println("Principle Rate Time is = " + principleRateTime(p, r, t));
		scan.close();
	}

	static double principleRateTime(int p, int r, int t) {
		return p * r * t;
	}

}
