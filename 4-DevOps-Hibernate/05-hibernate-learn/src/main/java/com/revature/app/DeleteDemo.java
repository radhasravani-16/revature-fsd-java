package com.revature.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.app.model.Department;

public class DeleteDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
        session.beginTransaction();
        
        Department department = new Department();
        department.setId(10);
        session.remove(department);
        
        session.getTransaction().commit();
        
        session.close();
	}

}
