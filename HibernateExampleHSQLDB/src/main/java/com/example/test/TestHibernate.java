package com.example.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.util.HibernateUtil;

public class TestHibernate {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	      session.beginTransaction();
	      // Add new Employee object
	      EmployeeEntity emp = new EmployeeEntity();
	      emp.setEmployeeId(1);	      
	      emp.setName("demo");	      
	      session.save(emp);
	      session.getTransaction().commit();
	      
	      String hql = "FROM EmployeeEntity";
	      Query query = session.createQuery(hql);
	      List<?> results = query.list();
	      
	      Iterator<?> it = results.iterator();
	      while(it.hasNext())
	      {
	    	  EmployeeEntity emp1 = (EmployeeEntity)it.next();
	    	  System.out.println(emp1.getEmployeeId() + " " + emp1.getName());
	      }
	      HibernateUtil.shutdown();
	}

}
