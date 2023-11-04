package com.durgasoft.abstractModifiers;
//IMPURE / CONCRETE ABSTRACT CLASSES
public abstract class Lion extends Animal {

	@Override
	void eat() {
		System.out.println("Lion hunts down and eat");

	}


	@Override
	void foodHabbit() {
		System.out.println("Lion is carnivorous animal");

	}

	/*
	@Override
	void sleep() {
	}
	 */
}
