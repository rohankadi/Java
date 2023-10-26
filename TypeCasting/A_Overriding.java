//Overriding_Conversion
package com.object.typeCasting;
//Parent 
public class A_Overriding {
	public void m1() {
		System.out.println("A");
	}
}

//Child of A
class B extends A_Overriding{
	public void m1() {
		System.out.println("B");
	}
}

//Child of B
class C extends B{
	public void m1() {
		System.out.println("C");
   }
}


