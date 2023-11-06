package com.kn.polymorphism4;

class Child extends Parent{
	//01 Parent and Child have same access modifier
	/*
	@Override
	public void display() {
		System.out.println("This is Child");
	}
	*/
	
	//02 Parent and Child have same access modifier
	/*
	@Override
	 void display() {
		System.out.println("This is Child");
	}
	*/
	
     //03 ERROR ==> Cannot reduce the visibility of the inherited method from Parent
	//(cz, parent have public access modifier)
	/* 
	 @Override
	 void display() {
		System.out.println("This is Child");
	}
	*/
	
	/*
	//04 Can be increase the visibility of the inherited method from Parent
	//(cz, parent have default access modifier)
	@Override
	public void display() {
		System.out.println("This is Child");
	}
	*/
	
	/*
	//05
	@Override
	protected void display() {
		System.out.println("This is Parent");
	}
	*/
	
	/*
	//06 Error cannot reduce
	@Override
	 void display() {
		System.out.println("This is Parent");
	}
	*/
	
	
	
}

