package com.rk.InterfaceChecking3;

public class ICICI implements RBIStandaard{

	@Override
	public void withdraw() {
		System.out.println("ICICI withdraw");
	}

	@Override
	public void balance() {
		System.out.println("ICICI balanace");
	}

	@Override
	public void ministatement() {
		System.out.println("ICICI ministatement");
	}
	
}
