package com.turkishtechnology.fintechjava.controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.turkishtechnology.fintechjava.exceptions.CategoryNotFoundException;
import com.turkishtechnology.fintechjava.model.dto.CreateCategoryDto;
import com.turkishtechnology.fintechjava.model.dto.ResponseCategoryDto;
import com.turkishtechnology.fintechjava.model.dto.UpdateCategoryDto;
import com.turkishtechnology.fintechjava.model.entity.Category;
import com.turkishtechnology.fintechjava.service.CategoryService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<ResponseCategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }
    
    @PostMapping("/addCategory")
    public String addCategory(@RequestBody CreateCategoryDto createCategoryDto) {
        return categoryService.addCategory(createCategoryDto);
    }

    @GetMapping("/categories/{categoryId}")
    public ResponseEntity<ResponseCategoryDto> getById(@PathVariable int categoryId) {
        try {
            return ResponseEntity.ok(categoryService.getById(categoryId));
        } catch (CategoryNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/categories/{categoryId}")
    public String deleteById(@PathVariable int categoryId) {
        return categoryService.deleteById(categoryId);
    }
    
    @PutMapping("/categories/update")
    public Category updateCategory(@RequestBody UpdateCategoryDto updateCategoryDto) {
        return categoryService.updateCategory(updateCategoryDto);
    }
    
}
