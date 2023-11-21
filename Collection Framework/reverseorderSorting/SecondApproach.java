package com.rk.reverseorderSorting;

import java.util.*;

public class SecondApproach {

	public static void main(String[] args) {
		//By using 'reverseOrder()' Comparator
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(120);
		al.add(25);
		al.add(150);
		al.add(50);
		al.add(175);
		al.add(5);
		
		System.out.println("======================================================");
		
		System.out.println("Before reversing : " + al);
		
		System.out.println("======================================================");
		
		//comparator
	    Comparator<Integer>	c = Collections.reverseOrder();
	   
	    Collections.sort(al, c);
	    System.out.println("After Reversing : " + al);
		
		System.out.println("======================================================");
	}
}
