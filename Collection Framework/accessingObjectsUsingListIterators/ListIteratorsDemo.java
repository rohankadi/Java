package com.rk.accessingObjectsUsingListIterators;

import java.util.*;

public class ListIteratorsDemo {

	public static void main(String[] args) {
		ArrayList ref = new ArrayList();
		ref.add(100);
		ref.add(50);
		ref.add(80);
		ref.add(20);
		ref.add(10);

		// accessing elements in Forward Direction
		ListIterator<Integer> litr = ref.listIterator();
		while (litr.hasNext() == true) {
			System.out.print(litr.next() + " ");
		}

		System.out.printf("\n=================================\n");
		
		// accessing elements in Backward Direction
		ListIterator<Integer> litr1 = ref.listIterator(ref.size());
		while(litr1.hasPrevious() == true) {
			System.out.print(litr1.previous() + " ");
		}
		
	}
}




