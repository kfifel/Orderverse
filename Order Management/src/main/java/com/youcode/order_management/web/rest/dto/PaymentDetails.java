package com.youcode.order_management.web.rest.dto;

import jakarta.persistence.Entity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentDetails {

    private String orderId;
    private double amount;
    private String paymentMethod;
}
