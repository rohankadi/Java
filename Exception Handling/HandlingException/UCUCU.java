package com.rk.HandlingException;

public final class UCUCU {
	public static void main(String[] args) {
		System.out.println("Main Connection Estsblished");
		Bank bank = new Bank();
		bank.initiate();
		
		System.out.println("Main Connection Terminated");
	}
}
