package com.turkishtechnology.fintechjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.turkishtechnology.fintechjava.model.entity.Category;
import com.turkishtechnology.fintechjava.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
    
    @PostMapping("/addCategory")
    public String addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }
    
}
