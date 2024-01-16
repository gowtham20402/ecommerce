package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String productId) {
        return productRepository.findById(productId);
    }

    public Product createProduct(Product product) {
        // Add additional business logic or validations if needed before saving
        return productRepository.save(product);
    }

    public Product updateProduct(String productId, Product updatedProduct) {
        // Add additional business logic or validations if needed before updating
        updatedProduct.setId(productId); // Set the ID to ensure an update on the existing product
        return productRepository.save(updatedProduct);
    }

    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }
}
