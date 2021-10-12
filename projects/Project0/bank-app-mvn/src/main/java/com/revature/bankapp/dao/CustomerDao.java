package com.revature.bankapp.dao;

import java.sql.SQLException;

import com.revature.bankapp.model.Customer;

public interface CustomerDao {
	int create(Customer customer) throws SQLException;

}
