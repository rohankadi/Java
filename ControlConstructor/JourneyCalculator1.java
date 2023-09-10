package ControlConstructor;

import java.util.Scanner;

public class JourneyCalculator1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter (1) for distance in hours  or (2) for in min");
		int dist = scan.nextInt();
		
		System.out.println("Enter the Speed of Your Vehicle  = ");
		int speed = scan.nextInt();

		System.out.println("Enter the Time travelled  = ");
		int time = scan.nextInt();

	
		int distance = calculateDistance(speed, time);
		scan.close();
		
		
		switch(dist) {
		case 1 :
			System.out.println("The distance Travelled is " + distance + " Hours");
			break;
		case 2 :
			System.out.println("The distance Travelled is " + (distance*60) + " Mins");
			break;
		default : System.out.println("Enter a Valid Key");
		}
	}

	// Method
	public static int calculateDistance(int speed, int time) {
		return speed * time;
	}
}
