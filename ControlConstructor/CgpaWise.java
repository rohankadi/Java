package ControlConstructor;

import java.util.Scanner;

public class CgpaWise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your CGPA = ");
		double cgpa = scan.nextDouble();

		if (cgpa >= 90) {
			System.out.println("You can join AI");
		} 
		else if (cgpa < 80 && cgpa > 75) {
			System.out.println("You can join IoT");
		}
		else if (cgpa < 75 && cgpa > 65) {
			System.out.println("You can join NNP");
		} 
		else if (cgpa < 60 && cgpa > 45) {
			System.out.println("You can join  Quantum Computing");
		}
		else {
			System.out.println("You can join IT Job");
		}
	}
}
