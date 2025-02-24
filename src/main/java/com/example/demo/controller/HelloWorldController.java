package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Root route";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

}
