package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bankapp.model.Account;
//import com.revature.bankapp.account.ViewAccount;
import com.revature.bankapp.dao.impl.AccountDaoImpl;
import com.revature.bankapp.display.DisplayAccounts;


public class CustomerMainMenu extends Menu {
	

	public CustomerMainMenu(String name) {
		super(name);
		addMenuItem("View Accounts");
		addMenuItem("Create Account");
		addMenuItem("Withdraw/Deposit");
		addMenuItem("Back To Main Menu");
		addMenuItem("Exit");
	}

	@Override
	void handleAction() {
		DisplayAccounts da = new DisplayAccounts();
		Scanner scanner = new Scanner(System.in);
		AccountDaoImpl accountdao = new AccountDaoImpl();
		switch(selection) {
		case 1:
			da.accountListandbalance();
			displayMenuAndCaptureSelection();
			break;
			
			
			
		case 2:
			System.out.println("\n===");
			System.out.println("Create Account");
			System.out.println("====\n");
			
			System.out.print("Enter Account Number: ");
			String accountNumber = scanner.nextLine();
			
			System.out.print("Enter Balance: ");
			double balance = scanner.nextDouble();
			
			try {
				accountdao.create(new Account(accountNumber,balance));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Account added successfully.");
			displayMenuAndCaptureSelection();
			break;
			
			
        case 3:
			
			System.out.println("Select Withdraw/Deposit");
			TransactionMenu tmenu = new TransactionMenu("Transaction Menu");
			tmenu.getAccount();
			tmenu.displayMenuAndCaptureSelection();
			break;
		case 4:
			CustomerMainMenu menu = new CustomerMainMenu("Logged out \n====\nMain menu");
			menu.displayMenuAndCaptureSelection();
			break;
			
		
			
		case 5:
			System.out.println("Thank You and Visit Again...!!!");
		}
		
		
	}

}
