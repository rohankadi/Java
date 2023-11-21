package com.rk.reverseorderSorting;
import java.util.*;

public class FirstApproach {

	/*
	 REVERSE ORDER SORTING : can be done by 02 approaches
	 1) By 'sort()' and 'reverse()' the List
	 2) By using 'reverseOrder()' Comparator 
	 */
	
	// 1) By 'sort()' and 'reverse()' the List
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(100);
		ad.add(120);
		ad.add(25);
		ad.add(150);
		ad.add(50);
		ad.add(175);
		ad.add(5);
		
		System.out.println("======================================================");
		
		System.out.println("Before reversing : " + ad);
		
		System.out.println("======================================================");
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.addAll(ad);
		
		//sorting in ascending order
		Collections.sort(al);
		System.out.println("After Sorting : " + al);
		
		System.out.println("======================================================");

		//reversing 
		Collections.reverse(al);
		System.out.println("After Reversing : " + al);
		
		System.out.println("======================================================");
	}
}
