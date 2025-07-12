package com.example.todolist.Todolist.repo;

import com.example.todolist.Todolist.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
