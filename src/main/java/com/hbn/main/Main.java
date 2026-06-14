package com.hbn.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee( "Vinay", "male", 330000);

		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(e1);
		
		tx.commit();
		
		
		
	}

}
