//03. UPDATE
package com.kn.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemoUPDATE {

	public static void main(String[] args) {
	
		try {		
		
			//1. Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded and Registered Successfully");
			
			//2. Establish the connection with DB
			String URL = "jdbc:mysql://localhost:3306/university";
			String USER_NAME = "root";
			String PASSWORD = "dream";
			
		  Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Established Successfully"+ con);
		
		  //3. create a statement object
			Statement stmt = con.createStatement();		
			
		 //4. Send and Execute Query	
			//UPDATE
			String UPDATE_STUDENT_QUERY = "UPDATE STUDENT2 SET NAME = 'RAM' WHERE NAME = 'ROHAN';";
			
			int rowsAffected =	stmt.executeUpdate(UPDATE_STUDENT_QUERY);
			System.out.println(rowsAffected + " rows affected");
			
			System.out.println("Query updated successfully");	
		} 
		
		catch (ClassNotFoundException e) {
			System.out.println("Failed to Load the driver");
			e.printStackTrace();
		} 
		catch (SQLException e) {
			System.out.println("Failed to establish connection");
			e.printStackTrace();
		}
	}

}
