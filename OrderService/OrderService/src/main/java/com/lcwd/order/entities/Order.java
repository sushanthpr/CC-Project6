package com.lcwd.order.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document("user_orders")
public class Order {
    @Id
    private String orderId;
    private String userId;
    private String productId;
    private  String feedback;
}
