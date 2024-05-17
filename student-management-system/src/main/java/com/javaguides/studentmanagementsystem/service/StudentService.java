package com.javaguides.studentmanagementsystem.service;

import java.util.List;

import com.javaguides.studentmanagementsystem.model.Student;

public interface StudentService {
    
    List<Student> getAllStudents();
    Student getById(Long id);
    Student updateStudent(Student student);
    Student save(Student student);
}
