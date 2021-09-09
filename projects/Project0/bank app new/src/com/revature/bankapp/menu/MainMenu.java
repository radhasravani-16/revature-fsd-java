package com.revature.bankapp.menu;

import java.util.Scanner;

import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class MainMenu extends Menu{

	public MainMenu(String name) {
		super(name);
		addMenuItem("Register new Customer");
		addMenuItem("Login as Customer");
		addMenuItem("Login as Employee");
		addMenuItem("Exit");
		
	}

	@Override
	void handleAction() {
		Scanner sc = new Scanner(System.in);
		switch(selection) {
		case 1:
			System.out.println("Register new customer");
			System.out.println("------------------------");
			
			System.out.println("First Name: ");
			String firstName = sc.nextLine();
			
			System.out.println("Last Name: ");
			String lastName = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Password: ");
			String password = sc.nextLine();
			
			DataManager.addCustomer(new Customer(firstName, lastName, email, password));
			System.out.println("Customer added successfully.");
			displayMenuAndCaptureSelection();
			break;
			
		case 2:
			LoginForm loginForm = new LoginForm("Login Form");
			loginForm.captureDataAndPerformAction();
			break;
			/*System.out.println("Login");
			System.out.println("------------------------");
			System.out.println("Email: ");
			email = sc.nextLine();
			System.out.println("Password: ");
			password = sc.nextLine();
			
			Customer customer = DataManager.getCustomerByEmail(email);
			if(customer == null) {
				System.out.println("Invalid email / password");
				
			}
			else if(customer.getPassword().equals(password)) {
				System.out.println("Login Successful");
				System.out.println("Welcome " + customer.getFirstName());
			}
			else {
				System.out.println("Invalid email / password");
			}*/
		}
		
	}
	

}
