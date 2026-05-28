package com.hbn.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	
	
	public static SessionFactory getSessionFactory()
	{
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg1.xml").build();
		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		return meta.buildSessionFactory();
//		return new Configuration().configure("hibernate.cfg1.xml").buildSessionFactory();
	}

}
