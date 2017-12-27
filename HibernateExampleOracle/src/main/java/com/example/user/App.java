package com.example.user;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.example.util.HibernateUtil;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		String hql = "FROM JJJ";
		Query<?> query = session.createQuery(hql);
		
		List<?> results = query.list();
		
		Iterator<?> it = results.iterator();
		
		while(it.hasNext())
		{
			JJJ jjj = (JJJ)it.next();
			
			System.out.println("YOUR COMPANY IS: " + jjj.getcode());
		}
		HibernateUtil.shutdown();
	}

}
