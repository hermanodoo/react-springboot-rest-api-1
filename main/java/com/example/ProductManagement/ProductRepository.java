package com.example.ProductManagement;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository {

    abstract public String add(String productName);
    abstract public String search(Long productId);
    abstract public void delete(Long productId);
    abstract public void update(Long productId, String newName);
    abstract public String getAllProducts();

}
