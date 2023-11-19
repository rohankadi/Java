package com.rk.accessingObjectsUsingForAndForeachOrEnhancedLoop;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(175);
		pq.add(75);
		pq.add(125);
		
		System.out.println(pq);
		
		System.out.println("=========================================");
		
		//accessing the object by using ==> enhanced for-loop / for-each loop 
		for(Integer x : pq) {
			System.out.print(x + " ");
		}
	}

}
