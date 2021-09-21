package com.js.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.js.beans.Customers;
import com.js.beans.PanCard;
import com.js.util.HibernateUtility;

public class UserImpl {

	public static void main(String[] args) {

		Session session = HibernateUtility.getSession();

		Transaction tx = session.beginTransaction();

		Customers c = new Customers();
		c.setAddress("hyderabad");
		c.setName("raja");
		c.setPanNumber(1234);
		PanCard p = new PanCard();
		p.setAddress("hyderabad");
		p.setCustomerName("raja");
		p.setPanNumber(12345);

		c.setPanc(p);

		p.setCustomer(c);

		session.save(p);

		tx.commit();

	}

}
