package com.kn.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemoDELETE {

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
		
		//4. Send and Execute the query
		String DELETE_STUDENT_QUERY = "DELETE FROM STUDENT2 WHERE ID = 1;";
		int delete = stmt.executeUpdate(DELETE_STUDENT_QUERY);
		System.out.println(delete + " row affected");
		
		}
		catch(ClassNotFoundException e) {
			System.out.println("==> Driver not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed to establish connection");
			e.printStackTrace();
		}

	}

}
