package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			//Driver driver = new Driver();
			//Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					               "jdbc:mysql://localhost:3307/learndb", 
					                    "root",
					                    "sravani16");
			System.out.println("Connection successful.");
			String sql = "insert into department (name) values ('Innovation')";
			Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
