package com.method.overloading;

public class AnimalDemo {
	public static void main(String[] args) {
		Test2 t= new Test2();
	 
		Animal a = new Animal();
		t.m1(a);
		
		Monkey m = new Monkey();
		t.m1(m);
		
		System.out.println("----------------------");
		/*In overloading MEthOD RESOLUTION depends on reference type 
		  not a runtime object (runtime obj is dummy in overloading)
		 * 
		 * or
		The compiler choose based on reference type (a1), 
		that is not worry about runtime object(ie. Monkey())
		
		therefore below type is comes under ANIMAL VERSION
		*/
		Animal a1 = new Monkey();
		t.m1(a1);
	}
}
