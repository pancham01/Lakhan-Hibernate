package com.hbn.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee( );

		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.load(e1, 5);
		
//		Employee employee = session.find(Employee.class, 155);
//		
//		System.out.println(employee);
		
		System.out.println(e1);
		
		tx.commit();
		
		
		
	}

}
