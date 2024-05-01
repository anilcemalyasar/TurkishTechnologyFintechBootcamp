package com.turkishtechnology.fintechjava.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    @Column(name = "Product Name")
    private String productName;

    @Column(name = "Sales Price")
    private double salesPrice;

    @Column(name = "Quantity")
    private int quantity;

}
