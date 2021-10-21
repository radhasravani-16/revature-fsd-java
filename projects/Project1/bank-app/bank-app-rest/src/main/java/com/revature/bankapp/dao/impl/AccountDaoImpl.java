package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.dao.AccountDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.menu.TransactionMenu;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Transactions;

public class AccountDaoImpl implements AccountDao{
	CustomerDaoImpl cdaoo = new CustomerDaoImpl();
	public static int currentAccountId;
	public static int transferAccountId;

	public void create(Account account) throws AppException {
		System.out.println("Create Account ");
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into account (accountnumber,balance,customerid) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, account.getAccountNumber());
			statement.setDouble(2, account.getBalance());
			statement.setInt(3, CustomerDaoImpl.currentCustomerId);
			statement.executeUpdate();

		}
		
		catch(SQLException e) {
			e.printStackTrace();
		
			throw new AppException(e);
		}
	}
	public void insert(Transactions transaction) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into transaction (type, amount, accountid) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, String.valueOf(transaction.getType()));
			statement.setDouble(2, transaction.getAmount());
			statement.setInt(3, currentAccountId);
			statement.executeUpdate();

		}

	}

	public void update(Account account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account set balance = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, account.getBalance());
			statement.setInt(2, currentAccountId);
			statement.executeUpdate();
		}

	}

	public static List<Transactions> transactionList(int id) throws SQLException {
		List<Transactions> transactionList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from transaction where accountid = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			

			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Transactions t = new Transactions();
				t.setType(resultSet.getString("type").charAt(0));
				t.setAmount(resultSet.getDouble("amount"));
				t.setAccountId(resultSet.getInt("accountId"));
				transactionList.add(t);

			}
		}

		return transactionList;
	}


	public List<Account> accountList(int id) throws SQLException {
		List<Account> accountList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where customerid = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account account = new Account();
				account.setAccountNumber(resultSet.getString("accountnumber"));
				account.setBalance(resultSet.getDouble("balance"));
				account.setId(resultSet.getInt("id"));
				accountList.add(account);

			}
		}

		return accountList;

	}
	
	public List<Account> accountList() throws SQLException {
		List<Account> accountList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where customerid = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, cdaoo.currentCustomerId);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account account = new Account();
				account.setAccountNumber(resultSet.getString("accountnumber"));
				account.setBalance(resultSet.getDouble("balance"));
				account.setId(resultSet.getInt("id"));
				accountList.add(account);

			}
		}

		return accountList;

	}
	
	public static Account currentAccount(String accNum) throws SQLException {
		Account account = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where accountnumber = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, accNum);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				currentAccountId = resultSet.getInt("id");
				String accNumber = resultSet.getString("accountnumber");
				Double balance = resultSet.getDouble("balance");

				account = new Account(accNumber, balance);
			}
		}
		return account;
	}
	
	public static void updateTransfer(Account account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account set balance = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, account.getBalance());
			statement.setInt(2, transferAccountId);
			statement.executeUpdate();
		}
	}

	public Account transferAccount() throws SQLException {
		Account account = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where accountnumber = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, TransactionMenu.transferAccNum);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				transferAccountId = resultSet.getInt("id");
				String accNumber = resultSet.getString("accountnumber");
				Double balance = resultSet.getDouble("balance");

				account = new Account(accNumber, balance);
			}
		}
		return account;
	}
	
	public static void insertTransfer(Transactions transaction) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into transaction (type, amount, accountid) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, String.valueOf(transaction.getType()));
			statement.setDouble(2, transaction.getAmount());
			statement.setInt(3, transferAccountId);
			statement.executeUpdate();
		}
	}

}