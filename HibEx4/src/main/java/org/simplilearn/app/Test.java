package org.simplilearn.app;

import org.hibernate.Session;
import org.simplilearn.app.dao.EmpDao;
import org.simplilearn.app.dao.EmpDaoImpl;
import org.simplilearn.app.entities.Emp;

public class Test {

	public static void main(String[] args) {
		EmpDao dao=new EmpDaoImpl();
		/*dao.getAll().forEach(emp->{
			System.out.println(emp.getEno()+"\t"+emp.getName()+"\t"+emp.getAddress());
		});*/
		
		//Emp emp=dao.getByName("ram");
		//System.out.println(emp.getEno()+"\t"+emp.getName()+"\t"+emp.getAddress());
		//updating
		/*
		 * Emp e=new Emp(); e.setEno(1); e.setName("Ramana"); e.setAddress("Bangalore");
		 * dao.update(1, e);
		 */
		dao.delete(2);
	}

}
