package com.turkishtechnology.fintechjava.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkishtechnology.fintechjava.model.dto.CreateCategoryDto;
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
    public String addCategory(CreateCategoryDto createCategoryDto) {
        Category category = new Category();
        category.setCategoryName(createCategoryDto.getCategoryName());
        categoryRepository.save(category);
        return "Category " + category.getCategoryName() + " was added successfully!";
    }

    @Override
    public String deleteById(int categoryId) {
        Optional<Category> optional = categoryRepository.findById(categoryId);
        if (!optional.isPresent()) {
            return categoryId + " numaralı bir kategori bulunmamaktadır!";
        }
        categoryRepository.delete(optional.get());
        return categoryId + " numaralı kategori silindi!";
        
    }
    
}
