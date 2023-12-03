package com.kn.JDBCBatchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_BatchProcessing {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "dream";
	private static final String QUERY1 = "UPDATE TRAINERS SET GENDER = 'MALE' WHERE ID != 5;";
	private static final String QUERY2 = "UPDATE TRAINERS SET GENDER = 'FEMALE' WHERE ID = 5;";

	public static void main(String[] args) {
		try {
			// 1. Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Establish the Connection with DB
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			// 3. Create a Statement
			Statement stmt = con.createStatement();

			// BATCH PROCESSING EXECUTING MULTIPLE QUERIES AT A TIME

			// ---> (A) SET AUTOCOMMIT FALSE
			con.setAutoCommit(false);

			// ---> (B) ADD TASKS TO BATCH
			stmt.addBatch(QUERY1); // 5 rows affected
			stmt.addBatch(QUERY2); // 1 row affected

			// ---> (C) GET COUNT OF RECORDS AFFECTED
			int[] countBatch = stmt.executeBatch();
			for (int count : countBatch) {
				System.out.println(count + " rows affected");
			}

			// ---> (D) COMMIT
			con.commit();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
