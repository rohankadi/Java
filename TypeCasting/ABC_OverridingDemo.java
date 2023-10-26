package com.object.typeCasting;

public class ABC_OverridingDemo {

	public static void main(String[] args) {
		// creating an object
		C ch = new C();
        //C method
		ch.m1();
		//C converting to B
		((B) ch).m1();
		//C converting to B and B converting to A
		((A_Overriding) ((B) ch)).m1();
	}
}

//No new object, Object will always same but reference type will different 