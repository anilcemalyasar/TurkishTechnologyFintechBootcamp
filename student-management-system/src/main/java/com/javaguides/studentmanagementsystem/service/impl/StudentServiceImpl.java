package com.javaguides.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaguides.studentmanagementsystem.model.Student;
import com.javaguides.studentmanagementsystem.repository.StudentRepository;
import com.javaguides.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


}
