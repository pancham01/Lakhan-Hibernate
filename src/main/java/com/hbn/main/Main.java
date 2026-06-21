package com.hbn.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Address;
import com.hbn.entity.Employee;

public class Main {
	
	
	public static void saveRecord(Session session) {
		Transaction tx = session.beginTransaction();

		Address add1 = new Address();
		add1.setCity("Noida");
		add1.setState("UP");
		

		Employee e1 = new Employee();
		e1.setName("Lakhan");
		e1.setGender("male");
		e1.setSalary(55000);
		
		
		e1.setAddress(add1);
		
		add1.setEmployee(e1);

		
//		session.persist(add1);
		session.persist(e1);
		
		tx.commit();
	}

	public static void main(String[] args) {

		Session session = HibernateConfig.getSessionFactory().openSession();
		
//		saveRecord(session);	
		
		
		Employee employee = session.find(Employee.class, 1);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		
//		Address address = session.find(Address.class, 1);
//		System.out.println(address);
//		System.out.println(address.getEmployee());
		
//		
		
		
		
	
	}

}
