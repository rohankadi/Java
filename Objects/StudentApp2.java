//Searching a particular student data
package com.kn.objects;

import java.util.Scanner;

public class StudentApp2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students object to be created :  ");

		Student[] srr = new Student[scan.nextInt()];
		
 		for (int i = 0; i < srr.length; i++) {
			System.out.print("Enter ID for student " + (i+1) + " = ");
			int id = scan.nextInt();
			System.out.print("Enter NAME for student " + (i+1) + " = ");
			String name = scan.next();
			System.out.print("Enter MARKS for student " + (i+1) + " = ");
			int marks = scan.nextInt();
			//create an object
			Student s = new Student(id, name, marks);
			srr[i] = s; //storing obj's in Array
		}
 		//01
 		//Printing Array Elements
// 		for(Student s : srr) {
// 			System.out.println("ID = " + s.id +" NAME = " + s.name + " MARKS = "+ s.marks);
// 		}
 		
 		//02 Finding the data of a student by entered name
 		System.out.println("Enter the name of student whose data needs to find = ");
 		String key = scan.next();
 		
 		for(int i=0; i<srr.length; i++) {
 			if(key.equals(srr[i].name)) {
 				System.out.println("ID = " + srr[i].id +" NAME = " + srr[i].name + " MARKS = "+ srr[i].marks);
 			}
 		}
 		
 		scan.close();
	}

}
