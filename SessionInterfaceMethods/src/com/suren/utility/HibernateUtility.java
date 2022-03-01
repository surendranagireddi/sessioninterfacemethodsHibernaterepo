package com.suren.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	

	private static SessionFactory factory;
	
	static {
		 Configuration cfg = new Configuration();
		 cfg.configure("com/suren/config/hibernate.cfg.xml");
		 factory = cfg.buildSessionFactory();
		 
	}
	public static Session getSession() {
		Session session = null;
		
		if(factory != null) {
			session = factory.openSession();
		}
		return session;
	}

}
