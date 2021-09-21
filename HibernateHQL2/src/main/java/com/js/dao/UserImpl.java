package com.js.dao;

import java.util.Date;
import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.js.beans.ClientProfile;
import com.js.util.HibernateUtility;

public class UserImpl {

	public static void main(String[] args) {

		Session session = HibernateUtility.getSession();
		Transaction tx = null;

		

		// for single row

		try {
           System.out.println("Unique Result.......");
           
           
           
          
			tx = session.beginTransaction();
			
		
		org.hibernate.query.Query q=	 session.createQuery("select sum(cancellationAmount) from ClientProfile where cancellationDate=:date02 ");
			  
		
		System.out.println(new Date());
			q.setParameter("date02",new Date());
			Double double01 =(Double) q.uniqueResult();
			System.out.println(double01);
			
			

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		
	
}
}
