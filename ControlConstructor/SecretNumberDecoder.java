package ControlConstructor;

import java.util.Scanner;

public class SecretNumberDecoder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for decoding = ");
		int num = scan.nextInt();

		// System.out.println((char)num);

		// or
		char decode = numDecoder(num);
		System.out.println("The decoded character of a '" + num + "' num is : " + decode);
		scan.close();
	}

	private static char numDecoder(int num) {
		return (char) num;
	}
}
