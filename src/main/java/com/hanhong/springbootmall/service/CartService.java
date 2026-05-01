
package com.hanhong.springbootmall.service;

import com.hanhong.springbootmall.dto.Cart;

public interface CartService {
    Cart getCartByUserId(Integer userId);
    void addItemToCart(Integer userId, Integer productId, Integer quantity);
    void updateQuantity(Integer userId, Integer productId, Integer quantity);
    void removeFromCart(Integer userId, Integer productId);
    void clearCart(Integer userId);
} 