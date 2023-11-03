package com.rk.InterfaceChecking3;

public class Bank {

	void accept(RBIStandaard ref) {
		ref.withdraw();
		ref.balance();
		ref.ministatement();
	}
}
