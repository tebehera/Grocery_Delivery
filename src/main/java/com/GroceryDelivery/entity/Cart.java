package com.GroceryDelivery.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

@Table(name = "cart_table")
public class Cart {

	@Id

	@GeneratedValue
	private Integer cartId;
	private String name;
	private double price;
	private double quantity;
	//private String pictureURL;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	@OneToMany
	@JsonIgnore
	List<Product> product = new ArrayList<>();
	@OneToOne
	private Order order;

	public Cart(Integer cartId, String name, double price, double quantity) {
		super();
		this.cartId = cartId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		//this.pictureURL = pictureURL;
	}

	

	public Cart(int i, String string, int j, int k, Object object, Object object2) {
		// TODO Auto-generated constructor stub
	}



	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	/*public String getPictureURL() {
		return pictureURL;
	}

	public void setPictureURL(String pictureURL) {
		this.pictureURL = pictureURL;
	}*/

}
