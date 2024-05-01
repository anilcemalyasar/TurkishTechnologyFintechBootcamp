package com.turkishtechnology.fintechjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.turkishtechnology.fintechjava.model.entity.Product;
import com.turkishtechnology.fintechjava.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController()
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    
    @GetMapping("/product/{productId}")
    public Product getMethodName(@PathVariable int productId) {
        return productService.getById(productId);
    }
    
    

}
