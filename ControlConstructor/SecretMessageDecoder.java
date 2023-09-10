package ControlConstructor;

import java.util.Scanner;

public class SecretMessageDecoder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Character value for Decoding : ");
		char c = scan.next().charAt(0);

		int encode = decodeMessage(c);
		System.out.println("The Decode of the " + c + " is " + encode);
		scan.close();
	}

	static int decodeMessage(char c) {
		// return (int) c; //TypeCasting-->Implicit 
		return c;

	}

}
