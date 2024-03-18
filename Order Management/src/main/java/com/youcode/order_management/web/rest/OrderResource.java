package com.youcode.order_management.web.rest;

import com.youcode.order_management.domain.Order;
import com.youcode.order_management.web.dto.PaymentDetails;
import com.youcode.order_management.domain.enums.OrderStatus;
import com.youcode.order_management.service.OrderService;
import com.youcode.order_management.web.dto.OrderDTO;
import com.youcode.order_management.web.dto.ProductDto;
import com.youcode.order_management.web.mapper.OrderMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderResource {
    private final OrderService orderService;
    private final OrderMapper orderMapper;
    private final ProductResource productClient;

    public OrderResource(OrderService orderService, OrderMapper orderMapper, ProductResource productClient) {
        this.orderService = orderService;
        this.orderMapper = orderMapper;
        this.productClient = productClient;
    }

    @PostMapping
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO) {
        Order createdOrder = orderService.createOrder(orderMapper.orderDtoToOrder(orderDTO));
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(orderMapper.orderToOrderDto(createdOrder));
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<OrderDTO> modifyOrder(@PathVariable String orderId, @RequestBody OrderDTO orderDetails) {
        Order modifiedOrder = orderService.modifyOrder(orderId, orderMapper.orderDtoToOrder(orderDetails));
        return ResponseEntity.ok(
                orderMapper.orderToOrderDto(modifiedOrder)
        );
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity<Void> cancelOrder(@PathVariable String orderId) {
        orderService.cancelOrder(orderId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{orderId}/status")
    public ResponseEntity<OrderStatus> getOrderStatus(@PathVariable String orderId) {
        OrderStatus status = orderService.getOrderStatus(orderId);
        return ResponseEntity.ok(status);
    }


    @GetMapping("/{orderId}/product")
    public ResponseEntity<ProductDto> getProductForOrder(@PathVariable Long orderId) {
        ProductDto productById = productClient.getProductById(orderId);
        return ResponseEntity.ok(productById);
    }

    @PostMapping("/{orderId}/payment")
    public ResponseEntity<Void> processPayment(@PathVariable String orderId, @RequestBody PaymentDetails paymentDetails) {
        orderService.processPayment(orderId, paymentDetails);
        return ResponseEntity.noContent().build();
    }
}

