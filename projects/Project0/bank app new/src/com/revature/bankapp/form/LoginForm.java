package com.revature.bankapp.form;

import java.util.Scanner;

import com.revature.bankapp.menu.CustomerMainMenu;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.DataManager;

public class LoginForm extends Form{
	private String email;
	private String password;
	
	public LoginForm(String name) {
		super(name);
	}
	
	public void captureData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Email: ");
		email = sc.nextLine();
		
		System.out.println("Password: ");
		password = sc.nextLine();
	}
	
	public void action() {
		Customer customer = DataManager.getCustomerByEmail(email);
		if(customer == null) {
			System.out.println("Invalid email / password");
			
		}
		else if(customer.getPassword().equals(password)) {
			success = true;
			System.out.println("Login Successful");
			CustomerMainMenu menu = new CustomerMainMenu("Customer Main Menu");
			System.out.println("Welcome " + customer.getFirstName());
		}
		else {
			System.out.println("Invalid email / password");
		}
	}
	

}
