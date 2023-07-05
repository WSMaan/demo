package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {
    @GetMapping
    public String awsStatus(){return "Springboot Applivation for ECS";    }

    @GetMapping("/{name}")
    public String greet(@PathVariable String name){
        return name;
    }
}
