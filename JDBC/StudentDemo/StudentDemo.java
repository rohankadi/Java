package com.kn.JDBC.StudentDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDemo {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "dream";
	
	public static void main(String[] args) {
		Connection con = null;
		try {
		//1. Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		//2. Establish the connection with DB
		 con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		
		//STUDENT OBJECT CREATION
		Student student1 = new Student(1, "Rohan", 89);	
		Student student2 = new Student(2, "Mohan", 96);	
		Student student3 = new Student(3, "RaM", 33);	
		
		
		//DBHandler class method calling
		DBHandler.insertData(con, student1);
		DBHandler.insertData(con, student2);
		DBHandler.insertData(con, student3);
		
		
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
