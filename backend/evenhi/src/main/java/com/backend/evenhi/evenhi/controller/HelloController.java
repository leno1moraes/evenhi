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

    @GetMapping("/instructions")
    public String instructions(){
        String texto;

        texto = "Instruções de Funcionamento \n";
        texto += " \n";
        texto += "1 - Obter o X-XSRF-TOKEN e colocar nos Headers do endpoint \n";
        texto += "endpoint: /event/add \n";
        texto += " \n";
        texto += "2 - Obter Autorization JWT e colocar nos Headers do endpoint \n";
        texto += "endpoint: /api/auth/public/signin \n";
        return texto;
    }
}
