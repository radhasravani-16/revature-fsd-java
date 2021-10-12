package com.revature.bankapp.form;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.menu.CustomerMainMenu;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class LoginForm extends Form {
	private String email;
	private String password;

	public LoginForm(String name) {
		super(name);
		
	}

	@Override
	public void captureData() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" EmailId : ");
		email = sc.nextLine();
		
		System.out.print(" Password : ");
		password = sc.nextLine();
	}

	@Override
	public void action() {
		CustomerDaoImpl customerdao = new CustomerDaoImpl();
		Customer customer;
		try {
			customer = customerdao.getCustomerEmail(email);
			System.out.println(customer);
			if (customer == null) {
				
				System.out.println("Invalid email / password");
			} else if (customer.getPassword().equals(password)) {
				success = true;
				System.out.println("Login Successful.");
				System.out.println("Welcome " + customer.getFirstName());
				CustomerMainMenu menu = new CustomerMainMenu("Customer Main Menu");
				menu.displayMenuAndCaptureSelection();
				
			} else {
				System.out.println("Invalid email / password");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
