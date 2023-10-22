package com.kn.inheritance;

public class TestDemo {

	public static void main(String[] args) {
		Super s1 = new Super();
		s1.m1();
		
		SubClass s2 = new SubClass();
		s2.m1();
		s2.m2();
	}
}
