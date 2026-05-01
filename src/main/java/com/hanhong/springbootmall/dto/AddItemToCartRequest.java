package com.hanhong.springbootmall.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AddItemToCartRequest {

    @Min(1)
    @NotNull
    private Integer quantity;

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
