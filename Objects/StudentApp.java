package com.kn.objects;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Rohan", 98);
		Student s2 = new Student(2, "Mohan", 92);
		Student s3 = new Student(3, "Dan", 97);
		
		Student[] srr = new Student[3];
		
		srr[0] = s1;
		srr[1] = s2;
		srr[2] = s3;
		
		System.out.println("ID = " + srr[0].id + ", Name = " + srr[0].name + ", Marks = " + srr[0].marks);
	

	}

}
