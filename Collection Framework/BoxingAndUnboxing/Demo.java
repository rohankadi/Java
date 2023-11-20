package com.rk.BoxingAndUnboxing;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		//Primitive DataType to Object
		ll.add(10); //Internally converted to ==> ll.add(new Integer(10)) 
		ll.add(20);  //Internally converted to ==> ll.add(new Integer(20)) 
		ll.add(30);  //Internally converted to ==> ll.add(new Integer(30)) 
		ll.add(40);  //Internally converted to ==> ll.add(new Integer(40)) 
		ll.add(50);  //Internally converted to ==> ll.add(new Integer(50)) 
		
		ll.add(new Integer(60));
		
		System.out.println(ll);

	}

}
