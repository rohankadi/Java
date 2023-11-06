package com.kn.polymorphism5;

public class ParentChildDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
		System.out.println("=============");
		
		Child c = new Child();
		c.display();
		System.out.println("=============");
		
		Parent p2 = new Child();
		p2.display();
		
		//Error => cannot convert from Parent to Child
		//Child c2 = new Parent();
		
	}
}
