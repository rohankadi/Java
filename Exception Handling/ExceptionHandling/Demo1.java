package com.rk.ExceptionHandling;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		
		try {
		System.out.println("Connection Established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 02 numbers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		// error may occur in below line during runtime execution coz, of faulty i/p
		// given by the user
		int c = a / b;
		// if error occur at above line then Code terminates that point only,
		// further execution will not there.
		System.out.println(c);
		scan.close();
		}
		
		
		catch(Exception e){
			//handling code
			System.out.println("Exception....some arithmatic error occured");
		}
		
		System.out.println("Connection Terminated");
	}
}

/* Output
Connection Established
Enter 02 numbers : 
20
0
Exception....some arithmatic error occured
Connection Terminated
*/