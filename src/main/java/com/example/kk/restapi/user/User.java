package com.example.kk.restapi.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    
    @GetMapping(path = "/users")
    public String getUsers() {
        return "Hello Karthikeyan";
    }
}
