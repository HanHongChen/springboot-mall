package com.hanhong.springbootmall.service;

import com.hanhong.springbootmall.dto.CreateOrderRequest;
import com.hanhong.springbootmall.dto.OrderQueryParams;
import com.hanhong.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
