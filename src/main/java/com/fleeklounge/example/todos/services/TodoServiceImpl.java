package com.fleeklounge.example.todos.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fleeklounge.example.todos.entities.Todo;
import com.fleeklounge.example.todos.models.CreateTodoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("todoService")
public class TodoServiceImpl implements TodoService {

    final ObjectMapper mapper = new ObjectMapper();
    @Override
    public List<Todo> findAll() {
        return null;
    }

    @Override
    public Todo findById(String id) {
        return null;
    }

    @Override
    public Todo create(CreateTodoModel todo) {
        return mapper.convertValue(todo, Todo.class);
    }
}
