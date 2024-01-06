package com.nithin.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nithin.todo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
