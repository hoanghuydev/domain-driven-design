package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
    }
//    Cái này để test thôi
    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
}