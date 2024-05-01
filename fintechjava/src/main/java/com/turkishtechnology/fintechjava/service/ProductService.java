package com.turkishtechnology.fintechjava.service;

import java.util.List;

import com.turkishtechnology.fintechjava.model.entity.Product;

public interface ProductService {
    
    List<Product> getAllProducts();
    Product getById(int id);
    String addProduct(Product product);
    Product updateProduct(Product product);
    String deleteById(int id);
}
