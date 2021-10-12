package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

//import com.revature.bankapp.account.ViewAccount;
import com.revature.bankapp.display.DisplayTransaction;
import com.revature.bankapp.dao.impl.AccountDaoImpl;

public class TransactionMenu extends Menu {

	public static String transferAccNum;

	CustomerMainMenu cmm = new CustomerMainMenu("Customer Menu");
	public static String accNumber;

	Scanner sc = new Scanner(System.in);

	public TransactionMenu(String name) {
		super(name);
		addMenuItem("Withdraw");
		addMenuItem("Deposit");
		addMenuItem("View Transactions");
		addMenuItem("View Balance");
		addMenuItem("Transfer to account");
		addMenuItem("Return to Customer Menu");
		addMenuItem("LogOut");
	}

	public String getAccount() {
		System.out.println("Enter Account number to make transaction: ");
		accNumber = sc.nextLine();
		System.out.println("Account Number: " + accNumber);
		return accNumber;
	}

	@Override
	void handleAction() {
		AccountDaoImpl accountdao = new AccountDaoImpl();
		switch (selection) {

		case 1:
			try {
				System.out.println("Enter amount to withdraw: ");
				double amount = sc.nextDouble();
				accountdao.currentAccount().withdraw(amount);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			cmm.displayMenuAndCaptureSelection();
			break;

		case 2:

			try {
				System.out.println("Enter amount to deposit: ");
				double amount = sc.nextDouble();
				accountdao.currentAccount().deposit(amount);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			cmm.displayMenuAndCaptureSelection();
			break;

		case 3:
			try {
				AccountDaoImpl.currentAccount();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DisplayTransaction.TransactionList();
			cmm.displayMenuAndCaptureSelection();
			break;

		case 4:
			try {
				double balance = accountdao.currentAccount().getBalance();
				System.out.println("Balance: " + balance);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			cmm.displayMenuAndCaptureSelection();
			break;

		case 5:
			System.out.println("Enter Account Number of receiver: ");
			transferAccNum = sc.nextLine();
			System.out.println("Enter amount to transfer: ");
			double amount = sc.nextDouble();
			try {
				accountdao.currentAccount().withdraw(amount);
				System.out.println("Initiated");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("withdraw failed");
			}
			try {
				accountdao.transferAccount().transfer(amount);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("deposit failed");
			}
			cmm.displayMenuAndCaptureSelection();
			break;

		case 6:
			cmm.displayMenuAndCaptureSelection();
			break;

		case 7:
			CustomerMainMenu cm = new CustomerMainMenu("Customer Menu");
			cm.displayMenuAndCaptureSelection();
		}

	}

}
