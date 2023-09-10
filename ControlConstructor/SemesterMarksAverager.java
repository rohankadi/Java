package ControlConstructor;

import java.util.Scanner;

public class SemesterMarksAverager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Sem-1 Marks = ");
		int sem1 = scan.nextInt();
		System.out.print("Enter the Sem-2 Marks = ");
		int sem2 = scan.nextInt();
		System.out.print("Enter the Sem-3 Marks = ");
		int sem3 = scan.nextInt();
		System.out.print("Enter the Sem-4 Marks = ");
		int sem4 = scan.nextInt();
		System.out.print("Enter the Sem-5 Marks = ");
		int sem5 = scan.nextInt();
		System.out.print("Enter the Sem-6 Marks = ");
		int sem6 = scan.nextInt();
		System.out.print("Enter the Sem-7 Marks = ");
		int sem7 = scan.nextInt();
		System.out.print("Enter the Sem-8 Marks = ");
		int sem8 = scan.nextInt();

		double averageOfMarks = calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8);
		 System.out.println("The Average Marks of all Semester is = " + averageOfMarks);
		// OR
		//System.out.printf("The Average Marks of all Semester is  %.2f%n ", averageOfMarks);
		scan.close();

	}

	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7,
			int sem8) {
		//double average = (double) (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8);
		double average = sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8 ;
		return average/ 8;
	}
}