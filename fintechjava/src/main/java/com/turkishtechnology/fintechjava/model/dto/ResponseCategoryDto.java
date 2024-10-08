package com.turkishtechnology.fintechjava.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseCategoryDto {
    
    private String categoryName;
    private List<ProductDto> products;
}
