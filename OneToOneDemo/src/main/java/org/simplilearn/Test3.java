package org.simplilearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.entities.Role;
import org.simplilearn.entities.User;

public class Test3 {

	public static void main(String[] args) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		try
		{
			User u1=new User();
			u1.setUsername("ksrao");
			u1.setPassword("ksrao@123");
			User u2=new User();
			u2.setUsername("Ram");
			u2.setPassword("Ram@123");
			Role r1=new Role();
			r1.setRoleName("ADMIN");
			Role r2=new Role();
			r2.setRoleName("MANAGER");
			u1.addRole(r1);
			u1.addRole(r2);
			r1.addUser(u1);
			r2.addUser(u1);
			u2.addRole(r1);
			r1.addUser(u2);
			session.save(u1);
			session.save(u2);
			session.save(r1);
			session.save(r2);
			tx.commit();
		}
		catch(Exception e)
		{
			tx.rollback();
		}
		session.close();
	}

}
