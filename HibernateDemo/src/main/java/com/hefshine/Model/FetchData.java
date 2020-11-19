package com.hefshine.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
	
	
		
		Employee emp=session.load(Employee.class, 1);
		
		System.out.println("Ans is:  "+emp);
		
				
		session.close();
		
		System.out.println("Done all");
		

	}

}
