package com.GroceryDelivery.service;

import java.util.List;

import com.GroceryDelivery.entity.Cart;
import com.GroceryDelivery.entity.CartDTO;
import com.GroceryDelivery.exception.CartNotFoundException;



public interface CartService {

	public Cart addCart(Cart cart);
	public Cart updateCart(CartDTO cartDTO) throws CartNotFoundException;
	
	public List<Cart> showAllCarts();
	public Cart getCartById(Integer cartId) throws CartNotFoundException;
	public Cart deleteCartById(Integer id)throws CartNotFoundException;
}
