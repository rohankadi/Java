package ControlConstructor;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number for double = ");
		int num = scan.nextInt();
		
		int result = doubleTheNumber(num);
		System.out.println("The result of doubling the num is =  " + result);
		scan.close();

	}
	
	public static int doubleTheNumber(int num) {
		//return num + num;
		return num * 2 ;
	}

}
