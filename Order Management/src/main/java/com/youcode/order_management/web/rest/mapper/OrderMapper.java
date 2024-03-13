package com.youcode.order_management.web.rest.mapper;

import com.youcode.order_management.domain.Order;
import com.youcode.order_management.web.rest.dto.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "orderItems", target = "orderItems")
    OrderDTO orderToOrderDto(Order order);

    @Mapping(source = "orderItems", target = "orderItems")
    Order orderDtoToOrder(OrderDTO orderDetails);
}
