package com.object.typeCasting;

public class ABC_MethodHiding {

	public static void main(String[] args) {

		// Creating an Object
		C_mh c = new C_mh();

		c.m1();   //o/p :=> C
		//C converting to B
		((B_mh)c).m1(); //o/p :=> B 
		//C converting to B and B converting to A
		((A_MethodHiding)(B_mh)c).m1();  //o/p :=> A
	}
}

/*
  In method hiding Method resolution taken care by 'JVM',
    based on reference type
*/