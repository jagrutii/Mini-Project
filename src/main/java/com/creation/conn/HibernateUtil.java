package com.creation.conn;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.creation.entity.Emp;

public class HibernateUtil {

	private static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory() 
	{
		if (sessionfactory==null) {
			Configuration cfg = new Configuration();
			Properties properties = new Properties();
			
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_db");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Jaggudada@27");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			properties.put(Environment.HBM2DDL_AUTO, "update");
			properties.put(Environment.SHOW_SQL, true);
			
			cfg.setProperties(properties);
			cfg.addAnnotatedClass(Emp.class);
			
			ServiceRegistry sr =  new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
			sessionfactory =  cfg.buildSessionFactory(sr);
			
		}
		
		return sessionfactory;
	}
}
