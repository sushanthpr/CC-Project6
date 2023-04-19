package com.lcwd.order.repository;

import com.lcwd.order.entities.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order,String>
{
        //custom finder methods
        List<Order> findByUserId(String userId);
        List<Order> findByProductId(String productId);

        }

