package com.thyjavadev.hellospring.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    
    @GetMapping("/helloWorld")
    public String sayHello() {
        return "Hello World";
    }
    

}
