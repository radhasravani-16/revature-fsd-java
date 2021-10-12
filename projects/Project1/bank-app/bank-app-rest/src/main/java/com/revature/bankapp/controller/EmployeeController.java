package com.revature.bankapp.controller;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.revature.bankapp.dao.impl.EmployeeDaoImpl;

import com.revature.bankapp.model.Employee;

@Path("/employees/{username}/{password}")
public class EmployeeController {
	@GET
//	@Path("/{userName}/{password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("username") String username, @PathParam("password")  String password) {
		System.out.println("Employee userName: " + username);
		try {
		
		   EmployeeDaoImpl empl = new EmployeeDaoImpl();
			Employee employee = empl. getEmployeeUserName(username);
			if (employee == null) {
				return Response.status(401).build();
			}
			else if (employee.getPassword().equals(password)) {
				System.out.println("Success");
				return Response
						.ok()
						.entity(employee)
						.build();
			} else {
				System.out.println("failed");
				return Response.status(401).build();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(500).build();
		}
	
  
  }
}