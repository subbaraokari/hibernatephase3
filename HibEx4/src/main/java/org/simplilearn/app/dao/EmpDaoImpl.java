package org.simplilearn.app.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.app.config.HibConfig;
import org.simplilearn.app.entities.Emp;

public class EmpDaoImpl implements EmpDao{

	@Override
	public List<Emp> getAll() {
		SessionFactory sessionFactory=null;
		Session session=null;
		List<Emp> employees=null;
		try
		{
			sessionFactory=HibConfig.getSessionFactory();
			session=sessionFactory.openSession();
			Query<Emp> query=session.createQuery("select e from org.simplilearn.app.entities.Emp e");
			employees=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return employees;
	}

	@Override
	public Emp getByName(String name) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Query<Emp> query=session.createQuery("select e from org.simplilearn.app.entities.Emp e where e.name=?1");
		query.setParameter(1, name);
		return query.uniqueResult();
	}

	@Override
	public void update(int eno, Emp e) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		/*
		 * Emp emp=session.get(Emp.class, eno); emp.setName(e.getName());
		 * emp.setAddress(e.getAddress()); session.saveOrUpdate(emp);
		 */
		Query<Emp> query=session.createQuery("update org.simplilearn.app.entities.Emp e set e.name=?1,e.address=?2 where e.eno=?3");
		query.setParameter(1, e.getName());
		query.setParameter(2, e.getAddress());
		query.setParameter(3, eno);
		query.executeUpdate();
		tx.commit();
		session.close();
	}

	@Override
	public void delete(int eno) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Query<Emp> query=session.createQuery("delete from org.simplilearn.app.entities.Emp e where e.eno=?1");
		query.setParameter(1, eno);
		
		query.executeUpdate();
		tx.commit();
		session.close();
	}

}
