package ControlConstructor;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 02 numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

//int c = a-b;
//	 if(c >= 0) {
//		 System.out.println(c);
//	 }
//	 else {
//		 System.out.println("The Diff = " +  c*-1);
//	 }

		// 02
//	 int sub;
//	 if(a>b) {
//		 sub = (a-b);
//		 System.out.println("The diff "+ sub);
//	 }
//	 
//	 else {
//		 sub = (b-a);
//		 System.out.println("The diff "+ sub);
//	 }

//03
		if (a > b) {
			System.out.println("The diff " + (a - b));
		}

		else {
			System.out.println("The diff " + (b - a));

		}
	}
}
