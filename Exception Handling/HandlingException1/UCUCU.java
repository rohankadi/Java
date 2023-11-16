package com.rk.HandlingException1;

public class UCUCU {

	public static void main(String[] args) {
		System.out.println("Main Connection Established");
		Bank bank = new Bank();
		bank.initiate();
		
		System.out.println("Main Connection Terminated");
	}
}

/*
Connection 3 Established
Connection 2 Established
Connection 1 Established
Enter accno and pwd
2000
0
ISSUE REACHED BANK AND COUNT INCREMENTED
Connection 2 Terminated
Connection 3 Terminated
************************************
but, connection 1 is not get terminated, therefore termination of program happen in ATM
************************************
*/