package com.rk.SortingObjects;

import java.util.TreeSet;
import java.util.Iterator;

/*
 ==> Sorting of an objects done by using 2 types
 
    1. TreeSet
    2. The "Sort" utility method present in 'Collection class' only applicable for 'LIST'
 */

//1.Using TreeSet
public class FirstType {

	public static void main(String[] args) {

		int[] inputArray = { 86, 23, 35, 13, 100, 98, 3 };

		TreeSet<Integer> ts = new TreeSet<Integer>();
//		ts.add(86);
//		ts.add(23);
//		ts.add(35);
//		ts.add(13);
//		ts.add(100);
//		ts.add(98);
//		ts.add(3);

		// Adding elements to the TreeSet
		for (int num : inputArray) {
			ts.add(num);
		}

		//Printing 
		Iterator itr = ts.iterator();
		while (itr.hasNext() == true) {
			System.out.print(itr.next() + " ");
		}

	}

}
