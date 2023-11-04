package com.durgasoft.abstractModifiers;

public class AbstractModifier {

	/* abstract means not complete / partial completed
	   abstract is applicable for,
	  * 1. methods
	  * 2. class
	*/
	
	/* 1.abstract method
	 * 
	 * abstract method() cannot have body	
	 * if we don't know about implementation then we can easily use with abstract.
	 * abstract method have only  declaration not implementation({})
	 * example : 1
    		
    		abstract class vehicle{
    		  //methods declare with abstract
				public abstract int getNoOfWheels(); 
			}
	     
	  => we know there will be num of wheels are differ from vehicle to vehicle type, 
	     but still we can easily declare it by abstract method 
	
	*/
	
	abstract class Fruit{
		//we don't know which fruit taste user want, but still we can declare it by abstract method 
		//even though we don't know about implementation
		public abstract String getTaste();
	}
	
	/* 2. abstract class
	 *  partial implemented class is called abstract method
	 *  if it is abstract class, then not possible to create an object
	 *  ex : Test t = new Test();
	 *  or
	 *  not possible to call that method => t.m1();
	 *  ex :   
	   abstract class Test{
		//ERROR => Cannot instantiate the type AbstractModifier.Test
		//cz, abstract class will not allow to create an object
		  Test t = new Test();
	*/
	/*
	 ******TOP CLASSES considered as Abstract cz, they don't have clarity (tree root)*******
	  
	if class contains at-least one abstract method then, 
	the class is partial implemented class only, then that class is declared as abstract 
	ex : 
	abstract class Fruit{
	  public abstract String getTaste();
	 }  
	*/
	
	/*
	 * if class contains no abstract method then also,
	 *  if we feel that is not fully implemented then also we can declare that class as abstract, 
	 *  
	 *  so, abstract class can have 0 abstract methods also
	 *  
	 *  ex : 
	 *   class Test{
	 *   public void m1(){};
	 *   public void m2(){};
	 *   }
	 *   
	 *   
	 *   if we don't want to create an obj =>(Test t = new Test();)
	 *    for this dummy implemented methods then,
	 *     we can declare class as abstract.
	 *     
	 *     abstract class Test{
	 *      public void m1(){};
	 *      public void m2(){};
	 *   }
	 * */
	}

