package com.nithin.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nithin.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
