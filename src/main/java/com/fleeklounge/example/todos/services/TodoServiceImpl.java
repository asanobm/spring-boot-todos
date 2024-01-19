package com.fleeklounge.example.todos.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fleeklounge.example.todos.entities.Todo;
import com.fleeklounge.example.todos.models.CreateTodoModel;
import com.fleeklounge.example.todos.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("todoService")
public class TodoServiceImpl implements TodoService {

    final ObjectMapper mapper = new ObjectMapper();
    final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

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
        Todo entity = this.todoRepository.save(mapper.convertValue(todo, Todo.class));
        return entity;
    }
}
