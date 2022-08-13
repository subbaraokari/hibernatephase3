package org.simplilearn.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("hourly")
public class HourlyEmployee extends Employee {
	private int hourlyPay;
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}
	public HourlyEmployee(int hourlyPay) {
		super();
		this.hourlyPay = hourlyPay;
	}
	public int getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
}
