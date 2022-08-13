package org.simplilearn.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "eno")
public class Emp extends Person {
	private int salary;
	private String dname;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int salary, String dname) {
		super();
		this.salary = salary;
		this.dname = dname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
