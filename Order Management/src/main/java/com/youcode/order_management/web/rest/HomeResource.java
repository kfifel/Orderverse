package com.youcode.order_management.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeResource {

    @RequestMapping("/")
    public String home() {
        return "Welcome to Order Management System";
    }
}
