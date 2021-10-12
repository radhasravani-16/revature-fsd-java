package com.revature.bankapp.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.model.Customer;

public class CustomerDaoImplTest {
	
	Customer customer = new Customer("Abhi", "knl","abhi27","2727");
	CustomerDaoImpl dao = new CustomerDaoImpl();
	
	@Test
	 void testCreate()  {
		
		try {
			dao.create(customer);
		} catch (SQLException e) {
			
			e.printStackTrace();
			fail("Not yet implemented");
		}
	}
	
		@Test
		void testGetCustomer() {
			try {
				CustomerDaoImpl.getCustomerEmail("abhi27");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("No data found");
				
			}
		}
}