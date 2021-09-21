package com.js.dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.js.beans.Policy;
import com.js.beans.Customer;
import com.js.util.HibernateUtility;

public class UserImpl {
	
	
	
public static void main(String[] args) {
	
	
	Session session = HibernateUtility.getSession();
	
	
	
	
	Transaction tx = session.beginTransaction();
	
	
	
	Policy policy = new Policy();
	policy.setPolicyName("Active assured");
	policy.setPolicyType("GHI");
	policy.setPolicyNumber(147);
	
	
	Customer c = new Customer();
	c.setPolicy(policy);
	c.setPolicyNumber(147);
	c.setEnsured1("raja");
	
	
	Customer c2 = new Customer();
	c2.setPolicy(policy);
	c2.setPolicyNumber(147);
	c2.setEnsured1("rani");   
	
	
	
	Customer c3 = new Customer();
	c3.setPolicy(policy);
	c3.setPolicyNumber(147);
	c3.setEnsured1("manhes");
	
	
	
	   
	System.out.println(session.get(Policy.class,147));
     

	 
	//session.save(c);
	//session.save(c2);
	//session.save(c3);

	
	tx.commit();
	
	
	
	
	
}

}
