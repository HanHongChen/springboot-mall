package com.hanhong.springbootmall.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.hanhong.springbootmall.dao.CartDao;
import com.hanhong.springbootmall.dto.Cart;
import com.hanhong.springbootmall.dto.CartItem;

public class CartDaoImpl implements CartDao{

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void addCartItem(Integer userId, Integer productId, Integer quantity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteCartItem(Integer userId, Integer productId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Cart getCart(Integer userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CartItem getCartItem(Integer userId, Integer productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeCart(Integer userId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateQuantity(Integer userId, Integer productId, Integer quantity) {
        // TODO Auto-generated method stub
        
    }
    
}
