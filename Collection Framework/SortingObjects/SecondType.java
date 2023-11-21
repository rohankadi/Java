package com.rk.SortingObjects;

import java.util.*;

public class SecondType {

	public static void main(String[] args) {
		
		int[] inputArray = {86, 23, 35, 13, 100, 98, 3};
		
		ArrayList al = new ArrayList();
//		al.add(86);
//		al.add(23);
//		al.add(35);
//		al.add(13);
//		al.add(100);
//		al.add(98);
//		al.add(3);
		
		// Adding elements to the ArrayList
		for(int num : inputArray) {
			al.add(num);
		}
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

		//before sorting
		System.out.println("Before sorting : " + al);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		//using utility sort() method present in Collections
		
		Collections.sort(al);
		
		//after sorting
		System.out.println("After sorting : "+ al);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
