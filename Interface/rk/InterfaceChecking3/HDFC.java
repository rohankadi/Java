package com.rk.InterfaceChecking3;

public class HDFC implements RBIStandaard{
	
	@Override
	public void withdraw() {
		System.out.println("HDFC withdraw");
	}

	@Override
	public void balance() {
		System.out.println("HDFC balanace");
	}

	@Override
	public void ministatement() {
		System.out.println("HDFC ministatement");
	}
}
