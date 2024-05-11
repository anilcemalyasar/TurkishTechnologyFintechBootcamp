package com.springintro.gradesubmission.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springintro.gradesubmission.pojos.Grade;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class GradeController {

    // List<Grade> studentGrades = Arrays.asList(
    //     new Grade("Harry", "Potions", "B-"),
    //     new Grade("Hermione", "Arithmancy", "A+"),
    //     new Grade("Neville", "Charms", "A-")
    // );

    List<Grade> studentGrades = new ArrayList<>();

    // getMapping responds to GET requests made on the MAPPING URL PATH
    @GetMapping("/grades")
    public String getGrades(Model model) {
        
        model.addAttribute("grades", studentGrades);  // now the model contains data
        return "grades";
    }
    
    // when a user makes request on an empty PATH
    @GetMapping("/")
    public String gradeForm(Model model) {
        model.addAttribute("grade", new Grade());
        return "form";
    }


    // when a user submit the form
    @PostMapping("/handleSubmit")
    public String submitGrade(Grade grade) {
        System.out.println(grade);
        studentGrades.add(grade);
        return "redirect:/grades";
    }
    
    

}
