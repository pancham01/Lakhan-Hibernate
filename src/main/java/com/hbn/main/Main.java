package com.hbn.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

import jakarta.persistence.Query;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
//		To get all the records from DB
//		Query query = session.createQuery("from Employee",Employee.class);
//		List list = query.getResultList();
//		System.out.println(list);
		
//		To get records with Pagination from DB
//		Query query = session.createQuery("from Employee",Employee.class);
//		query.setFirstResult(2);
//		query.setMaxResults(4);
//		
//		List list = query.getResultList();
//		System.out.println(list);

//		To Update the records in DB
//		MutationQuery query = session.createMutationQuery("update Employee set name =:n where id =:i");
//		query.setParameter("n", "Udit Narayan");
//		query.setParameter("i", 3);
//		
//		query.executeUpdate();
		
//		To delete a records from DB
//		MutationQuery query = session.createMutationQuery("delete from Employee where id =:i");
//		query.setParameter("i", 7);
//		query.executeUpdate();
		
		
//		Aggregation Function
		Query query1 = session.createQuery("select max(name) from Employee");
		List list = query1.getResultList();
		System.out.println(list);

		tx.commit();

	}

}
