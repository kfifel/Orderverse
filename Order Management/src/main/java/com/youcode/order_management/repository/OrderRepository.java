package com.youcode.order_management.repository;

import com.youcode.order_management.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
