//CHECKING WHICH ONE IS BEST TO ACCESS OBJECTS
//WHETHER ITERATOR OR TRADITIONAL FOR LOOP
package com.rk.bestOneToAccessTheObjects;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		//Checking using Traditional For Loop
		for(int i=0; i<al.size(); i++) {
			//System.out.println("Size "+ al.size());
			
			//Reading the elements
			System.out.println(al.get(i));
			//writing the elements at the same time
			al.add(99);
		}
	}
}

//OUTPUT
//it will not detect any concurrent modification, and will not stop reading the data
//10, 20, 30, 40, 50, 99, 99, 99, 99, infinity (never ends) 
