package com.GroceryDelivery;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.GroceryDelivery.entity.Cart;
import com.GroceryDelivery.entity.CartDTO;
import com.GroceryDelivery.exception.CartNotFoundException;
import com.GroceryDelivery.service.CartService;

@SpringBootTest
class GroceryDeliveryApplicationTests {
	
	@Autowired
	private CartService cartService;

	
	@Test
    void addCartTest() {
		Cart cart=new Cart( 1,"Oil", 400,2, null,null);
		Cart testCart=this.cartService.addCart(cart);
        assertNotNull(testCart);
    }
    
	/* @Test
	    void updateCartTest() {
	        CartDTO cartDTO = new CartDTO(17,(),"Out Of Delivery");
	        
	        Cart updateOrder = null;
	        try {
	            updateCart = this.cartService.updateCart(cartDTO);
	        } catch (CartNotFoundException e) {
	            e.printStackTrace();
	        }
	        assertEquals("Out Of Delivery",updateCart.getStatus());    
	        
	    }*/
	    
    
}
	    
