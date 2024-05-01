package com.turkishtechnology.fintechjava.service;

import java.util.List;

import com.turkishtechnology.fintechjava.model.entity.Category;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getById(int categoryId);
    String addCategory(Category category);
    Category deleteById(int categoryId);
}
