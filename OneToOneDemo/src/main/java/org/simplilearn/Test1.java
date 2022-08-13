package org.simplilearn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.simplilearn.entities.Passport;
import org.simplilearn.entities.Student;

public class Test1 {

	public static void main(String[] args) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Passport passport=session.get(Passport.class, 1);
		Student st=passport.getStudent();
		System.out.println(st.getName()+"\t"+st.getAddress());
		System.out.println(passport.getPassportNumber()+"\t"+passport.getIssuedDate());
	}

}
