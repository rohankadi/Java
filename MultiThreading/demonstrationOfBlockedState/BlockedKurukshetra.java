package com.rk.demonstrationOfBlockedState;

public class BlockedKurukshetra {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		
		Thread t1 = new Thread(warrior);
		Thread t2 = new Thread(warrior);
		
		t1.setName("karna");
		t2.setName("arjun");

		t1.start();
		t2.start();
		
	}

}
