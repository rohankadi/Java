package com.kn.single_inheritance;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal a = new Animal("busky" , 3);
//		a.breed = "Husky";
//		a.age = 2;
		System.out.println(a.breed + " " + a.age);
		
		a.walk();
		a.waggingTail();
		
		System.out.println("***************************");
		
		Dog d = new Dog("Golden Retriver" , 2);
//		d.breed = "Golden Retriver";
//		d.age = 3;
		System.out.println(d.breed + " " + d.age);
		
		d.walk();
		d.waggingTail();
		d.bark();

	}

}
