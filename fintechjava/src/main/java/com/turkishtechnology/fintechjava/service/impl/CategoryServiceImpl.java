package com.turkishtechnology.fintechjava.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkishtechnology.fintechjava.model.entity.Category;
import com.turkishtechnology.fintechjava.repository.CategoryRepository;
import com.turkishtechnology.fintechjava.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(int categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow();
    }

    @Override
    public String addCategory(Category category) {
        categoryRepository.save(category);
        return "Category was added successfully!";
    }

    @Override
    public Category deleteById(int categoryId) {
        Optional<Category> optional = categoryRepository.findById(categoryId);
        if (optional != null) {
            categoryRepository.delete(optional.get());
        }
        return optional.get();
    }
    
}
