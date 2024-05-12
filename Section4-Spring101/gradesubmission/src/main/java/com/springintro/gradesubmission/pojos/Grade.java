package com.springintro.gradesubmission.pojos;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;

public class Grade {
    
    private String id;

    @NotBlank(message = "Name can not be blank!")
    private String name;

    @NotBlank(message = "Subject can not be blank!")
    private String subject;
    private String score;


    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
            + "Subject: " + getSubject() + "\n"
            + "Score: " + getScore() + "\n";
    }


    
}
