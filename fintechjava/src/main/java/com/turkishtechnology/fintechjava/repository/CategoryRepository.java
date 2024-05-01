package com.turkishtechnology.fintechjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkishtechnology.fintechjava.model.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
