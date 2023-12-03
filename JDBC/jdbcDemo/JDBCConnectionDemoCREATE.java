//CRUD OPERATIONS --> CREATE, READ, UPDATE, DELETE

//01. CREATE a table
package com.kn.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemoCREATE {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/university";
		String USER_NAME = "root";
		String PASSWORD = "dream";
		//String CREATE_STUDENT_QUERY = "CREATE TABLE Student2 (ID INT, NAME VARCHAR(50), MARKS INT";
		
		try {
			//1. Load and Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//FQCN => fully qualified class name --> canonical name
			System.out.println("==> Driver Loaded and Registered Successfully");
			
			//2. Establish the connection with DataBase
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established Successfully " + con);
						
			//3. Create Statement Object
			Statement stmt = con.createStatement();
			
			//4. Send and Execute the query
			//creating table name student2
			String CREATE_STUDENT_QUERY = "CREATE TABLE Student2 (ID INT, NAME VARCHAR(50), MARKS INT)";
		    stmt.execute(CREATE_STUDENT_QUERY);
			
			System.out.println("--> Student2 Table created successfully");
			
			
		} 
		catch (ClassNotFoundException e)
		{
			System.out.println("=> Driver Not Found");
			e.printStackTrace();
		}
		
		catch (SQLException e) 
		{
			System.out.println("Failed Establish Connection");
			e.printStackTrace();
		}
	}
}
