package com.revature.bankapp.model;

public class Employee {
	
	private String name;
	private String userName;
	private String password;
	
	
	public Employee(String name, String userName, String password) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}
	

}