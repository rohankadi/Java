//03rd Approach => Ducking the Exception
package com.rk.DuckingException;

import java.util.Scanner;

public class ATM {

	//leaving without handling =>(throwing an exception to caller)
	public void withdraw() throws Exception{

		System.out.println("Connection 1 Established");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter accno and pwd");
		int acc = scan.nextInt();
		int pwd = scan.nextInt();

		int res = acc / pwd;

		System.out.println("Take your money " + res);
		scan.close();
		System.out.println("COnnection 1 Terminated");
	}
}
