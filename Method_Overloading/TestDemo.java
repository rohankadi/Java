package com.method.overloading;

public class TestDemo {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1(new Object());  //Object version
		
		t.m1("Durga"); //String version
		
		//02 CHILD HAVE HIGHEST PRIORITY IN OVERLOADING
		
		//'null' applicable for String and Object, but in overloading Child will get highest priority
		t.m1(null); 
		
		t.m1(0); //Object version
	}
}
