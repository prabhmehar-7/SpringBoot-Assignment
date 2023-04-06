package com.RestFulService1.RestfulService.question1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question1 {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to springboot";
    }
}
