package com.rk.InterfaceChecking3;

public class BankApp {

	public static void main(String[] args) {
		
		Bank bank = new Bank();

		/*
		 * RBIStandaard ref; 
		 * ref = new HDFC();
		 *  bank.accept(ref);
		 */

		bank.accept(new SBI());
		System.out.println("---------------------------------");
		bank.accept(new HDFC());
		System.out.println("---------------------------------");
		bank.accept(new ICICI());

	}
}

	