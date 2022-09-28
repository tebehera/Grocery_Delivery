package com.GroceryDelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GroceryDelivery.entity.Cart;
import com.GroceryDelivery.entity.CartDTO;
import com.GroceryDelivery.exception.CartNotFoundException;
import com.GroceryDelivery.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository cartRepo;
	
	@Override
	public Cart addCart(Cart cart) {
		return this.cartRepo.save(cart);
	}

	@Override
	public Cart updateCart(CartDTO cartDTO) throws CartNotFoundException {
		
		Optional<Cart> cartOpt = this.cartRepo.findById(cartDTO.getCartId());
		//Optional<Cart> cartOpt = null;
		if(cartOpt.isEmpty())
			throw new CartNotFoundException("Cart id does not exist to update.");
		Cart updateCart = cartOpt.get();
		updateCart.setName(cartDTO.getName());
		
		updateCart.setPrice(cartDTO.getPrice());
        updateCart.setQuantity(cartDTO.getQuantity());
        
		return this.cartRepo.save(updateCart);
	}
	

	@Override
	public List<Cart> showAllCarts() {
		return this.cartRepo.findAll();
	}

	@Override
	public Cart getCartById(Integer cartId) throws CartNotFoundException {

		Optional<Cart> cartOpt=this.cartRepo.findById(cartId);
		if(cartOpt.isEmpty())
			throw new CartNotFoundException("Id Not Found");
		return cartOpt.get();
	}

	@Override
	public Cart deleteCartById(Integer cartId) throws CartNotFoundException {

		Optional<Cart> optCart = this.cartRepo.findById(cartId);
		if(optCart.isEmpty())
			throw new CartNotFoundException("Cart Id does not exists to delete.");
		this.cartRepo.deleteById(cartId);
		return optCart.get();
	}

	

}
