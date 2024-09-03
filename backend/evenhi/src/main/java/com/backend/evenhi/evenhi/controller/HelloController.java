package com.backend.evenhi.evenhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHelloWorld(){
        return "Hello Moto!";
    }
}
