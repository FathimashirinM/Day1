package com.example.dayone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller2{
	@GetMapping("/name")
    public String getName() {
        String studentName = "Fathima"; // You can replace this with actual student name retrieval logic
        return "Welcome " + studentName + "!";
    }
}