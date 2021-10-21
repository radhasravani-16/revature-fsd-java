package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.bankapp.model.Account;
import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDaoImpl.class);

	public static int currentCustomerId;

	public int create(Customer customer) throws AppException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into customer (FirstName, LastName, Email, Password) values (?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, customer.getFirstName());
			statement.setString(2, customer.getLastName());
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getPassword());
			//statement.setString(5, customer.getPhoneno());
			statement.executeUpdate();

			ResultSet rs = statement.getGeneratedKeys();
			if (rs.next()) {
				return rs.getInt(1);
			}
			return 0;
		}catch (SQLException e) {
			LOGGER.error("Error inserting customer",e);
			throw new AppException(e);	
		}
	}

	public Customer getCustomerEmail(String Email) throws SQLException {
		Customer customer = null;

		try (Connection connection = Util.getConnection()) {
			String sql = "select * from customer where Email = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, Email);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				currentCustomerId = resultSet.getInt("id");
				String FirstName = resultSet.getString("FirstName");
				String LastName = resultSet.getString("LastName");
				String email = resultSet.getString("Email");
				String password = resultSet.getString("password");
				//String phoneno = resultSet.getString("Phoneno");

				customer = new Customer(FirstName, LastName, email, password);
			}
		}
		return customer;
	}

	public static List<Customer> customerList() throws SQLException {
		List<Customer> customerList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from customer";
			PreparedStatement statement = connection.prepareStatement(sql);
			// statement.setInt(1, cdaoo.currentCustomerId);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Customer c = new Customer();
				c.setFirstName(resultSet.getString("FirstName"));
				c.setLastName(resultSet.getString("LastName"));
				c.setEmail(resultSet.getString("Email"));
				//c.setPhoneno(resultSet.getString("Phoneno"));
				customerList.add(c);

			}
		}

		return customerList;
	}
}