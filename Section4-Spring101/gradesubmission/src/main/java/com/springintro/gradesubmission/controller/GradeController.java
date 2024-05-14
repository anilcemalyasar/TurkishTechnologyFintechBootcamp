package com.springintro.gradesubmission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import com.springintro.gradesubmission.pojos.Grade;
import com.springintro.gradesubmission.service.GradeService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class GradeController {

    // now, controller and service are not TIGHTLY COUPLED!
    @Autowired
    GradeService gradeService;

    // getMapping responds to GET requests made on the MAPPING URL PATH
    @GetMapping("/grades")
    public String getGrades(Model model) {
        
        model.addAttribute("grades", gradeService.getGrades());  // now the model contains data
        return "grades";
    }
    
    // when a user makes request on an empty PATH
    @GetMapping("/")
    public String gradeForm(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("grade", gradeService.getGradeById(id));
        return "form";
    }


    // when a user submit the form
    @PostMapping("/handleSubmit")
    public String submitGrade(@Valid Grade grade, BindingResult result) {
        // System.out.println(grade); 
        if (result.hasErrors()) return "form";
        gradeService.submitGrade(grade);
        return "redirect:/grades";
    }
    
    

}
