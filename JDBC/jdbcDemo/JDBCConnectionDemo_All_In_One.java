package com.kn.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo_All_In_One {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/university";
		String USER_NAME = "root";
		String PASSWORD = "dream";
		
		Connection con = null;
		try {
		//01. Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("==> Loaded and Registered Successful");
		
		//02. Establish the connection with DB
		 con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		System.out.println("Connection Established Successfully " + con);
		
		//03. create a Statement
		Statement stmt = con.createStatement();
		
		//04. send and execute the query
		/*
		//a. Create
		String CREATE_STUDENT_QUERY = "CREATE TABLE STUDENT3(ID INT, NAME VARCHAR(50), MARKS INT)";
		stmt.execute(CREATE_STUDENT_QUERY);
		System.out.println("--> Student3 Table created successfully");
		 */
		/*
		//b. insert
		String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT3 VALUES(1, 'RAM', 66)";
		int rowaffected = stmt.executeUpdate(INSERT_STUDENT_QUERY);
		System.out.println(rowaffected +" row affected ");
		*/
		/*
		//c. update
		String UPDATE_STUDENT_QUERY = "UPDATE STUDENT3 SET NAME = 'ROHAN' WHERE NAME = 'RAM'";
		int updateAffected = stmt.executeUpdate(UPDATE_STUDENT_QUERY);
		System.out.println(updateAffected +  " rows affected");
    	*/
	
		//d. delete
		String DELETE_STUDENT_QUERY = "DELETE FROM STUDENT3 WHERE ID = 1;";
		int deleteAffected = stmt.executeUpdate(DELETE_STUDENT_QUERY);
		System.out.println(deleteAffected + " delete affected");
		
		}
		catch(ClassNotFoundException e) {
			System.out.println("==> Loaded and Registered Failed");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Failed to Establish Connection");
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
