package com.rk.arrayListMethods;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(100);
		al.add(200);
		al.add("Raju");
		al.add(50);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		System.out.println("===============================");

		// adds 999 to index 2
		al.add(2, 999);
		System.out.println(al);
		System.out.println("===============================");
		
		//Searching operation will done, give an boolean value
		System.out.println(al.contains(175));
		System.out.println("===============================");
		
		//it give a value present in 2nd index
		System.out.println(al.get(2));
		System.out.println("===============================");
		
		//Searching operation will done, give an index of a given value
		System.out.println(al.indexOf("Raju"));
		System.out.println("===============================");
		
		//check whether given arrayList is empty or not
		System.out.println(al.isEmpty());
		System.out.println("===============================");
		
		//returns a total size of an array list
		System.out.println(al.size());
		System.out.println("===============================");

		//removes a second index element
		System.out.println(al.remove(2));
		System.out.println("===============================");
		
		System.out.println(al.size());
		System.out.println("===============================");
		
		  
		//Creating another ArrayList object
		ArrayList al2 = new ArrayList();
		//The method addAll(Collection) belongs to the raw type ArrayList
		//It will take all elements copies presents in al 
		al2.addAll(al);
		
		System.out.println(al);
		System.out.println("===============================");		
		System.out.println(al2);
		System.out.println("===============================");		

		al2.add(2, 999);
		al2.add(4, 9999);
		
		System.out.println(al2);
		System.out.println("===============================");		

		
		//al = previous array elements of al + new array elements of al2 adds
		al.addAll(al2);
		System.out.println(al2);
		
		System.out.println(al);
		
	} 

}
