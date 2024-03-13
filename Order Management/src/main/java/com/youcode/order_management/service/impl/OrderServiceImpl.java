package com.youcode.order_management.service.impl;

import com.youcode.order_management.domain.Order;
import com.youcode.order_management.domain.enums.OrderStatus;
import com.youcode.order_management.service.OrderService;
import com.youcode.order_management.web.dto.PaymentDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(Order orderDetails) {
        return null;
    }

    @Override
    public Order modifyOrder(String orderId, Order orderDetails) {
        return null;
    }

    @Override
    public void cancelOrder(String orderId) {

    }

    @Override
    public OrderStatus getOrderStatus(String orderId) {
        return null;
    }

    @Override
    public boolean checkProductAvailability(List<String> productIds) {
        return false;
    }

    @Override
    public void processPayment(String orderId, PaymentDetails paymentDetails) {

    }
}
