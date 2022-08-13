package org.simplilearn;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.entities.Passport;
import org.simplilearn.entities.Student;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory=HibConfig.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		try
		{
			Passport passport=new Passport();
			passport.setPassportNumber("sgfgsd343264326");
			passport.setIssuedDate(new Date(2007, 05, 06));
			Student st=new Student();
			st.setName("rana");
			st.setAddress("Chennai");
			st.setPassport(passport);
			session.save(st);
			tx.commit();
		}
		catch(Exception e)
		{
			tx.rollback();
		}
		/*Student st=session.get(Student.class, 1);
		Passport passport=st.getPassport();
		//System.out.println(st.getName()+"\t"+st.getAddress());
		System.out.println(passport.getPassportNumber()+"\t"+passport.getIssuedDate());
		*/
		session.close();
	}

}
