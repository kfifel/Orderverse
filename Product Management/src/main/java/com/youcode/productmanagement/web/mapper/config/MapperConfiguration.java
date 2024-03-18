package com.youcode.productmanagement.web.mapper.config;

import com.youcode.productmanagement.web.mapper.ProductMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public ProductMapper productMapper() {
        return ProductMapper.INSTANCE;
    }
}
