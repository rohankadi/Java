package com.kn.JDBCBatchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_BatchProcessing2 {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "dream";
	private static final String QUERY1 = "UPDATE STUDENT SET GENDER = 'MALE' WHERE ID != 11 AND ID != 13;";
	private static final String QUERY2 = "UPDATE STUDENT SET GENDER = 'FEMALE' WHERE ID = 11 OR ID = 13;";

	public static void main(String[] args) {
		try {
			// 1. LOAD AND REGISTER THE DRIVER
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. ESTABLISH THE CONNECTION WITH DATABASE
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			// 3. CREATE A STATEMENT
			Statement stmt = con.createStatement();

			// BATCH PROCESSING EXECUTING MULTIPLE QUERIES AT A TIME
			// A. SET AUTOCOMMIT FALSE
			con.setAutoCommit(false);
			// B. ADD BATCH TO TASK
			stmt.addBatch(QUERY1);
			stmt.addBatch(QUERY2);
			// C. GET COUNT OF RECORDS AFFECTED
			int[] countBatch= stmt.executeBatch();
			for(int count : countBatch) {
				System.out.println(count + " rows affected");
			}
			// D. COMMIT
			con.commit();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
