package com.example.CE3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favouritecolor")
public class ApiController {
    @GetMapping
    public String getMethod(@RequestParam String color) {
        return ("My favorite color is " + color + "!");
    }
}
