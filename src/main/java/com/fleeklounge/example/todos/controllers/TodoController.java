package com.fleeklounge.example.todos.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fleeklounge.example.todos.models.CreateTodoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class TodoController {

    // set logback
    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);

    @GetMapping("/")
    public ResponseEntity<String> index() {
        return ok("Hello, world!");
    }

    @PostMapping("/")
    public ResponseEntity<CreateTodoModel> create(@RequestBody()CreateTodoModel model) {
        logger.info("title: " + model.getTitle());
        logger.info("description: " + model.getDescription());
        logger.info("done: " + model.isDone());
        return ok(model);
    }
}
