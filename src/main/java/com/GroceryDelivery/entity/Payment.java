package com.GroceryDelivery.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_table")
public class Payment {

	@Id
	@GeneratedValue
	private Integer paymentId;
	private Date paymentdate;
	private String paymentType;
	private double amount;
	
	public Payment() {
		super();
	}

	public Payment(Integer paymentId, Date paymentdate, String paymentType, double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentdate = paymentdate;
		this.paymentType = paymentType;
		this.amount = amount;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymentdate() {
		return paymentdate;
	}

	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}

	