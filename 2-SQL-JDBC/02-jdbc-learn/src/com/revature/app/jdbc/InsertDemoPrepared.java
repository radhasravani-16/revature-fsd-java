package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemoPrepared {

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
			String sql = "insert into department (name) values (?)";
			
			//When many parameters are required
			/*String sql = "insert into employee (name, salary, gender, department_id) values (?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "Jacob");
			statement.setDouble(2, 1500.0);
			statement.setString(3, "M");
			statement.setInt(4, 2);
			statement.executeUpdate();
			connection.close();*/

			//sql injection demo code
			/*String departmentName = "Statistics";
			String sql = "insert into department (name) values ('" + departmentName + "')";
			statement.executeUpdate(sql);
			
			departmentName = "Research";
			sql = "insert into department (name) values ('" + departmentName + "')";
			statement.executeUpdate(sql);
			
			String email = "123@gmail.com' or 1 = 1";
			sql = "select * from user where email = '" + email + "'";
			
			
			sql = "select * from user where email = '123@gmail.com' or 1 = 1";*/

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "Research");
            statement.executeUpdate();
            
            statement.setString(1, "Statistics");
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
