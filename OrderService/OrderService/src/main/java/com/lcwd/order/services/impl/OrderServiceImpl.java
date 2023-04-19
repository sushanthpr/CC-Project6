package com.lcwd.order.services.impl;

import com.lcwd.order.entities.Order;
import com.lcwd.order.repository.OrderRepository;
import com.lcwd.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OrderServiceImpl implements OrderService{


    @Autowired
    private OrderRepository repository;
    @Override
    public Order create(Order order) {
        return repository.save(order);
    }

    @Override
    public List<Order> getOrders() {
        return repository.findAll();
    }

    @Override
    public List<Order> getOrdersByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Order> getOrdersByProductId(String productId) {
        return repository.findByProductId(productId);
    }
}
