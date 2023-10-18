package com.kn.accessModifiers_pack1;

public class Demo3 {

	public void disp3() {
		Demo1 d1 = new Demo1();
		System.out.println("a = " + d1.a);
		System.out.println("b = " + d1.b);
		System.out.println("c = " + d1.c);
		//System.out.println("d = " + d1.d); //not accessible
	}
}
