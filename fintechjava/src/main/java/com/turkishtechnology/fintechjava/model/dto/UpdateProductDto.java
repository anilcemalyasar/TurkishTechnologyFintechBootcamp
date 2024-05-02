package com.turkishtechnology.fintechjava.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductDto {
    private String productName;
    private double salesPrice;
    private int quantity;
}
