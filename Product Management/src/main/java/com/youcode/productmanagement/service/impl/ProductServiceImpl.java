package com.youcode.productmanagement.service.impl;

import com.youcode.productmanagement.domain.Product;
import com.youcode.productmanagement.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }

    @Override
    public Product createProduct(Product product) {
        return product;
    }

    @Override
    public Product getProduct(Long productId) {
        Product product = new Product();
        product.setId(productId);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        return product;
    }

    @Override
    public void deleteProduct(Long productId) {
        System.out.println("Product deleted");
    }
}
