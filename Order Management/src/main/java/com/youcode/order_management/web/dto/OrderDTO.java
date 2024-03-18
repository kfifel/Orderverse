package com.youcode.order_management.web.dto;

import com.youcode.order_management.domain.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    private Long orderId;
    private List<OrderItemDTO> orderItems;
    private String customerId;
    private String shippingAddress;
    private String paymentMethod;
    private OrderStatus status;
    // getters and setters
}

