package org.simplilearn.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String passportNumber;
	@Temporal(value = TemporalType.DATE)
	private Date issuedDate;
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "passport")
	private Student student;
	public Passport() {
		// TODO Auto-generated constructor stub
	}
	public Passport(int pid, String passportNumber, Date issuedDate) {
		super();
		this.pid = pid;
		this.passportNumber = passportNumber;
		this.issuedDate = issuedDate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
