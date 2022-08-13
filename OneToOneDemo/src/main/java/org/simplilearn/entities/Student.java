package org.simplilearn.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	private String address;
	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.REFRESH},
			mappedBy = "student")
	private Set<Course> courses=new HashSet<>();
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="pid")
	private Passport passport;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, String address, Passport passport) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.passport = passport;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public void addCourse(Course course)
	{
		courses.add(course);
	}
	public void removeCourse(Course course)
	{
		courses.remove(course);
	}
	
	
}
