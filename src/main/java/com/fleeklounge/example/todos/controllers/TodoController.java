package com.fleeklounge.example.todos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @GetMapping("/")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Hello, world!");
    }
}
