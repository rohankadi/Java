package com.object.typeCasting;
//parent class
class Parent {
	public void m1() {}
}

//child class
class Child extends Parent{
	public void m2() {}
}

//demo
class Demo{
	public static void main(String[] args) {
		Child c = new Child();
		
		c.m1();
		c.m2();
		
		//converting child to parent
		((Parent)(c)).m1();
		
		//((Parent)(c)).m2(); 
		
		//ERROR => The method m2() is undefined for the type Parent
		
	}
}