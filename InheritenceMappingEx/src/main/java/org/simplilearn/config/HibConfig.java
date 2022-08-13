package org.simplilearn.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.simplilearn.entities.Customer;
import org.simplilearn.entities.Emp;
import org.simplilearn.entities.Employee;
import org.simplilearn.entities.HourlyEmployee;
import org.simplilearn.entities.Person;
import org.simplilearn.entities.SalariedEmployee;

public class HibConfig {
	public static SessionFactory getSessionFactory() {
		Configuration configuration=new Configuration();
		configuration.setProperties(hibernateProperties());
		configuration.addAnnotatedClass(Person.class);
		configuration.addAnnotatedClass(Emp.class);
		configuration.addAnnotatedClass(Customer.class);
		return configuration.buildSessionFactory();
	}
	private static Properties hibernateProperties() {
		Properties properties=new Properties();
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/testdb1");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "root");
		properties.put(Environment.SHOW_SQL, true);
		properties.put(Environment.FORMAT_SQL, true);
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		return properties;
		
	}
}
