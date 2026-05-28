package com.hbn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee e = new Employee( "Vikas", "male", 330000);

		
		Session session = HibernateConfig.getSessionFactory().openSession();
//		4.
		Transaction tx = session.beginTransaction();
		
		session.persist(e);
		
		tx.commit();
		
		
		
	}

}
