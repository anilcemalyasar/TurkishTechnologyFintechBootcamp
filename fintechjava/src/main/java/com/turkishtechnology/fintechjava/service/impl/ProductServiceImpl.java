package com.turkishtechnology.fintechjava.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.turkishtechnology.fintechjava.model.dto.CreateProductDto;
import com.turkishtechnology.fintechjava.model.entity.Category;
import com.turkishtechnology.fintechjava.model.entity.Product;
import com.turkishtechnology.fintechjava.repository.CategoryRepository;
import com.turkishtechnology.fintechjava.repository.ProductRepository;
import com.turkishtechnology.fintechjava.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
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
    public String addProduct(CreateProductDto createProductDto) {
        Category category = categoryRepository.findById(createProductDto.getCategoryId()).orElseThrow();
        Product product = new Product();
        product.setProductName(createProductDto.getProductName());
        product.setSalesPrice(createProductDto.getSalesPrice());
        product.setQuantity(createProductDto.getQuantity());
        product.setCategory(category);
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

    @Override
    public List<Product> getProductsByCategory(String categoryName) throws Exception {
        if (categoryRepository.findByCategoryNameIgnoreCase(categoryName).isEmpty()){
            throw new Exception(categoryName + " kategorisi bulunmamaktadır!");
        }
        return productRepository.findAll()
        .stream()
        .filter(product -> product.getCategory().getCategoryName().equalsIgnoreCase(categoryName))
        .collect(Collectors.toList());
    }
    
}
