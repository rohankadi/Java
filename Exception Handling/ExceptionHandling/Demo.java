package com.rk.ExceptionHandling;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Connection Established");
		System.out.println("Enter 02 numbers : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		//error may occur in below line during runtime execution coz, of faulty i/p given by the user
		int c = a / b; 
		//if error occur at above line then Code terminates that point only, 
		//further execution will not there.
		System.out.println(c);
		System.out.println("Connection Terminated");
		scan.close();
	}
}

 /* Output-1
Connection Established
Enter 02 numbers : 
10
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.rk.ExceptionHandling.Demo.main(Demo.java:13)
*/

/* Output-2
Connection Established
Enter 02 numbers : 
10
2
5
Connection Terminated
*/
