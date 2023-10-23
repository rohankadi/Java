package com.kn.multilevel_inheritance;

public class AnimalDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.type = "Husky";
		d.age = 2;
		System.out.println(d.type + " "+ d.age);
		d.run();
		
		BabyDog b = new BabyDog();
		b.type = "Golden Retriver";
		b.age = 1;
		System.out.println(b.type + " " + d.age);
		b.run();
		b.drink();
	}
}
