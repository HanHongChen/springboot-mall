
package com.hanhong.springbootmall.dao;

import com.hanhong.springbootmall.dto.Cart;
import com.hanhong.springbootmall.dto.CartItem;

public interface CartDao {

    Cart getCart(Integer userId);
    CartItem getCartItem(Integer userId, Integer productId);
    void addCartItem(Integer userId, Integer productId, Integer quantity);
    void updateQuantity(Integer userId, Integer productId, Integer quantity);
    void deleteCartItem(Integer userId, Integer productId);
    void removeCart(Integer userId);
}