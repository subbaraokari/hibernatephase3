package org.simplilearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.config.HibConfig;
import org.simplilearn.entities.Customer;
import org.simplilearn.entities.Emp;
import org.simplilearn.entities.HourlyEmployee;
import org.simplilearn.entities.SalariedEmployee;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		/*
		 * SalariedEmployee se=new SalariedEmployee(); se.setName("suresh");
		 * se.setAddress("Chennai"); se.setSalary(50000); session.save(se);
		 */
		/*
		 * HourlyEmployee he=new HourlyEmployee(); he.setName("Raj");
		 * he.setAddress("Hyd"); he.setHourlyPay(2000); session.save(he);
		 */
		Emp e1=new Emp();
		e1.setName("suresh");
		e1.setAddress("Chennai");
		e1.setSalary(50000);
		e1.setDname("Java");
		session.save(e1);
		Customer c1=new Customer();
		c1.setName("Ramu");
		c1.setAddress("Hyd");
		c1.setOrderName("Bulk");
		c1.setOrderDate("10/05/2020");
		session.save(c1);
		tx.commit();
		session.close();
	}
}
