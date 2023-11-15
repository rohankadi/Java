//01st approach => Handling Exception

package com.rk.HandlingException;

import java.util.Scanner;

public class ATM {

	public void withdraw() {
		try {
		System.out.println("Connection 1 Estsblished");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter accno and pwd");
		int acc = scan.nextInt();
		int pwd = scan.nextInt();
		
		int res = acc / pwd;
		
		System.out.println("Take your money " + res);
		scan.close();
		}
		
		catch(Exception e) {
			System.out.println("Exception in ATM...Issue shown and resolved in ATM");
		}
		
		System.out.println("Connection 1 Terminated");
	}
}

   /*
   Issue resolved in the same place where it is generated
	but this  will not known to caller(bank), 
	the action performed by the ATM (user) sometimes, that is reached to caller also (Bank)  
	
   */