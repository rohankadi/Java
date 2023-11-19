package com.rk.accessingObjectsUsingIterators;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(175);
		al.add(75);
		al.add(125);
		
		//1. Using ITERATORS
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext() == true) {
			System.out.print(itr.next() + " ");
		}
		
		
		System.out.printf("\n=========================================\n");
		//2. Printing using SOP
		System.out.println(al);
		
		System.out.println("=========================================");
		
		//3. accessing the object by using ==> for-loop (it is only supported for ForLoop only)
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " "); //get only supports list. not queue and set
		}
		
		System.out.printf("\n=========================================\n");
		
		//4. accessing the object by using ==> enhanced for-loop / for-each loop 
		for(Integer x : al) {
			System.out.print(x + " ");
		}		
	}

}
