package com.revature.app;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.revature.app.model.Department;

public class GetByCondition {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
        session.beginTransaction();
        
        TypedQuery<Department> query = session.createQuery("from Department d where d.name like :name", Department.class);
        query.setParameter("name", "%Ma%");
        List<Department> departmentList = query.getResultList();
        departmentList.forEach(System.out::println);
        
        session.getTransaction().commit();
        
        session.close();

	}

}
