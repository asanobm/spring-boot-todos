package com.fleeklounge.example.todos.models;

import lombok.Data;

@Data
public class CreateTodoModel {
    private String title;
    private String description;
    private boolean done;
}
