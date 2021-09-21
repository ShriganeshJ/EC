package com.js.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.js.beans.EmailBodyData;
import com.js.util.HibernateUtility;

public class UserImpl {

	public static void main(String[] args) {

		Session session = HibernateUtility.getSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			org.hibernate.query.Query q = session.createQuery("from EmailBodyData");

			List<EmailBodyData> list = q.list();
			System.out.println(list);

		} catch (Exception e) {
			tx.rollback();
		}

		// for single row

		try {
           System.out.println("Unique Result.......");
			//tx = session.beginTransaction();
			org.hibernate.query.Query q = session.createQuery("from EmailBodyData where aggId='452169630'");

			EmailBodyData em = (EmailBodyData) q.uniqueResult();
			System.out.println(em);

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		
		
		//for specific row 
		
		
		try {
	           System.out.println("Object Result.......");
				//tx = session.beginTransaction();
				org.hibernate.query.Query q = session.createQuery("select aggId,rcNumber from EmailBodyData where aggId='452169630'");

			    Object [] obj = (Object[]) q.uniqueResult();
			    
			    
			    
			    for(int i  =0;i<obj.length;i++)
			    {
			    	
			    	System.out.println(obj[i]);
			    	
			    }

			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
		
		//get list of object 
		
		try {
	           System.out.println("Object Result List .......");
				//tx = session.beginTransaction();
				org.hibernate.query.Query q = session.createQuery("select aggId,rcNumber from EmailBodyData ");

			    List<Object[]>  obj =  q.list();
			
			    for(Object[] obj1 :obj)
			    {
			    	System.out.println(obj1[0]);
			    	System.out.println(obj1[1]);
			    }
			    
			   
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}

	//aggregate function 
		try {
	           System.out.println("Total count Result List .......");
				//tx = session.beginTransaction();
				org.hibernate.query.Query q = session.createQuery("select count(aggId) from EmailBodyData ");

			    Long lon =(Long)  q.uniqueResult();
			
			   System.out.println("Total count"+lon);
			    
			   
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}

	
	
	
	


}
}
