package com.turkishtechnology.fintechjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkishtechnology.fintechjava.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
