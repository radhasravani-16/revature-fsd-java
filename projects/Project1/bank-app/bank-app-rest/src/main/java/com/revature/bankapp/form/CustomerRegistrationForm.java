package com.revature.bankapp.form;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.exception.AppException;
//import com.revature.bankapp.menu.MainMenu;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class CustomerRegistrationForm extends Form {
	private String firstName;
	private String lastName;
	private String email;
	private String password;

	public CustomerRegistrationForm(String name) {
		super(name);

	}

	@Override
	public void captureData() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Name:");
		firstName = scanner.nextLine();
		System.out.print("Enter LastName:");
		lastName = scanner.nextLine();
		System.out.print("Enter emailId:");
		email = scanner.nextLine();
		System.out.print("Setup password:");
		password = scanner.nextLine();

		//DataManager.addCustomer(new Customer(firstName, lastName, email, password, Customer.createAccountList()));
		CustomerDaoImpl customerdao = new CustomerDaoImpl();
		System.out.println(new Customer(firstName, lastName, email, password));
		try {
			customerdao.create(new Customer(firstName, lastName, email, password));
		} catch (AppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void action() {
		success = true;

	}

}