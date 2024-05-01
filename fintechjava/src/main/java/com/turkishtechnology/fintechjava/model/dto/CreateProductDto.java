package com.turkishtechnology.fintechjava.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductDto {
        
    private String productName;
    private double salesPrice;
    private int quantity;
    private int categoryId;
    
}
