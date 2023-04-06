package com.example.ProductManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public String add(String productName) {
        return productRepository.add(productName);
    }

    public String search(Long productId) {
        return productRepository.search(productId);
    }

    public void update(Long productId, String newName) {
        productRepository.update(productId, newName);
    }

    public void delete(Long productId) {
        productRepository.delete(productId);
    }

    public String getAllProducts() {
        return productRepository.getAllProducts();
    }
}
