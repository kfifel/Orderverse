package com.youcode.order_management.domain;

import com.youcode.order_management.domain.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderNumber;
    private String customerId;
    private String shippingAddress;
    private String paymentMethod;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order", fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;
}
