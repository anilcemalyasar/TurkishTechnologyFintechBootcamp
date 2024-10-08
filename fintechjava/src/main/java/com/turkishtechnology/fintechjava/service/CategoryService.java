package com.turkishtechnology.fintechjava.service;

import java.util.List;

import com.turkishtechnology.fintechjava.exceptions.CategoryNotFoundException;
import com.turkishtechnology.fintechjava.model.dto.CreateCategoryDto;
import com.turkishtechnology.fintechjava.model.dto.ResponseCategoryDto;
import com.turkishtechnology.fintechjava.model.dto.UpdateCategoryDto;
import com.turkishtechnology.fintechjava.model.entity.Category;

public interface CategoryService {
    List<ResponseCategoryDto> getAllCategories();
    ResponseCategoryDto getById(int categoryId) throws CategoryNotFoundException;
    String addCategory(CreateCategoryDto createCategoryDto);
    String deleteById(int categoryId);
    Category updateCategory(UpdateCategoryDto updateCategoryDto);
}
