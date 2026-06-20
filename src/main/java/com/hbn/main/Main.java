package com.hbn.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

import jakarta.persistence.Query;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Query query = session.createNamedQuery("findById", Employee.class);
		query.setParameter("id", 2);
		List list = query.getResultList();
		System.out.println(list);

		System.out.println("----------------------------------");
		
		
		Query query2 = session.createNamedQuery("findByGender",Employee.class);
		query2.setParameter("gender", "female");
		
		List list2 = query2.getResultList();
		System.out.println(list2);
		
		
		tx.commit();

	}

}
