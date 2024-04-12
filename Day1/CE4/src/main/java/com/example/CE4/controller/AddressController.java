package com.example.CE4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CE4.model.Address;

@RestController
@RequestMapping("/address")
public class AddressController {
    @GetMapping
    public Address getMethod() {
        Address address = new Address("Main St", "123");
        return address;
    }
}
