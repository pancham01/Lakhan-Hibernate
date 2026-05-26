package com.hbn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee e = new Employee(1, "Vikas", "male", 330000);

		
//		1.
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");		
//		2.
		SessionFactory sf = cfg.buildSessionFactory();
//		3.
		Session session = sf.openSession();
//		4.
		Transaction tx = session.beginTransaction();
		
		session.persist(e);
		
		tx.commit();
		
		
		
	}

}
