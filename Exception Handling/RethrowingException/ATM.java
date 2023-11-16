//02nd Approach => Re-throwing Exception
package com.rk.RethrowingException;

import java.util.Scanner;

public class ATM {
	public void withdraw() throws Exception{
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
		
		catch(Exception e) {
			System.out.println("EXCEPTION IN ATM...ISSUE SHOWN AND RESOLVED IN ATM");
			throw e;
		}
		
		//after control leaves method finally block statement is executed 
		finally {
		System.out.println("Connection 1 Terminated");
		}
	}
}
