package com.fleeklounge.example.todos.repositories;

import com.fleeklounge.example.todos.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("todoRepository")
public interface TodoRepository extends JpaRepository<Todo, String> {
}

