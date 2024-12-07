package com.app.ddd.controller.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HiController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
