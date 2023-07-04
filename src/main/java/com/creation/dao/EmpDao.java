package com.creation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.creation.entity.Emp;

public class EmpDao {
	
	private SessionFactory sessionfactory;

	public EmpDao(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	public boolean saveEmp(Emp emp)
	{
		boolean f = false;
		Emp newemp = null;
		
		Session session =  sessionfactory.openSession();
		Transaction tx =  session.beginTransaction();
		
	     int i = 	(Integer) session.save(emp);
	     
	     if (i>0) {
			f=true;
		}
		
		tx.commit();
		return f;
		
	}
	
	
}
