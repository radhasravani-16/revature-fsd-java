package com.revature.bankapp.model;

public class Transactions {

	private int customerId;
	private String FirstName;
	private String LastName;

	private String accountNumber;
	private double balance;
	private int accountId;
	private char type;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private double amount;

	public Transactions(char type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	public Transactions() {

	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return FirstName;
	}

	public void setName(String name) {
		this.FirstName = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getInitialAmount() {
		return balance;
	}

	public void setInitialAmount(double initialAmount) {
		this.balance = initialAmount;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String print() {
		return "Type: " + type + "  Amount: " + amount;
	}

	@Override
	public String toString() {
		return "CustomerId: " + customerId + "  Name: " + FirstName + "  Account Number: " + accountNumber
				+ "  Balance: " + balance + "  Account Id: " + accountId + "  Type: " + type + "  Amount: " + amount;
	}

}
