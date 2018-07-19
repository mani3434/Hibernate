package com.fund.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {
		
		userDetails us = new userDetails();
		us.setUserId(1);
		us.setUserName("mani");
		
		userDetails us1 = new userDetails();
		us1.setUserId(2);
		us1.setUserName("jaga");
		
		Configuration conf = new Configuration()
				.configure("hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		
		Session s = sf.openSession();
		s.beginTransaction();
		s.persist(us);
		//s.persist(us1);
		s.getTransaction().commit();
		s.close();
		
		Session s1 = sf.openSession();
		s1.beginTransaction();
		s1.persist(us1);
		s1.getTransaction().commit();
		s1.close();
		
		sf.close();
	}
}
