package com.youcode.order_management.web.dto;

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
