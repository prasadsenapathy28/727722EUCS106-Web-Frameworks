package com.example.CE5.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.CE5.model.Family;

@RestController
@RequestMapping("/family")
public class FamilyController {
    @GetMapping
    //beanInjection
    // @Autowired
    // public Family family;

    //contructorInjection
    // public Family family;
    // public FamilyController(Family fam) {
    //     this.family = fam;
    // }
    public List<Family> getMethod() {
        List<Family> l = new ArrayList<>();
        l.add(new Family("John", 23));
        return l;
    }
}
