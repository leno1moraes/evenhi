package com.backend.evenhi.evenhi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHelloWorld(){
        return "Hello Moto!";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi mapa";
    }

    @GetMapping("/hi-free-world")
    public String sayWithNoAuth(){
        return "Hi Free World (No Auth)";
    }

    @GetMapping("/guardian")
    public String sayGardian(){
        return "Hi guardian";
    }
}
