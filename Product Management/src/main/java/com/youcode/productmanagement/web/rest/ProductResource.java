package com.youcode.productmanagement.web.rest;

import com.youcode.productmanagement.domain.Product;
import com.youcode.productmanagement.service.ProductService;
import com.youcode.productmanagement.web.dto.ProductDTO;
import com.youcode.productmanagement.web.mapper.ProductMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductResource {

    private final ProductService productService;
    private final ProductMapper productMapper;

    public ProductResource(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        Product product = productMapper.productDTOToProduct(productDTO);
        Product createdProduct = productService.createProduct(product);
        ProductDTO createdProductDTO = productMapper.productToProductDTO(createdProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProductDTO);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable Long productId) {
        Product product = productService.getProduct(productId);
        ProductDTO productDTO = productMapper.productToProductDTO(product);
        return ResponseEntity.ok(productDTO);
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        List<ProductDTO> productDTOs = products.stream()
                .map(productMapper::productToProductDTO)
                .toList();
        return ResponseEntity.ok(productDTOs);
    }

    @PutMapping
    public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO productDTO) {
        Product product = productMapper.productDTOToProduct(productDTO);
        Product updatedProduct = productService.updateProduct(product);
        ProductDTO updatedProductDTO = productMapper.productToProductDTO(updatedProduct);
        return ResponseEntity.ok(updatedProductDTO);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }
}
