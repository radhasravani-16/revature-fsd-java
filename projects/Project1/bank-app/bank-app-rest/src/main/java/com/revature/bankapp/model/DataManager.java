package com.revature.bankapp.model;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class DataManager {
	private static List<Customer> customerList = new ArrayList<>();
	private static int choice;
	private static Customer currentCustomer;
	static {
		customerList.add(new Customer("John", "Smith", "123", "123"));

	}

	public static void addCustomer(Customer customer) {
		customerList.add(customer);
	}

	public static Customer getCustomerByEmail(String email) {
		for (Customer customer : customerList) {
			if (customer.getEmail().equals(email)) {
				return customer;
			}
		}
		return null;
	}

	public static Customer getCurrentCustomer() {
		return currentCustomer;
	}

	public static void setCurrentCustomer(Customer currentCustomer) {
		DataManager.currentCustomer = currentCustomer;
	}

}