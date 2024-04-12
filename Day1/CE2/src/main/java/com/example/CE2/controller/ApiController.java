package com.example.CE2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/studentName")
    public String getMethodName(@RequestParam String studentName) {
        return ("Hello " + studentName + "!");
    }
}
