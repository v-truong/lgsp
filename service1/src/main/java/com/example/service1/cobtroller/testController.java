package com.example.service1.cobtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testController {

    @RequestMapping
    public String heloo() {
        return"service 1 ";
    }
}
