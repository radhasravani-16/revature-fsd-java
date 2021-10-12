package com.revature.bankapp.model;

import java.util.Scanner;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	// private List<Account> accountList;

	private static long counter = 0;

	public Customer(String firstName, String lastName, String email, String password) {
		super();
		counter++;
		this.id = counter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public Customer() {

	}

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	

	public void setId(long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void withdrawl() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter amount to withdraw : ");
		long withdrwalAmount = scanner.nextLong();

	}

}