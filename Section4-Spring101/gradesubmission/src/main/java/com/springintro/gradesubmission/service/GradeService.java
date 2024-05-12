package com.springintro.gradesubmission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springintro.gradesubmission.Constants;
import com.springintro.gradesubmission.pojos.Grade;
import com.springintro.gradesubmission.repository.GradeRepository;

@Service
public class GradeService {
    
    @Autowired
    GradeRepository gradeRepository;

    public Grade getGrade(int index) {
        return gradeRepository.getGrade(index);
    } 

    public List<Grade> getGrades() {
        return gradeRepository.getGrades();
    }

    public void addGrade(Grade grade) {
        gradeRepository.addGrade(grade);
    }

    public void updateGrade(Grade grade, int index) {
        gradeRepository.updateGrade(grade, index);
    }

    public int getGradeIndex(String id) {
        List<Grade> grades = getGrades();
        for(int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getId().equals(id)) {
                return i;
            }
        }
        return Constants.NOT_FOUND; // not found
    }

    public Grade getGradeById(String id) {
        int index = getGradeIndex(id);
        return index == Constants.NOT_FOUND ? new Grade() : getGrade(index);
    }
    
    public void submitGrade(Grade grade) {
        int index = getGradeIndex(grade.getId());
        // if grade already exists
        if (index != Constants.NOT_FOUND) {
            updateGrade(grade, index);
        }
        else {
            addGrade(grade);
        }
    }
}
