package com.rk.HandlingException1;

import java.util.Scanner;

public class ATM {
	public void withdraw() {

		System.out.println("Connection 1 Estsblished");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter accno and pwd");
		int acc = scan.nextInt();
		int pwd = scan.nextInt();

		int res = acc / pwd;

		System.out.println("Take your money " + res);
		scan.close();

		System.out.println("Connection 1 Terminated");
	}
}
