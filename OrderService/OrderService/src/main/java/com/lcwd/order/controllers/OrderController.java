package com.lcwd.order.controllers;

import com.lcwd.order.entities.Order;
import com.lcwd.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //create rating

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody Order order) {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.create(order));
    }

    @GetMapping
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok(orderService.getOrders());
    }



    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Order>>getOrdersByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(orderService.getOrdersByUserId(userId));
    }


    @GetMapping("/products/{productId}")
    public ResponseEntity<List<Order>> getOrdersByProductId(@PathVariable String productId) {
        return ResponseEntity.ok(orderService.getOrdersByProductId(productId));
    }


}