package com.object.typeCasting;

public class A_MethodHiding {
	//static method is called method hiding
	public static void m1() {
		System.out.println("A");
	}
}

class B_mh extends A_MethodHiding{
	public static void m1() {
		System.out.println("B");
	}
}

class C_mh extends B_mh{
	public static void m1() {
		System.out.println("C");
	}
}

