package com.rk.SortingObjects;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class ThirdType {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(100);
		ad.add(120);
		ad.add(25);
		ad.add(150);
		ad.add(50);
		ad.add(175);
		ad.add(5);

		System.out.println("Before sorting : " + ad);

		// sort() method is not applicable for Queue and Set based classes,
		// so, we have to add all the elements to List bases classes
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(ad);

		Collections.sort(al);
		System.out.println("After sorting : " + al);

	}
}
