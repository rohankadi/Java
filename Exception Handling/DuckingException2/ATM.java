//03rd Approach => Ducking the Exception
package com.rk.DuckingException2;

import java.util.Scanner;

public class ATM {

	// leaving without handling =>(throwing an exception to caller)
	public void withdraw() throws Exception {

		try {
			System.out.println("Connection 1 Established");

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter accno and pwd");
			int acc = scan.nextInt();
			int pwd = scan.nextInt();

			int res = acc / pwd;

			System.out.println("Take your money " + res);
			scan.close();
		}
		//used to handle the important statement, no resource loss will occur
		finally{
			System.out.println("Connection 1 Terminated");
		}
	}
}