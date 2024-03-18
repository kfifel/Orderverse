package com.example.registry.config;

import org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration;
import org.springframework.cloud.netflix.eureka.loadbalancer.LoadBalancerEurekaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public LoadBalancerEurekaAutoConfiguration loadBalancerInterceptorConfig() {
        return new LoadBalancerEurekaAutoConfiguration();
    }

    @Bean
    public LoadBalancerAutoConfiguration loadBalancerAutoConfiguration() {
        return new LoadBalancerAutoConfiguration();
    }
}
