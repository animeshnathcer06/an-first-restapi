package com.rest.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FaceController {

    @GetMapping(value = "/welcome")
    public String welcome(@RequestParam(value = "name", defaultValue = "Animesh Nath") String name) {
        return "Welcome to my site - " + name;
    }
}
