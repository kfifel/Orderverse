package com.youcode.order_management.web.mapper;

import com.youcode.order_management.domain.Order;
import com.youcode.order_management.web.dto.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO orderToOrderDto(Order order);

    Order orderDtoToOrder(OrderDTO orderDetails);
}
