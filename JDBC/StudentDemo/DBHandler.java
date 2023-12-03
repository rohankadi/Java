package com.kn.JDBC.StudentDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHandler {
	private static final String QUERY = "INSERT INTO STUDENTS (NAME, MARKS) VALUES(?, ?);";

	public static void insertData(Connection con, Student s) {
		String name = s.getName();
		int marks = s.getmarks();

		try {
			PreparedStatement stmt = con.prepareStatement(QUERY);
			stmt.setString(1, name);
			stmt.setInt(2, marks);

			int count = stmt.executeUpdate();
			System.out.println(count + " rows affected");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
