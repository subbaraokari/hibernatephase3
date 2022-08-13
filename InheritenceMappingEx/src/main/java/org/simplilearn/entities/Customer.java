package org.simplilearn.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "cid")
public class Customer extends Person{
	private String orderName;
	private String orderDate;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String orderName, String orderDate) {
		super();
		this.orderName = orderName;
		this.orderDate = orderDate;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
}
