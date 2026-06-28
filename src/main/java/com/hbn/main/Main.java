package com.hbn.main;

import java.util.ArrayList;

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
		
		Address add2 = new Address();
		add2.setCity("GZB");
		add2.setState("UP");
		
		Address add3 = new Address();
		add3.setCity("Gurgaon");
		add3.setState("HR");
		
		ArrayList<Address> listOfAdd = new ArrayList<>();
		
		listOfAdd.add(add1);
		listOfAdd.add(add2);
		listOfAdd.add(add3);
		
		

		Employee e1 = new Employee();
		e1.setName("Lakhan");
		e1.setGender("male");
		e1.setSalary(55000);
		e1.setAddress(listOfAdd);
		
		add1.setEmployee(e1);
		add2.setEmployee(e1);
		add3.setEmployee(e1);
		
		
		session.persist(e1);
		
		tx.commit();
	}

	public static void main(String[] args) {

		Session session = HibernateConfig.getSessionFactory().openSession();
		
//		saveRecord(session);
		
		
//		Employee employee = session.find(Employee.class, 1);
//		System.out.println(employee);
//		
		Address address = session.find(Address.class, 2);
		
		System.out.println(address);
		System.out.println(address.getEmployee());
	
	}

}
