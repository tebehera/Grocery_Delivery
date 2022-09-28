package com.GroceryDelivery.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CartDTO {

	private Integer cartId;
	
	/*@Pattern(regexp="^[A-Za-z]*$",message = "only alphabets")
    @NotBlank(message="name can not be Blank")
    @NotNull(message="name can not be null")
	@Size(max=10,message="name max 10 letters")*/
	private String name;
	
	/*@NotBlank(message="name can not be Blank")
    @NotNull(message="name can not be null")
    @Min(value = 1)*/
    private double price;
	private double quantity;
	//private String pictureURL;

	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartDTO(Integer cartId, String name, double price, double quantity) {
		super();
		this.cartId = cartId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		//this.pictureURL = pictureURL;
	}

	public CartDTO(int i, String string, int j, int k) {
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
