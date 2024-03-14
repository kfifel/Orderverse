package com.youcode.productmanagement.service;

import com.youcode.productmanagement.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product getProduct(Long productId);
    Product updateProduct(Product product);
    void deleteProduct(Long productId);
}

