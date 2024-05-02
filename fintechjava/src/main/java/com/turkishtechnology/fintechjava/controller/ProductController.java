package com.turkishtechnology.fintechjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.turkishtechnology.fintechjava.model.dto.CreateProductDto;
import com.turkishtechnology.fintechjava.model.dto.UpdateProductDto;
import com.turkishtechnology.fintechjava.model.entity.Product;
import com.turkishtechnology.fintechjava.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;






@RestController()
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody CreateProductDto createProductDto) {
        return productService.addProduct(createProductDto);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    
    @GetMapping("/product/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return productService.getById(productId);
    }

    @PutMapping("/product/{productId}/update")
    public Product updateProduct(@PathVariable int productId, @RequestBody UpdateProductDto updateProductDto) {
        return productService.updateProduct(productId, updateProductDto);
    }

    @GetMapping("/products/category/{categoryName}")
    public List<Product> getProductsByCategoryName(@PathVariable String categoryName) throws Exception {
        return productService.getProductsByCategory(categoryName);
    }
    
    
    

}
