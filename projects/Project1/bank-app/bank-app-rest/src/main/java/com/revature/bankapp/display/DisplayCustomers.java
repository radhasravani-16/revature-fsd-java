package com.revature.bankapp.display;

import java.sql.SQLException;
import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.model.Customer;

public class DisplayCustomers {

	public static Customer customerList() {
		int i = 1;
		try {
			for (Customer customer : CustomerDaoImpl.customerList()) {
				System.out.println((i) + "} " + " Name = " + customer.getFirstName() + customer.getLastName()
						+ "Email = " + customer.getEmail());
				i += 1;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
