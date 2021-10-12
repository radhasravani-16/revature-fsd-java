package com.revature.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.app.model.Department;
import com.revature.app.model.Employee;

public interface DepartmentDao {
	
	  List<Department> list() throws SQLException;
	

}