package com.hanhong.springbootmall.dto;

import java.util.List;

public class Cart{
    private List<CartItem> cartItems;
    private int totalAmount;

    public List<CartItem> getCarItems(){
        return cartItems;
    }

    public void setCarItems(List<CartItem> cartItems){
        this.cartItems = cartItems;
    }

    public int getTotalAmount(){
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount){
        this.totalAmount = totalAmount;
    }
}