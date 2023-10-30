package com.rk.CompAggExample;

public class AggCompExample {
	public static void main(String[] args) {
	
	//Enclosing object 
	Student student = new Student();
	System.out.println(student.brain.color);
	System.out.println(student.brain.weight);

	
	Book book = new Book("Bendre", 1500);
	
	student.bookMethod(book);
	
	}
}
