package com.durgasoft.abstractModifiers;
//PURE ABSTRACT CLASSES
 abstract public class Animal {

	abstract void eat();
	abstract void sleep();
	abstract void foodHabbit();
	
	
	/*
	 * Parent abstract class can have Child abstract class
	 * Parent abstract class can have Child non-abstract / concrete class 
	 * Parent concrete class can have Child non-abstract / concrete class 
	 * Parent concrete class can have Child abstract class 
	 * Parent concrete class can have Child concrete class 
	 */
	
	
	/* //The class Animal can be either abstract or final, not both
	 
	  final abstract public class Animal { //ERROR
	    abstract void eat();
	   abstract void sleep();
	   abstract void foodHabbit();
	   }
	   
    1. abstract uses when we don't know no implementation,
        and restricting user from creating an object   
    2. if we give both final and abstract => we cannot change or redeclared or override the
    	method or give an implementation so, that's the reason don't use both 
    	at a time will give an error
	 */
}
