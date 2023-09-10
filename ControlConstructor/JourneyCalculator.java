package ControlConstructor;

import java.util.Scanner;

public class JourneyCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Speed of Your Vehicle in Km/h = ");
		double speed = scan.nextDouble();

		System.out.println("Enter the Time travelled in hours = ");
		double time = scan.nextDouble();

		double distance = calculateDistance(speed, time);
		System.out.println("The distance Travelled is " + distance);
		scan.close();
	}
	//Method
	public static double calculateDistance(double speed, double time) {
		return speed * time;
	}
}
