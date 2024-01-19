package com.fleeklounge.example.todos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity()
@Table(name = "todos")
public class Todo {
    @Id
    private String id;
    private String title;
    private String description;
    private boolean done;
}
