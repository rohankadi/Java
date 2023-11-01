package com.kn.anonymousInnerObjectCreation;

public class App {
	public static void main(String[] args) {
		//Anonymous inner class object
//Abstract class and Inteface cannot create an object but we can create an Anonymous inner class object 		
		//01
		/*
		new Institute() {
			
			@Override
			void teach() {
				System.out.println("Institute is Teaching");	
			}
		}.teach();
		*/
		//02
	Institute ref =	new Institute() {
			
			@Override
			void teach() {
				System.out.println("Institute is Teaching");
			}
		};
		
		ref.teach();
		
		
		//03
		new Shape() {
			
			@Override
			public void display() {
			System.out.println("This is Circle");
			}
		}.display();
	}
}
