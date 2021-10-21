package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.model.Customer;

public interface EmployeeDao {
	List<Customer> viewCustomer() throws SQLException;

}
