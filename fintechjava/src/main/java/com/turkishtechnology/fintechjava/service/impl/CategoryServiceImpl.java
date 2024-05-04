package com.turkishtechnology.fintechjava.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkishtechnology.fintechjava.exceptions.CategoryNotFoundException;
import com.turkishtechnology.fintechjava.model.dto.CreateCategoryDto;
import com.turkishtechnology.fintechjava.model.dto.ProductDto;
import com.turkishtechnology.fintechjava.model.dto.ResponseCategoryDto;
import com.turkishtechnology.fintechjava.model.dto.UpdateCategoryDto;
import com.turkishtechnology.fintechjava.model.entity.Category;
import com.turkishtechnology.fintechjava.model.entity.Product;
import com.turkishtechnology.fintechjava.repository.CategoryRepository;
import com.turkishtechnology.fintechjava.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<ResponseCategoryDto> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(c -> mapCategoryToDto(c))
                .toList();
    }

    @Override
    public ResponseCategoryDto getById(int categoryId) throws CategoryNotFoundException {
        Category category = categoryRepository.findById(categoryId)
                        .orElseThrow(() -> new CategoryNotFoundException(categoryId + " numaralı bir kategori bulunmamaktadır!"));
        return mapCategoryToDto(category);
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

    @Override
    public Category updateCategory(UpdateCategoryDto updateCategoryDto) {
        Category category = categoryRepository.findById(updateCategoryDto.getCategoryId())
                                .orElseThrow();
        category.setCategoryName(updateCategoryDto.getCategoryName());
        categoryRepository.save(category);
        return category;
    }

    private ResponseCategoryDto mapCategoryToDto(Category category) {
        ResponseCategoryDto categoryDto = new ResponseCategoryDto();
        categoryDto.setCategoryName(category.getCategoryName());
        List<ProductDto> productDtos = new ArrayList<ProductDto>();
        for (Product product : category.getProducts()) {
            productDtos.add(ProductServiceImpl.mapProductToProductDto(product));
        }
        categoryDto.setProducts(productDtos);
        return categoryDto;
    }


    
}
