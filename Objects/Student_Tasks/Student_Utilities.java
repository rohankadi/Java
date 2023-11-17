package com.kn.Student_Tasks;

import java.util.Scanner;
public class Student_Utilities {

		public static Student[] studentObjectCreation(int n) {
			Scanner scan = new Scanner(System.in);
			Student[] srr = new Student[n];
			for (int i = 0; i < srr.length; i++) {
				System.out.println("Data for Student " + (i + 1));
				System.out.println("Enter ID of Student " + (i + 1) + " = ");
				int id = scan.nextInt();
				System.out.println("Eter Name for Student" + (i + 1) + " = ");
				String name = scan.next();
				System.out.println("Enter Marks for Student" + (i + 1) + " = ");
				int marks = scan.nextInt();
				srr[i] = new Student(id, name, marks);
				;
				System.out.println("---------------------------------------------------");
			}
			scan.close();
			return srr;
		}

		public static void searchStudentById(Student srr[],int id) {
			System.out.println("---------------------------------------------------");
			int c = 0;
			for (int i = 0; i < srr.length; i++) {
				if (srr[i].id == id) {
					c = 1;
					System.out.println("ID = " + srr[i].id + ", Name = " + srr[i].name + ", Marks = " + srr[i].marks);
					break;
				}
			}
			if (c == 0) {
				System.out.println(id + "Not Found");
			}
		}

		public static void searchStudentByName(Student srr[],String name) {
			int c = 0;
			for (int i = 0; i < srr.length; i++) {
				if (srr[i].name.equals(name)) {
					c = 1;
					System.out.println("ID = " + srr[i].id + ", Name = " + srr[i].name + ", Marks = " + srr[i].marks);
					break;
				}
			}
			if (c == 0) {
				System.out.println(name + "Not Found");
			}
		}

		public static void applyGraceMarks(Student srr[]) {
			System.out.println("----------------------Grace Marks-----------------------");
			for (Student s : srr) {
				if (s.marks < 35) {
					int grace = 35 - s.marks;
					System.out.println("ID = " + s.id + ", Name = " + s.name + ", Marks = " + s.marks);
					System.out.println("Grace Marks = " + grace);
					System.out.println("Final Marks =" + (s.marks + grace));
				}
			}
		}
		public static void sortStudentByIdAscending(Student srr[])
		{
			System.out.println("---------------------------------------------------");
			for (int i = 0; i < srr.length; i++)
			{
				int count = 0;
				for (int j = 0; j < srr.length - 1 - i; j++)
				{
					if (srr[j].id > srr[j + 1].id)
					{
						
						Student temp = srr[j+1];
						srr[j+1]=srr[j];
						srr[j]=temp;
						count = 1;

					}
				}
				if (count == 0)
					break;
			}
			System.out.println("Studnet Details in Ascending Order Of Id");
			for(Student s : srr)
			{
				System.out.println("ID = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
			}
		}
		public static void sortStudentByIdDescending(Student srr[])
		{
			System.out.println("---------------------------------------------------");
			for (int i = 0; i < srr.length; i++)
			{
				int count = 0;
				for (int j = 0; j < srr.length - 1 - i; j++)
				{
					if (srr[j].id < srr[j + 1].id)
					{
						
						Student temp = srr[j+1];
						srr[j+1]=srr[j];
						srr[j]=temp;
						count = 1;

					}
				}
				if (count == 0)
					break;
			}
			System.out.println("Studnet Details in Descending Order Of Id");
			for(Student s : srr)
			{
				System.out.println("ID = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
			}
		}
		public static void sortStudentByNameAscending(Student srr[])
		{
			System.out.println("---------------------------------------------------");
			for (int i = 0; i < srr.length; i++)
			{
				int count = 0;
				for (int j = 0; j < srr.length - 1 - i; j++)
				{
					if ((srr[j].name.compareTo(srr[j + 1].name))>0)
					{
						
						Student temp = srr[j+1];
						srr[j+1]=srr[j];
						srr[j]=temp;
						count = 1;

					}
				}
				if (count == 0)
					break;
			}
			System.out.println("Studnet Details in Ascending Order Of Name");
			for(Student s : srr)
			{
				System.out.println("ID = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
			}
		}
		public static void sortStudentByNameDescending(Student srr[])
		{
			System.out.println("---------------------------------------------------");
			for (int i = 0; i < srr.length; i++)
			{
				int count = 0;
				for (int j = 0; j < srr.length - 1 - i; j++)
				{
					if ((srr[j].name.compareTo(srr[j + 1].name))<0)
					{
						
						Student temp = srr[j+1];
						srr[j+1]=srr[j];
						srr[j]=temp;
						count = 1;

					}
				}
				if (count == 0)
					break;
			}
			System.out.println("Studnet Details in Descending Order Of Name");
			for(Student s : srr)
			{
				System.out.println("ID = "+s.id+", Name = "+s.name+", Marks = "+s.marks);
			}
		}
		
		public static void rateApplication(Student srr[],int rating)
		{
			
			if(rating<1 && rating>5)
			{
				System.out.println("Invalid Input");
			}
			else
			{
				for(int i=1;i<=rating;i++)
				{
					System.out.print("*");
				}
			}
		}
	}

