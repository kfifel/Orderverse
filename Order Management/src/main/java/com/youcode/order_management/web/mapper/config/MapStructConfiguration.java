package com.youcode.order_management.web.mapper.config;


import com.youcode.order_management.web.mapper.OrderMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapStructConfiguration {

    @Bean
    public OrderMapper OrderMapper() {
        return OrderMapper.INSTANCE;
    }
}
