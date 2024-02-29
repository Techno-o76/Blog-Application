package com.jayesh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayesh.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
