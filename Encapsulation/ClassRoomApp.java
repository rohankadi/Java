package com.kn.encapsulation;

import java.util.Scanner;

public class ClassRoomApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Temperature = ");
		int temp = scan.nextInt();
		
		// creating an object
		ClassRoom c1 = new ClassRoom();

		System.out.println("Old Temperature = " + c1.getTemperature());
		c1.setTemperature(temp);
		System.out.println("Modified Temperature = " + c1.getTemperature());

		scan.close();

		

	}
}
