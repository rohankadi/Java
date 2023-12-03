//02. INSERTING DATA
package com.kn.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemoINSERT {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/university";
		String USER_NAME = "root";
		String PASSWORD = "dream";
		
		try {
		//1. Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("==> Loaded and Registered Successfully");
		
		//2. Establish the connection with DataBase
		Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		System.out.println("Connection Established Successfully"+ con);
		
		//3. Create Statement Object
		Statement stmt = con.createStatement();
		
		//4. Send and Execute Query
		String INSERT_STUDENT_DETAILS = "INSERT INTO STUDENT2 VALUES(1, 'ROHAN', 65);";
		
		int rowsAffected = stmt.executeUpdate(INSERT_STUDENT_DETAILS);
		System.out.println(rowsAffected + " rows affected");
		
		}
		catch(ClassNotFoundException e) {
			System.out.println("==> Loaded and Registered Failed");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Failed to establish connection");
			e.printStackTrace();
		}
	}

}
