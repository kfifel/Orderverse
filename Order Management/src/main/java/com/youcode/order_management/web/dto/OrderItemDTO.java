package com.youcode.order_management.web.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemDTO {

    private Long id;
    private Long orderId;
    private String productId;
    private int quantity;
    // getters and setters
}
