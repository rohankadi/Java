package com.rk.generics;

import java.util.*;

public class Generics {
	/*
	 * GENERICS => Mechanism to restrict the collection to accept only one type of
	 * data or object
	 */

	public static void main(String[] args) {
	
	   LinkedList <Integer> ll = new LinkedList<Integer>();
	  ll.add(10);
	  ll.add(20);
	  ll.add(30);
	  ll.add(40);
	  ll.add(50);
	  
	  /*
	  //The method add(Integer) in the type LinkedList<Integer> 
	  //is not applicable for the arguments (String)
	  ll.add("Raju");
	  
	  //The method add(Integer) in the type LinkedList<Integer>
	   //is not applicable for the arguments (float)
	  ll.add(3.147f); //error
	  */
	  
	  System.out.println(ll);
	  
	  //User Defined object
	  LinkedList <Employee> ll2 = new LinkedList<Employee>();
	  ll2.add(new Employee());	  
	  ll2.add(new Employee());	  
	  ll2.add(new Employee());	  	  
   
	}
   }