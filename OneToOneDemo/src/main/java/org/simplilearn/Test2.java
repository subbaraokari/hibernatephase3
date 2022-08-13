package org.simplilearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.entities.Course;
import org.simplilearn.entities.Student;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Student st=session.get(Student.class,1);
		Course c1=new Course();
		c1.setCourseName("Java");
		c1.setFee(500);
		Course c2=new Course();
		c2.setCourseName(".net");
		c2.setFee(200);
		Course c3=new Course();
		c3.setCourseName("Python");
		c3.setFee(100);
		st.addCourse(c1);
		st.addCourse(c2);
		st.addCourse(c3);
		c1.setStudent(st);
		c2.setStudent(st);
		c3.setStudent(st);
		session.save(st);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		tx.commit();
		session.close();
	}

}
