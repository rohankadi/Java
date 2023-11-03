package com.rk.InterfaceChecking3;

public class SBI implements RBIStandaard{

	@Override
	public void withdraw() {
		System.out.println("SBI withdraw");
	}

	@Override
	public void balance() {
		System.out.println("SBI balanace");
	}

	@Override
	public void ministatement() {
		System.out.println("SBI ministatement");
	}

}
