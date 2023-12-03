package com.kn.jdbcMethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemoMethods {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "dream";
	// Inserting Dynamic type data(which changes)
	private static final String INSERT_DATA = "INSERT INTO EMP1 VALUES(?, ?, ?);";
	private static final String READ_DATA = " SELECT* FROM EMP1 ORDER BY ID ASC;";
	private static final String UPDATE_DATA = "UPDATE EMP1 SET SALARY = (SALARY+1000) WHERE ID = ?;";
	private static final String DELETE_DATA = "DELETE FROM EMP1 WHERE ID = ?;";
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			// 1. Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Establish the Connection with DB
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			// 5. Close the Connection

			System.out.println("Choose an appropriate option :");
			System.out.println("1. TO INSERT DATA");
			System.out.println("2. TO UPDATE DATA");
			System.out.println("3. TO SELECT DATA");
			System.out.println("4. TO DELETE DATA");

			int option = scan.nextInt();

			switch (option) {
			case 1:
				insertEmpData(con, scan);
				break;
			case 2:
				updateEmpData(con, scan);
				break;
			case 3:
				selectEmpData(con, scan);
				break;
			case 4:
				deleteEmpData(con,scan);
				break;
			default:
				System.out.println("Invalid Option");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// INSERTING DATA
	private static void insertEmpData(Connection con, Scanner scan) {
		System.out.println("Enter ID = ");
		int id = scan.nextInt();
		System.out.println("Enter Name = ");
		String name = scan.next();
		System.out.println("Enter Salary = ");
		Double salary = scan.nextDouble();

		try {
			// 3. Create a Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(INSERT_DATA);
			// 4. Send and Execute the Query
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, salary);

			pstmt.execute();
			System.out.println("DATA INSERTED SUCCESSFULLY..!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// UPDATE DATA
	private static void updateEmpData(Connection con, Scanner scan) {
	  try {
		PreparedStatement pstmt = con.prepareStatement(UPDATE_DATA);
		
		System.out.println("Enter a ID Number Whose Salary needs to be updated = ");
		int id = scan.nextInt();
		
		pstmt.setInt(1, id);
		pstmt.execute();
		
		System.out.println("SALARY FOR EMPLOYEE ID = " + id + ", HAS BEEN UPDATED");
	} catch (SQLException e) {
		e.printStackTrace();
	}
  }

	// READ DATA
	private static void selectEmpData(Connection con, Scanner scan) {
		try {
			// 3. Create a Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(READ_DATA);
			// 4. Send and Execute the Query
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(
						"ID = " + rs.getInt(1) + ", NAME = " + rs.getString(2) + ", SALARY = " + rs.getDouble(3));
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

	//DELETE DATA
	private static void deleteEmpData(Connection con, Scanner scan) {
	 try {
		PreparedStatement pstmt = con.prepareStatement(DELETE_DATA);
		System.out.println("Enter a ID whose data is to be deleted");
		int id = scan.nextInt();
		
		pstmt.setInt(1, id);
		pstmt.execute();
		
		System.out.println("The Employee Data with ID = " + id + ", has been Deleted sucessfully");
		
	} 
	 catch (SQLException e) {
		e.printStackTrace();
	}

	}

}
