package com.fleeklounge.example.todos.controllers;

import com.fleeklounge.example.todos.entities.Todo;
import com.fleeklounge.example.todos.services.TodoService;
import jakarta.websocket.server.PathParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fleeklounge.example.todos.models.CreateTodoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class TodoController {

    // set logback
    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);

    // service injection
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Todo>> index() {
        return ok(this.todoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable String id) {
        return ok(this.todoService.findById(id));
    }

    @PostMapping("/")
    public ResponseEntity<Todo> create(@RequestBody()CreateTodoModel model) {
        logger.info("title: " + model.getTitle());
        logger.info("description: " + model.getDescription());
        logger.info("done: " + model.isDone());
        return ok(this.todoService.create(model));
    }
}
