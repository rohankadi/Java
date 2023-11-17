//If student Marks are below 35 then give grace marks
package com.kn.objects;

import java.util.Scanner;

public class StudentApp3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students object to be created :  ");

		Student[] srr = new Student[scan.nextInt()];

		for (int i = 0; i < srr.length; i++) {
			System.out.print("Enter ID for student " + (i + 1) + " = ");
			int id = scan.nextInt();
			System.out.print("Enter NAME for student " + (i + 1) + " = ");
			String name = scan.next();
			System.out.print("Enter MARKS for student " + (i + 1) + " = ");
			int marks = scan.nextInt();
			// create an object
			Student s = new Student(id, name, marks);
			srr[i] = s; // storing obj's in Array
		}
		
		
		
		for (Student s : srr) {
			if (s.marks < 35) {
				int add = 35 - (s.marks);
				System.out.println("Before Grace");
				System.out.println("ID = " + s.id + " NAME = " + s.name + " MARKS = " + s.marks);
				
				System.out.println("After Grace");
				s.marks = s.marks + add;
				System.out.println("ID = " + s.id + " NAME = " + s.name + " MARKS = " + s.marks);
			}
		}
		
		scan.close();
	}
}
