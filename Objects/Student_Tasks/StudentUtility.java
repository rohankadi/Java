package com.kn.Student_Tasks;

import java.util.Scanner;

public class StudentUtility {
	
	//01 Method declaration StudentObjectCreation
	public static Student[] studentObjectCreation(int n) {
		Scanner scan = new Scanner(System.in);
		//create an array
		Student[] srr = new Student[n];
		
		for(int i=0; i<srr.length; i++) {
			System.out.println("Enter a data of student "+ (i+1));
			System.out.println("Enter ID = ");
			int id = scan.nextInt();
			System.out.println("Enter Name = ");
			String name = scan.next();
			System.out.println("Enter Marks = ");
			int marks = scan.nextInt();
			
			srr[i] = new Student(id, name, marks);
		}
		scan.close();
		return srr;	
	}
	
	//02 Method declaration Sort by Id in ASC Using Bubble sort
	public static Student[] sortByIdAsc(Student[] srr) {
		Student temp = null;
		boolean isSwapped = false;
		for(int i=0; i<srr.length-1; i++) {
			for(int j=0; j<srr.length-i-1; j++) {
				if(srr[j].id > srr[j+1].id) {
					 temp = srr[j];
					srr[j] = srr[j+1];
					srr[j+1] = temp;
					isSwapped = true;
				}
			}
			
			if(isSwapped == false) {
				break;
			}
		}	
		return srr;	
	}
	
 
	//03 Method declaration Sort by Id in DSC Using Bubble sort
		public static Student[] sortByIdDsc(Student[] srr) {
			Student temp = null;
			boolean isSwapped = false;
			for(int i=0; i<srr.length-1; i++) {
				for(int j=0; j<srr.length-i-1; j++) {
					if(srr[j].id < srr[j+1].id) {
						 temp = srr[j];
						srr[j] = srr[j+1];
						srr[j+1] = temp;
						isSwapped = true;
					}
				}
				
				if(isSwapped == false) {
					break;
				}
			}	
			return srr;	
		}
}
