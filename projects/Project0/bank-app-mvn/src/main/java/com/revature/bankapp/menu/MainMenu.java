package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.form.CustomerRegistrationForm;
import com.revature.bankapp.form.EmployeeLogin;
import com.revature.bankapp.model.Customer;


public class MainMenu extends Menu {

	public MainMenu(String name) {
		super(name);
		addMenuItem("Register new Customer");
		addMenuItem("Login as Customer");
		addMenuItem("Login as Employee");
		addMenuItem("Exit");
	}

	@Override
	void handleAction() {
		Scanner scanner = new Scanner(System.in);
		CustomerDaoImpl customerdao = new CustomerDaoImpl();
		switch (selection) {
		
		case 1:
			
			System.out.println("\n===");
			System.out.println("Register new Customer");
			System.out.println("====\n");
			
			System.out.print("First Name: ");
			String firstName = scanner.nextLine();
			
			System.out.print("Last Name: ");
			String lastName = scanner.nextLine();

			System.out.print("Email: ");
			String email = scanner.nextLine();

			System.out.print("Password: ");
			String password = scanner.nextLine();
			
			System.out.print("Phoneno: ");
			String phoneno = scanner.nextLine();
			
			try {
				customerdao.create(new Customer(firstName, lastName, email, password));
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			System.out.println("Customer added successfully.");
			displayMenuAndCaptureSelection();
			break;
		case 2:
			CustomerRegistrationForm loginForm = new CustomerRegistrationForm("Customer Login Form");
			loginForm.captureDataAndPerformAction();
			break;
		case 3:
			EmployeeLogin empl = new EmployeeLogin("Employee Login Forn");
			empl.captureDataAndPerformAction();
			break;
		case 4:
			System.out.println("Thank You Vist Again...!!!");
			break;
		}
	}
}