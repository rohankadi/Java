//creates race condition
package com.rk.RaceCondition;

public class Office {

	public static void main(String[] args) {
		MSWord msword1 = new MSWord();
		MSWord msword2 = new MSWord();
		MSWord msword3 = new MSWord();

		msword1.setName("type");
		msword2.setName("spellCheck");
		msword3.setName("autoSave");
		
		msword1.start();
		msword2.start();
		msword3.start();
		
	}

}
