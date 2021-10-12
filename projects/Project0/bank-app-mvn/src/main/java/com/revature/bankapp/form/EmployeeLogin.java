package com.revature.bankapp.form;
import java.sql.SQLException;
import java.util.Scanner;

//import com.revature.bankapp.dao.EmployeeDao;
import com.revature.bankapp.dao.impl.EmployeeDaoImpl;
import com.revature.bankapp.menu.EmployeeMenu;
import com.revature.bankapp.model.Employee;

public class EmployeeLogin extends Form {

	private String employeeId;
	private String password;

	public EmployeeLogin(String name) {
		super(name);
		
	}

	@Override
	public void captureData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Employee UserName: ");
		employeeId = sc.nextLine();

		System.out.print("Password: ");
		password = sc.nextLine();

	}

	@Override
	public void action() {
		
		EmployeeDaoImpl edao = new EmployeeDaoImpl();
		try {
			Employee employee = edao.getEmployeeUserName(employeeId);
			if (employee == null) {
				System.out.println("Invalid Username or Passworrd");
			} else if (employee.getPassword().equals(password)) {
				success = true;
				System.out.println("Login Successfull\n");
				System.out.println("Welcome " + employee.getName());
				EmployeeMenu empMenu = new EmployeeMenu("Employee Options");
				empMenu.displayMenuAndCaptureSelection();
			} else {
				System.out.println("Invalid Username or Password");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("*########## LOGIN FAILED ##########");
		}

	}

}
