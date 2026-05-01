package com.hanhong.springbootmall.dto;

import com.hanhong.springbootmall.model.Product;

public class CartItem{
    private Product product;
    private int quantity;
    private int amount;

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
}