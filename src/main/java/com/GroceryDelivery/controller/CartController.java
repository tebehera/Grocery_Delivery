package com.GroceryDelivery.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GroceryDelivery.entity.Cart;
import com.GroceryDelivery.entity.CartDTO;
import com.GroceryDelivery.exception.CartNotFoundException;
import com.GroceryDelivery.service.CartService;

@RestController
@RequestMapping("v1")

@CrossOrigin(value = "http://localhost:3000/")

public class CartController {

	@Autowired
	private CartService cartService;

	@PostMapping("cart")
	public Cart addCart(@Valid @RequestBody CartDTO cartDTO) {
		Cart cart = new Cart(null, cartDTO.getName(), cartDTO.getPrice(), cartDTO.getQuantity());
		return this.cartService.addCart(cart);
	}

	@PutMapping("cart")
	public Cart updateCart(@RequestBody CartDTO cartDTO) throws CartNotFoundException {
		return this.cartService.updateCart(cartDTO);
	}

	@GetMapping("carts")
	public List<Cart> getAllCarts() {
		return this.cartService.showAllCarts();
	}

	
	  @GetMapping("cart/{id}") public Cart getCartDetailsById(@PathVariable("id")
	  Integer cartId) throws CartNotFoundException { 
		  return this.cartService.getCartById(cartId);
	  
	  }
	 

	@DeleteMapping("cart/{id}")
	public Cart deleteCartById(@PathVariable("id") Integer cartId) throws CartNotFoundException {
		return this.cartService.deleteCartById(cartId);
	}
}
