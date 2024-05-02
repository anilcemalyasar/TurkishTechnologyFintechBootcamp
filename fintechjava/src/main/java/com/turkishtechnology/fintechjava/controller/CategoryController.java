package com.turkishtechnology.fintechjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.turkishtechnology.fintechjava.model.dto.CreateCategoryDto;
import com.turkishtechnology.fintechjava.model.entity.Category;
import com.turkishtechnology.fintechjava.service.CategoryService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
    
    @PostMapping("/addCategory")
    public String addCategory(@RequestBody CreateCategoryDto createCategoryDto) {
        return categoryService.addCategory(createCategoryDto);
    }

    @GetMapping("/categories/{categoryId}")
    public Category getById(@PathVariable int categoryId) {
        return categoryService.getById(categoryId);
    }

    @DeleteMapping("/categories/{categoryId}")
    public String deleteById(@PathVariable int categoryId) {
        return categoryService.deleteById(categoryId);
    }
    
    
}
