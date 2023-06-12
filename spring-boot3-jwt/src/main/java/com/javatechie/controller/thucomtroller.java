package com.javatechie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("/vtrung")
public class thucomtroller {
    @GetMapping("/test")
    public String getMethodName() {
        return "rererererer";
    }
    
    
}
