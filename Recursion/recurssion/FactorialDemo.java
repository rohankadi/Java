package com.kn.recurssion;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		//Take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("8Enter a number = ");
		int n = scan.nextInt();
		
		//Create an Object 
		Factorial f1 = new Factorial();
		
		//call a method to finds factorial of specified number
		//reference variable.Instance Method name
			int result = f1.fact(n);
			
			//print result
			System.out.println("The factorial of "+ n + " is = "+ result);
			//Release the resource
			scan.close();
	}

}
