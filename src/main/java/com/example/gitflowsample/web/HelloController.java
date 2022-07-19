package com.example.gitflowsample.web;

import com.example.gitflowsample.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello() + " GitFlow Sample";
    }
}

