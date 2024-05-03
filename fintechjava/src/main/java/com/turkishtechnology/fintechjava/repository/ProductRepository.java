package com.turkishtechnology.fintechjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkishtechnology.fintechjava.model.entity.Product;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByProductNameIgnoreCase(String productName);
}
