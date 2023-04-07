package com.example.ProductManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boss")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/view-all-product")
    public String getAllProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping("/add-product")
    public String add(@RequestParam("productName") String name) {
        return productService.add(name);
    }

    @RequestMapping("/search-product")
    public String search(@RequestParam("productId") Long productId) {
        return productService.search(productId);
    }

    @RequestMapping("/update-product")
    public void update(
            @RequestParam("productId") Long productId,
            @RequestParam("newName") String newName
    ) {
        productService.update(productId, newName);
    }

    @RequestMapping("/delete-product")
    public void delete(@RequestParam("productId") Long productId) {
        productService.delete(productId);
    }
}
