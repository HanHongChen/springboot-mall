package com.hanhong.springbootmall.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hanhong.springbootmall.dao.CartDao;
import com.hanhong.springbootmall.dto.Cart;
import com.hanhong.springbootmall.dto.CartItem;
import com.hanhong.springbootmall.service.CartService;

@Component
public class CartServiceImpl implements CartService{

    @Autowired
    CartDao cartDao;

    @Override
    public Cart getCartByUserId(Integer userId){
        Cart cart = cartDao.getCart(userId);
        return cart;
    }

    @Override
    public void addItemToCart(Integer userId, Integer productId, Integer quantity){
        CartItem carItem = cartDao.getCartItem(userId, productId);
        if(carItem == null){
            cartDao.addCartItem(userId, productId, quantity);
        }else{
            cartDao.updateQuantity(userId, productId, carItem.getQuantity() + quantity);
        }

    }

    @Override
    public void updateQuantity(Integer userId, Integer productId, Integer quantity){
        cartDao.updateQuantity(userId, productId, quantity);
    }

    @Override
    public void removeFromCart(Integer userId, Integer productId){
        cartDao.deleteCartItem(userId, productId);
    }

    @Override
    public void clearCart(Integer userId){
        cartDao.removeCart(userId);
    }
}