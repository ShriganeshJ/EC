package com.js.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	
	static ThreadLocal<Session> threadLocal = new ThreadLocal<>();
	static SessionFactory facoty = null;
	
	static
	{
		facoty= new Configuration().configure("com/js/config/Hbm-config.xml").buildSessionFactory();
	}
	
	
	public static Session getSession()
	{
		
		Session session=null;
		
		
		if(threadLocal.get()==null)
		{
		session=facoty.openSession();
		threadLocal.set(session);
		}
		else
		{
			session=threadLocal.get();
		}
		
		
		return session;
		
		
	}
	
	public static void closeSession()
	{
		if(threadLocal.get()!=null)
		{
		
		threadLocal.get().close();
		threadLocal.remove();
		}
	}
	
	
	public  static void closeSessionFactory()
	{
		facoty.close();
	}

}
