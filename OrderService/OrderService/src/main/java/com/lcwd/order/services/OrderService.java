package com.lcwd.order.services;

import com.lcwd.order.entities.Order;

import java.util.List;

public interface OrderService {
    //create
    Order create(Order order);


    //get all ratings
    List<Order> getOrders();

    //get all by UserId
    List<Order> getOrdersByUserId(String userId);

    //get all by hotel
    List<Order> getOrdersByProductId(String productId);
}
