package com.turkishtechnology.fintechjava.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.turkishtechnology.fintechjava.model.entity.Product;
import com.turkishtechnology.fintechjava.repository.ProductRepository;
import com.turkishtechnology.fintechjava.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(int id) {
        return productRepository.findById(id).orElseThrow();
    }

    @Override
    public String addProduct(Product product) {
        productRepository.save(product);
        return "Product was added successfully!";
    }

    @Override
    public Product updateProduct(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public String deleteById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
