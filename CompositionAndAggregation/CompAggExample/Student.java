package com.rk.CompAggExample;
//Student is an ENCLOSING object which is having  HAS-A relationship
public class Student {
  //creating COMPOSITION object which present inside the enclosing object
	Brain brain = new Brain("Red", 2);
	
	//creating Book method which has a Aggregation relationship
	public void bookMethod(Book ref) {
		System.out.println("Book author name is " + ref.author);
		System.out.println("Price of Book is " + ref.price);
	}
	
}
