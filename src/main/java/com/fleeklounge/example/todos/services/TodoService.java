package com.fleeklounge.example.todos.services;

import com.fleeklounge.example.todos.entities.Todo;
import com.fleeklounge.example.todos.models.CreateTodoModel;

import java.util.List;

public interface TodoService {
    public List<Todo> findAll();
    public Todo findById(String id);
    public Todo create(CreateTodoModel todo);
}
