package org.example.thymeleaf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {
    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name" , defaultValue = "World") String name) {
        return sayHello(name);
    }
    public String sayHello(String name){
        String greeting = "你好你好， " + name;
        return greeting;
    }
}
