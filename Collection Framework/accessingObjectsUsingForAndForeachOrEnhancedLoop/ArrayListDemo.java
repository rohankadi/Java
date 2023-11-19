package com.rk.accessingObjectsUsingForAndForeachOrEnhancedLoop;

import java.util.ArrayList;

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
		
		System.out.println(al);
		
		System.out.println("=========================================");
		
		// accessing the object by using ==> for-loop (it is only supported for ForLoop only)
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " "); //get only supports list. not queue and set
		}
		
		System.out.printf("\n=========================================\n");
		
		//accessing the object by using ==> enhanced for-loop / for-each loop 
		for(Integer x : al) {
			System.out.print(x + " ");
		}		
	}

}
