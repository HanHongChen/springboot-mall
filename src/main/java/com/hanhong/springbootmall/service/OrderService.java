package com.hanhong.springbootmall.service;

import com.hanhong.springbootmall.dto.CreateOrderRequest;
import com.hanhong.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
