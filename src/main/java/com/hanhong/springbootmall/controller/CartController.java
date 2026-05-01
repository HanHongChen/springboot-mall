package com.hanhong.springbootmall.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hanhong.springbootmall.dto.AddItemToCartRequest;
import com.hanhong.springbootmall.dto.Cart;
import com.hanhong.springbootmall.dto.UpdateCartItemRequest;
import com.hanhong.springbootmall.service.CartService;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/users/{userId}/cart")
    public ResponseEntity<Cart> getCart(@PathVariable Integer userId){
        Cart cart = cartService.getCartByUserId(userId);
        
        return ResponseEntity.status(HttpStatus.OK).body(cart);
    }

    @PostMapping("/users/{userId}/cart/{productId}")
    public ResponseEntity<?> addItemToCart(@PathVariable Integer userId, @PathVariable Integer productId, 
            @RequestBody @Valid AddItemToCartRequest addItemToCartRequest ){
        return null;
    }

    @PatchMapping("/users/{userId}/cart/{productId}")
    public ResponseEntity<?> updateQuantity(@PathVariable Integer userId, @PathVariable Integer productId,
            @RequestBody @Valid UpdateCartItemRequest updateCartItemRequest
    ){
        return null;
    }

    @DeleteMapping("/users/{userId}/cart/{productId}")
    public ResponseEntity<?> removeFromCart(@PathVariable Integer userId, @PathVariable Integer productId){
        return null;
    }
}