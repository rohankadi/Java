package com.kn.accessModifiers_pack1;

public class Demo2 extends Demo1{
	//method
		public void disp2() {
			System.out.println("a = " + a);
			System.out.println("b = " +b);
			System.out.println("c = " +c);
			//System.out.println("d = " + d); //cannot accessible from Demo1
		}
}
