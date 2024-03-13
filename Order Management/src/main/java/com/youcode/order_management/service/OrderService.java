package com.youcode.order_management.service;

import com.youcode.order_management.domain.Order;
import com.youcode.order_management.web.dto.PaymentDetails;
import com.youcode.order_management.domain.enums.OrderStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    Order createOrder(Order orderDetails);
    Order modifyOrder(String orderId, Order orderDetails);
    void cancelOrder(String orderId);
    OrderStatus getOrderStatus(String orderId);
    boolean checkProductAvailability(List<String> productIds);
    void processPayment(String orderId, PaymentDetails paymentDetails);
}
