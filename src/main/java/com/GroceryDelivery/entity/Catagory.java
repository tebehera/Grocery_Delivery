package com.GroceryDelivery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catagory_table")
public class Catagory {

	@Id
	@GeneratedValue
	private Integer catagoryId;
	private String name;

	public Catagory(Integer catagoryId, String name) {
		super();
		this.catagoryId = catagoryId;
		this.name = name;
	}

	public Integer getCatagoryId() {
		return catagoryId;
	}

	public void setCatagoryId(Integer catagoryId) {
		this.catagoryId = catagoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}