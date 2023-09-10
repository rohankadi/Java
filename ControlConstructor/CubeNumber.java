package ControlConstructor;

import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number = ");
		int num = scan.nextInt();

		int numcube = cubeNumber(num);
		System.out.println("The Cube value for the " + num + " is = " + numcube);

		scan.close();
	}

	static int cubeNumber(int num) {
		int cube = (num * num * num);
		// double square = Math.pow(num , 3);
		return cube;
	}

}
