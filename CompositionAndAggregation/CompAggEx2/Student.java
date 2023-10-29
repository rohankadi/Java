package com.rk.CompAggEx2;

public class Student extends Human {

	//Aggregation objects
	public void acceptBook(Book ref) {
		System.out.println("Student has book written by " + ref.author + " which costs " 
	     + ref.price +" with name " +ref.bookname);
	}
	
	public void acceptBike(Bike ref) {
		System.out.println("Student has bike with brand " + ref.brand + " with price " + ref.price + ref.color+" in color");
		System.out.println("this bike has " + ref.bikeEngine.type + "engine with " +ref.bikeEngine.BHP);
	}
	
	public void  acceptCar(Car ref) {
		System.out.println("Student has car with brand " + ref.brand + " with price " + ref.price + ref.color+" in color");
		System.out.println("this car has " + ref.carEngine.type + "engine with " + ref.carEngine.BHP);
	}
	
}
