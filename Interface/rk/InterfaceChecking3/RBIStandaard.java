package com.rk.InterfaceChecking3;

public interface RBIStandaard {

	void withdraw();
	void balance();
	void ministatement();
	
	default void withdrawLimit() {
		System.out.println("withdraw limit is 2000");
	}
	
	static void denominationType() {
		System.out.println("500 and 1000 notes");
	}
	
}
