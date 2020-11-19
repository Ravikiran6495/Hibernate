package com.hefshine.Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataSave {
	
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee emp=new Employee();
		emp.setReg_number(5);
		emp.setName("A");
		emp.setDepartment("java");
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(emp);
		
		tx.commit();
		
		session.close();
		
		System.out.println("Done all");
		
		
	}

}