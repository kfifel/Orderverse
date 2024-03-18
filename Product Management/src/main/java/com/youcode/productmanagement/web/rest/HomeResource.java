package com.youcode.productmanagement.web.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return "Welcome to Product Management System";
    }
}
