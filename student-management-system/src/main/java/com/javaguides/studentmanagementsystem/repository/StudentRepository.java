package com.javaguides.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.studentmanagementsystem.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
