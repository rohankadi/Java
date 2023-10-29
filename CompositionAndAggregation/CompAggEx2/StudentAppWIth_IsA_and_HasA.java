package com.rk.CompAggEx2;

public class StudentAppWIth_IsA_and_HasA {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Human brain color is => " + s.brain.color);
		System.out.println("Human brain weight is => " +s.brain.weight);
		
		System.out.println("Human heart color is => " + s.heart.color);
		System.out.println("Human heart weight is => " +s.heart.weight);
		
		System.out.println("==============================================");
		
		Book b = new Book("Rohan", 999, "LET-US-C");
		Bike bike = new Bike("Yamaha", 120000, "Black");
		Car car = new Car("Benz", 500000, "White");
		
		s.acceptBook(b);
		System.out.println("---------------------------------------------------------");
		s.acceptBike(bike);
		System.out.println("---------------------------------------------------------");
		s.acceptCar(car);
		
		System.out.println("********************************************************************");
		
		//if enclosing object is destroyed, then checking whether we can access brain heart and others or not
		s = null;
		
		/*
		//ERROR : Cannot read field "heart" because "s" is null
		System.out.println(s.heart.color);
		System.err.println(s.heart.weight);
		//ERROR : Cannot read field "brain" because "s" is null
		System.out.println(s.brain.color);
		System.out.println(s.brain.weight);
		*/
		
		System.out.println(b.author);
		System.out.println(b.bookname);
		System.out.println(b.price);
		System.out.println("---------------------------------------------------");

		System.out.println(bike.brand);
		System.out.println(bike.price);
		System.out.println(bike.color);
		System.out.println(bike.bikeEngine.type);
		System.out.println(bike.bikeEngine.BHP);
		System.out.println("---------------------------------------------------");
		
		System.out.println(car.brand);
		System.out.println(car.price);
		System.out.println(car.color);
		System.out.println(car.carEngine.type);
		System.out.println(car.carEngine.BHP);
		
		
		
		
		
	}

}
